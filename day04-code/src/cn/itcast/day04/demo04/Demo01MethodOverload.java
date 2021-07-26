package cn.itcast.day04.demo04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
//        System.out.println(sumTwo(10, 20));
//        System.out.println(sumThree(10, 20, 30));
//        System.out.println(sumFour(10, 20, 30, 40));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
//        System.out.println(sum(10, 20,30,40,50));
    }

    public static int sum(int a, int b) {
        System.out.println("The method with two parameters is running.");
        return a + b;
    }

    public static int sum(double a, int b) {
        System.out.println("The method with two parameters is running.");
        return (int) a + b;
    }

//    public static double sum(int a, int b) {
//        System.out.println("The method with two parameters is running.");
//        return a + b + 0.0;
//    }

//    public static int sum(int x, int y) {
//        return x +y;
//    }

    public static int sum(int a, int b, int c) {
        System.out.println("The method with three parameters is running.");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("The method with four parameters is running.");
        return a + b + c + d;
    }
}
