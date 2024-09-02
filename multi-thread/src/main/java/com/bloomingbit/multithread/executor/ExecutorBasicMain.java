package com.bloomingbit.multithread.executor;

import static java.lang.Thread.sleep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorBasicMain {

    public static void main(String[] args) throws InterruptedException {
        // 쓰레드 풀을 생성하고 이를 다룰 수 있는 ExecutorService
        ExecutorService executorService = new ThreadPoolExecutor(2,2,0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        // 초기는 0, 실제 작업이 할당되면 그 때 스레드를 만들고 스레드 풀에 담긴다 -> 이후부터 재사용
        System.out.println("=== 초기 상태 ===");
        ExecutorUtils.printState(executorService);

        // 작업 수행
        executorService.execute(new RunnableTask("taskA"));
        executorService.execute(new RunnableTask("taskB"));
        executorService.execute(new RunnableTask("taskC"));
        executorService.execute(new RunnableTask("taskD"));
        System.out.println("=== 작업 수행 중 ===");
        ExecutorUtils.printState(executorService);

        sleep(3000);
        System.out.println("=== 작업 완료 ===");
        ExecutorUtils.printState(executorService);

        System.out.println("=== 작업 완료 ===");
        ExecutorUtils.printState(executorService);
    }

}
