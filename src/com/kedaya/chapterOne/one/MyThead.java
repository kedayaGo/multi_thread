package com.kedaya.chapterOne.one;

public class MyThead extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
