package duoxiancheng;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskWithResult implements Callable<String> {
    protected int countDown = 100000;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public TaskWithResult() {}

    public TaskWithResult(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public String call() throws Exception {
        while (countDown-- > 0) {
            Thread.yield();
        }

        return String.valueOf(id);
    }


    private static void testCallable() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new TaskWithResult()));
        }

        ArrayList<Future<String>> tmpList = new ArrayList<Future<String>>();
        while (true) {
            for (Future<String> fsFuture : results) {
                try {
                    if (fsFuture.isDone()) {
                        // 如果线程done，就调用get函数获取返回值。
                        System.out.println(fsFuture.get());
                        // 并将完成的线程加入到tmplist中，便于在for循环后删除。
                        tmpList.add(fsFuture);
                    }
                } catch (Exception e) {
                } finally {
                    executorService.shutdown();
                }
            }

            // 删除done的线程。
            results.removeAll(tmpList);
        tmpList.clear();

        // 如果所有的线程都done，就退出程序。
        if (0 == results.size()) {
            break;
        }
    }
    }


}
