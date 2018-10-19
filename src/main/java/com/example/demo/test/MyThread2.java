package com.example.demo.test;

/**
 * @author lihaoyun
 * @create 2018-10-18 15:45
 * @desc
 **/
public class MyThread2 extends Thread {

    @Override
    public void run() {
        super.run();

        for (int i = 0; i <500000 ; i++) {
            if(this.isInterrupted()){
                System.out.println("已经是停止状态了，我要退出了");
                break;
            }
            System.out.println("i="+(i+1));
        }
        System.out.println("看到这句话，说明线程并未终止。。。");
    }
}
