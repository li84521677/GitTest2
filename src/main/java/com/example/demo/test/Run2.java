package com.example.demo.test;

/**
 * @author lihaoyun
 * @create 2018-10-18 14:38
 * @desc
 **/
public class Run2 {


    public static void main(String[] args) {


        MyThread me = new MyThread();

        Thread  a = new Thread(me,"A");
        Thread  b = new Thread(me,"B");
        Thread  c = new Thread(me,"C");
        Thread  d = new Thread(me,"D");

        d.setPriority(4);
        b.setPriority(10);


        a.start();
        b.start();
        c.start();
        d.start();

        d.setPriority(4);


    }


}
