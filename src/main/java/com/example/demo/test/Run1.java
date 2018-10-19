package com.example.demo.test;

/**
 * @author lihaoyun
 * @create 2018-10-18 14:38
 * @desc
 **/
public class Run1 {


    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();



    }


}
