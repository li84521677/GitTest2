package com.example.demo.test;

/**
 * @author lihaoyun
 * @create 2018-10-18 14:29
 * @desc
 **/
public class MyThread extends Thread {


    private int count = 100 ;

    public MyThread(){
        super();
    }

    public MyThread(String name){
        super();
        this.setName(name);
    }

    @Override
     synchronized public void run() {
        super.run();
        while (count>0){
            count -- ;
            StringBuffer sb = new StringBuffer();
            sb.append("由"+MyThread.currentThread().getName()+"计算，count="+count);
            sb.append(" id:"+MyThread.currentThread().getId());
            sb.append(" name:"+MyThread.currentThread().getName());
            sb.append(" 优先级:"+MyThread.currentThread().getPriority());
            sb.append(" isAlive:"+MyThread.currentThread().isAlive());
            /*sb.append("线程"+MyThread.currentThread().getName()+"休眠");
            try {
                MyThread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }*/
            /*MyThread.currentThread().interrupt();
            MyThread.yield();*/


            System.out.println(sb.toString());
        }
    }

}
