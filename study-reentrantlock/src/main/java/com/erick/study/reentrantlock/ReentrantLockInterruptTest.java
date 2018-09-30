package com.erick.study.reentrantlock;

import com.erick.study.reentrantlock.thread.ReentrantLockInterrupt;

/**
 * @Description :
 * @author : Erick
 * @time :2018-9-25
 */
public class ReentrantLockInterruptTest {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLockInterrupt reentrantLockInterrupt1 = new ReentrantLockInterrupt("1");
        ReentrantLockInterrupt reentrantLockInterrupt2 = new ReentrantLockInterrupt("2");
        //这里新定义两个线程Thread为了使用interrupt方法对线程进行中断
        Thread thread1 = new Thread(reentrantLockInterrupt1);
        Thread thread2 = new Thread(reentrantLockInterrupt2);
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        thread2.interrupt();
    }
}
