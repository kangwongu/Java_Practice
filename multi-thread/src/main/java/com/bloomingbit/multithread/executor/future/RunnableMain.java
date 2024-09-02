package com.bloomingbit.multithread.executor.future;

import static java.lang.Thread.sleep;

import java.util.Random;

// 임의로 쓰레드 하나 만들기
public class RunnableMain {

    public static void main(String[] args) throws InterruptedException {
        // 쓰레드 임의 생성
        MyRunnable task = new MyRunnable();
        Thread thread = new Thread(task, "Thread-1");
        thread.start();
        // 임의로 생성해 실행시킨 쓰레드가 종료될 때까지 대기
        thread.join();

        // 임의로 생성한 쓰레드가 작업한 내용을 받아오기 위해 위에서 join으로 대기함
        int result = task.value;
        System.out.println("result value : " + result);
    }

    // 랜덤 정수를 할당받는 쓰레드
    static class MyRunnable implements Runnable {

        // Runnable은 반환값이 없기 때문에, 공유 변수를 둔다
        int value;

        @Override
        public void run() {
            System.out.println("Runnable 시작");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            value = new Random().nextInt(10);
            System.out.println("create value : " + value);
            System.out.println("Runnable 완료");
        }
    }

}
