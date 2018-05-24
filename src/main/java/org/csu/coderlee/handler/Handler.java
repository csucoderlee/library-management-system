package org.csu.coderlee.handler;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.callback.Callback;
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

    public void execute() {

        List<Callable<Integer>> tasks = new ArrayList<>();

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //todo 这里要抽象一套逻辑出来，每个定时任务都会执行不同的逻辑策略
                System.out.println("call call call");
                return null;
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
