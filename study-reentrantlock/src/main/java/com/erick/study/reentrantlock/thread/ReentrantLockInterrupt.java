package com.erick.study.reentrantlock.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description :中断响应
 * @author : Erick
 * @time :2018-9-25
 */
public class ReentrantLockInterrupt implements Runnable{

    /**
     * 定义两个锁，模拟响应中断
     */
    private static ReentrantLock reentrantLock1 = new ReentrantLock();

    private static ReentrantLock reentrantLock2 = new ReentrantLock();

    /**
     * 增加一个标识表名哪个设置中断响应所
     */
    private String lockFlag;

    public ReentrantLockInterrupt(String lockFlag) {
        this.lockFlag = lockFlag;
    }

    public void run() {

        try {
            //lockFlag = 1则先设置reentrantLock1中断锁
            //否则reentrantLock2 设置中断锁
            if ("1".equals(lockFlag)){
                reentrantLock1.lockInterruptibly();
                Thread.sleep(500);
                reentrantLock2.lockInterruptibly();
                System.out.println("reentrantLock1执行");
            }else {
                reentrantLock2.lockInterruptibly();
                Thread.sleep(500);
                reentrantLock1.lockInterruptibly();
                System.out.println("reentrantLock2执行");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //要下判断是否获取当前线程的锁，若是则释放掉
            if (reentrantLock1.isHeldByCurrentThread()){
                reentrantLock1.unlock();
                System.out.printf("释放当前锁reentrantLock1");
            }
            if (reentrantLock2.isHeldByCurrentThread()){
                reentrantLock2.unlock();
                System.out.println("释放当前锁reentrantLock2");
            }
        }

    }
}
