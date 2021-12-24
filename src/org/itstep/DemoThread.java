package org.itstep;

public class DemoThread implements Runnable {

    protected String name;
    protected Thread t;

    public DemoThread(String name) {
        this.name = name;
        this.t = new Thread(this.name);
        System.out.println("We are created thread " + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + name + ": " + i );
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " ended");
    }

    public synchronized void increment() {

    }
}
