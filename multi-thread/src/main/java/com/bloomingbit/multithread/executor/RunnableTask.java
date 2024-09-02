package com.bloomingbit.multithread.executor;

import static java.lang.Thread.sleep;

// main 쓰레드와 별도로 동작하는 쓰레드
public class RunnableTask implements Runnable {

    private String name;
    private int sleepMs = 1000;

    public RunnableTask(String name) {
        this.name = name;
    }

    public RunnableTask(int sleepMs, String name) {
        this.sleepMs = sleepMs;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " 시작");
        try {
            sleep(sleepMs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " 완료");
    }


}
