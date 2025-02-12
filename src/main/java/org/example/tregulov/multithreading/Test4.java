package org.example.tregulov.multithreading;

public class Test4 {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        System.out.println(myThread6.getName() + " " + myThread6.getPriority());

        MyThread6 myThread7 = new MyThread6();
        myThread7.setPriority(Thread.MAX_PRIORITY);
        myThread7.setName("thread-Anna");
        System.out.println(myThread7.getName() + " " + myThread7.getPriority());
    }
}

class MyThread6 extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}