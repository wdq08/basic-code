package cn.itcast.day04.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }

    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            if ((i + 1) < 10) {
                System.out.println("Hello,World!0" + (i + 1));
            } else {
                System.out.println("Hello,World!" + (i + 1));
            }
        }
    }
}
