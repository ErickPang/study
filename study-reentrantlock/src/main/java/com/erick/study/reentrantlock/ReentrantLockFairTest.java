package com.erick.study.reentrantlock;

import com.erick.study.reentrantlock.thread.ReentrantLockFair;

/**
 * @author : Erick
 * @version : 1.0
 * @Description :
 * @time :2018-9-30
 */
public class ReentrantLockFairTest {

    public static void main(String[] args) {
        ReentrantLockFair reentrantLockFair = new ReentrantLockFair();
        Thread thread1 = new Thread(reentrantLockFair);
        Thread thread2 = new Thread(reentrantLockFair);
        thread1.start();
        thread2.start();
    }
}
