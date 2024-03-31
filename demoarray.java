package day1;

public class demoarray {
    public static void main(String[] args) {
        car[] cars = new car[2];
        cars[0] = new car();
        cars[1] = new car("xyz", "abc", 1000000);
        System.out.println(cars[0].getPrice());
        System.out.println(cars[1].getPrice());

        // for(date type var : collection)
        for (car c : cars) {
            System.out.println(c);
        }

        System.out.println("\n*********************");

        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

    }

}