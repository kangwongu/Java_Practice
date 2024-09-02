package com.bloomingbit.multithread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;


public abstract class ExecutorUtils {

    public static void printState(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor threadPoolExecutor) {
            int pool = threadPoolExecutor.getPoolSize();
            // 작업중인 쓰레드 개수
            int active = threadPoolExecutor.getActiveCount();
            // 큐에서 대기중인 작업 개수 (쓰레드 수 이상의 작업이 들어오면, 큐에 담긴다)
            int queueSize = threadPoolExecutor.getQueue().size();
            long completedTaskCount = threadPoolExecutor.getCompletedTaskCount();
            System.out.println("[pool="+pool+", active="+active+", queue="+queueSize+", completedTaskCount="+completedTaskCount+"]");
        } else {
            System.out.println(executorService);
        }
    }

}
