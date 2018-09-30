package com.erick.study.reentrantlock;

import com.erick.study.reentrantlock.thread.ReentrantLockTryLock;

/**
 * @author : Erick
 * @version : 1.0
 * @Description :
 * @time :2018-9-30
 */
public class ReetrantLockTryLockTest {
    public static void main(String[] args) {
        ReentrantLockTryLock reentrantLockTryLock = new ReentrantLockTryLock();
        Thread thread1 = new Thread(reentrantLockTryLock);
        Thread thread2 = new Thread(reentrantLockTryLock);
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}
