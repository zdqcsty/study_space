package com.study.study_space.utils;

import org.apache.commons.cli.*;

public class CommonsCli {

    public static void main(String[] args) throws ParseException {

        CommandLineParser commandLineParser = new BasicParser();
        Options options = new Options();
        options.addOption("srcSouce", false, "srcSouce");
        options.addOption("dstSource", false, "dstSource");
        CommandLine line = commandLineParser.parse(options, args);
        if (line.hasOption("srcSource")) {
            String srcSource = line.getOptionValue("srcSource");
        }
        if (line.hasOption("dstSource")) {
            String dstSource = line.getOptionValue("dstSource");
        }
    }

}
