package cn.itcast.day04.demo02;

public class Demo03MethodParam {
    public static void cutOffRule() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
    }

    public static void main(String[] args) {
        Method1(10, 20);
        cutOffRule();
        Method2();
    }

    //Method with parameter
    public static void Method1(int a, int b) {
        int result = a * b;
        System.out.println("The result is: " + result);
    }

    //Method without parameter
    public static void Method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,World!" + i);
        }
    }
}
