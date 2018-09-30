package com.erick.study.reentrantlock;

import com.erick.study.reentrantlock.thread.ReentrantLockThread;


/**
 * @Description :
 * @author : Erick
 * @version : 1.0
 * @time :2018-9-25
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        //定义两个线程
        ReentrantLockThread reentrantLockThread1 = new ReentrantLockThread();
        ReentrantLockThread reentrantLockThread2 = new ReentrantLockThread();
        //调用run方法执行其实就是调用的接口方法，主线程运行在打印线程名称时都是main，
        //而使用Thread.start()则是新起一个线程进行调用，更新执行标识
//        reentrantLockThread1.run();
//        reentrantLockThread2.run();
        Thread thread1 = new Thread(reentrantLockThread1);
        Thread thread2 = new Thread(reentrantLockThread2);
        thread1.start();
        thread2.start();
    }
}
