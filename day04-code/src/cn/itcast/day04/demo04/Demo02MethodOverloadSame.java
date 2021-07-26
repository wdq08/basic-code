package cn.itcast.day04.demo04;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short) 20, (short) 20));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,10L));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("The method with byte parameter is running!");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("The method with short parameter is running!");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("The method with int parameter is running!");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("The method with long parameter is running!");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
