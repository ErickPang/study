package com.erick.study.reentrantlock.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Erick
 * @version : 1.0
 * @Description :
 * @time :2018-9-30
 */
public class ReentrantLockTryLock implements Runnable{

    private ReentrantLock reentrantLock = new ReentrantLock();

    private int i = 0;

    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                //设置等待时间为1秒
                if (reentrantLock.tryLock(1,TimeUnit.SECONDS)){
                    i++;
                    System.out.println(Thread.currentThread().getName()+"当前值："+i);
                    //设置休眠时间
//                    Thread.sleep(500);
                }else {
                    System.out.println(Thread.currentThread().getName()+"无法获取锁");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.printf("异常"+e.getMessage());
            } finally {
                if (reentrantLock.isHeldByCurrentThread()){
                    reentrantLock.unlock();
                }
            }
        }
    }
}
