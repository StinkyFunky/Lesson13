package org.itstep;

import Laba.Car;
import Practice.Operation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {
        // Потоки

//        Thread t1 = new ThreadSample("первый поток");
//        Thread t2 = new ThreadSample("второй поток");
//
//        t1.start();
//        t2.start();
//
//        ThreadRunnable tr1 = new ThreadRunnable("1 potok na osnove runnable");
//        ThreadRunnable tr2 = new ThreadRunnable("2 potok na osnove runnable");
//
//        Thread t1tr = new Thread(tr1);
//        Thread t2tr = new Thread(tr2);
//
//        t1tr.start();
//        t2tr.start();
//
//        AtomicInteger a = new AtomicInteger(10);
//        AtomicBoolean b = new AtomicBoolean(true);
//
//        DemoThread d1 = new DemoThread("First");
//        DemoThread d2 = new DemoThread("Second");
//        DemoThread d3 = new DemoThread("Third");
//
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//            System.out.println("Thread interrupted");
//        }
//        System.out.println("Main thread ended");


//        Thread operation1 = new Operation("operation 1", 4);
//        Thread operation2 = new Operation("operation 2", 5);
//        Thread operation3 = new Operation("operation 3", 6);
//        Thread operation4 = new Operation("operation 4", 7);
//        Thread operation5 = new Operation("operation 5", 8);
//
//        operation1.start();
//        operation2.start();
//        operation3.start();
//        operation4.start();
//        operation5.start();

        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Audi", 220, 800);
        Car car2 = new Car("BMW", 250, 700);
        Car car3 = new Car("Tesla", 200, 600);
        Car car4 = new Car("Nissan", 300, 550);


        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        try {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        cars.stream().sorted(comparing(Car::getTime)).
                forEach(c -> System.out.println(c.getNameCar() + " " + c.getTime() + " seconds"));
    }
}
