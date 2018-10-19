package com.example.demo.test;

/**
 * @author lihaoyun
 * @create 2018-10-18 15:48
 * @desc
 **/
public class Run3 {


    public static void main(String[] args) {

        MyThread2 me2= new MyThread2();
        me2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        me2.interrupt();
        System.out.println("end");

    }
}
