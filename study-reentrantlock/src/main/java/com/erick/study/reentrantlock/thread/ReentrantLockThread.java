package com.erick.study.reentrantlock.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description :
 * @author : Erick
 * @version : 1.0
 * @time :2018-9-25
 */
public class ReentrantLockThread implements Runnable{

    private static ReentrantLock reentrantLock = new ReentrantLock();

    private int i = 0;

    public void run() {
        for (int j = 0; j < 10; j++) {
            reentrantLock.lock();
            try {
                i++;
                System.out.println("当前线程"+Thread.currentThread().getName()+"输出 i ：" + i);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
