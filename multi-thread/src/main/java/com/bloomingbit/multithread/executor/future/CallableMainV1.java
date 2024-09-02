package com.bloomingbit.multithread.executor.future;

import static java.lang.Thread.sleep;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMainV1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // core, maximum 스레드 사이즈 1의 쓰레드 풀 생성 (ThreadPoolExecutor)
        // 쓰레드 풀을 생성하고 이를 다룰 수 있는 ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // 쓰레드 풀에 있는 쓰레드에 작업 위임
        // Callable을 실행, Runnable과 다르게 쓰레드 실행에 대한 반환값이 있다
        // 반환값은 Future로 받는다
        Future<Integer> future = executorService.submit(new MyCallable());
        Integer result = future.get();
        System.out.println("result value : " + result);
        executorService.shutdown();
    }

    // Int를 반환할거라 Integer
    static class MyCallable implements Callable<Integer> {

        // Runnable의 run과 동일
        // 반환값이 있고, 예외가 선언되어 있다 (check 예외)
        @Override
        public Integer call() throws Exception {
            System.out.println("Callable 시작");
            sleep(2000);
            int value = new Random().nextInt(10);
            System.out.println("Callable 완료");
            return value;
        }
    }
}
