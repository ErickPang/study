package com.erick.study.reentrantlock.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Erick
 * @version : 1.0
 * @Description :
 * @time :2018-9-30
 */
public class ReentrantLockFair implements Runnable{

    private ReentrantLock reentrantLock = new ReentrantLock(true);

    public void run() {
        for (int j = 0; j < 10000; j++) {
            try {
                reentrantLock.lock();
                System.out.println(Thread.currentThread().getName()+"获取锁");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        }

    }
}
