package cn.itcast.day04.demo03;

public class Demo04MethodNotice {
    public static void main(String[] args) {

    }

    public static int method1() {
        return 10;
    }

    public static void method2() {
//        return 10;
        return;
    }

    public static void method3() {
        System.out.println("AAA");
        System.out.println("BBB");
//        return;
    }

    public static int getMax(int a, int b) {
//        int max;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        return max;

        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
