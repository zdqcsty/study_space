package com.study.study_space.utils.bingfatest;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.slf4j.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class JdbcTemplate {

    private static Logger LOG = org.slf4j.LoggerFactory.getLogger(JdbcTemplate.class);

    public static void readSqlToQueue(String path, BlockingQueue queue) throws Exception {

        try (FileInputStream inputStream = new FileInputStream(path);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                queue.put(str);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        CommandLineParser commandLineParser = new BasicParser();
        Options options = new Options();
//        options.addOption("cycle", true, "cycle");
        options.addOption("thread", true, "thread");
        options.addOption("filePath", true, "filePath");
//        options.addOption("jdbcUrl", true, "jdbcUrl");
//        options.addOption("user", true, "user");
//        options.addOption("password", true, "password");
        CommandLine line = commandLineParser.parse(options, args);

        Properties prop = new Properties();
        prop.load(new FileReader("config.properties"));
        int cycle = Integer.parseInt(prop.getProperty("cycle"));
        int thread = Integer.parseInt(prop.getProperty("thread"));
        String filePath = prop.getProperty("filePath");
        String jdbcUrl = prop.getProperty("jdbcUrl");
        String user = prop.getProperty("user");
        String password = prop.getProperty("password");

        if (line.hasOption("thread")) {
            thread = Integer.parseInt(line.getOptionValue("thread"));
        }
        if (line.hasOption("filePath")) {
            filePath = line.getOptionValue("filePath");
        }


        Semaphore semaphore = new Semaphore(thread);

        BlockingQueue<String> queue = new ArrayBlockingQueue(500);

        for (int i = 0; i < cycle; i++) {
            readSqlToQueue(filePath, queue);
        }

        Executor executor = Executors.newCachedThreadPool();

        AtomicReference<Exception> ex = new AtomicReference<>();

        double start = System.currentTimeMillis();

        while (true) {
            String sql = queue.poll(2, TimeUnit.SECONDS);
            if (sql != null) {
                executor.execute(new RunSql(ex, semaphore, sql.trim(), jdbcUrl, user, password));
            } else {
                break;
            }
            if (ex.get() != null) {
                throw ex.get();
            }
        }

        while (true) {
            boolean b = semaphore.tryAcquire(thread, 5, TimeUnit.SECONDS);
            if (ex.get() != null) {
                throw ex.get();
            }
            if (b == true) break;
        }

        double end = System.currentTimeMillis();
        LOG.info("all cost time is " + (end - start) / 1000);

        System.exit(0);
    }
}
