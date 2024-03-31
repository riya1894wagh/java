package day2;

public class calculator {

    public static void main(String[] args) {
        int res = math.add(34, 45);
        System.out.println(res);

        System.out.println(math.add(10.5f, 10));

        res = math.addition(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(res);

        int a = 12;
        int b = 15;
        math.swap(a, b);
        System.out.println("After Swapping a : " + a + " b : " + b);

        int n[] = { 12, 15 };

        math.swap(n);
        System.out.println("After Swapping a : " + n[0] + " b : " + n[1]);
    }

}