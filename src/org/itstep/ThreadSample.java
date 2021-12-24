package org.itstep;

public class ThreadSample extends Thread {

    String name;

    public ThreadSample(String name) {
        this.name = name;
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
    }
}
