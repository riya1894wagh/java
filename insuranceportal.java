package day1;

import day1.car;

public class insuranceportal {

    public static void main(String[] args) {
        car car = new car();
        System.out.println(car);

        car.setPrice(1600000);
        System.out.println(car.getPrice());

        car car1 = new car("Honda", "Elevate", 200000, 2023);
        System.out.println(car1);

        // Static methods are invoked as ClassName.methodName
        car.displayCount();
    }
}