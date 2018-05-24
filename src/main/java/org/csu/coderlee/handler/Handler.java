package org.csu.coderlee.handler;

import org.csu.coderlee.schedule.ISchedule;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by bixi.lx
 * @created on 2018 05 24 22:15
 */
@Component
public class Handler {

    private static final int HANDLER_THREAD_NUM = 8;

    private ExecutorService executorService;

    @PostConstruct
    public void startUp() {
        executorService = Executors.newFixedThreadPool(HANDLER_THREAD_NUM);
    }

    @PreDestroy
    public void shutdown() {
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public void execute(final ISchedule scheduleCallBack) {

        List<Callable<Integer>> tasks = new ArrayList<>();

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                 scheduleCallBack.callBack();
                 return 0;
            }
        };
        tasks.add(callable);
        try {
            executorService.invokeAll(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
