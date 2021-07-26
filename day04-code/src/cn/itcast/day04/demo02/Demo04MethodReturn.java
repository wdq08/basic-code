package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void cutOffRule() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
    }

    public static void main(String[] args) {
        int num = getSum(10, 20);
        System.out.println("The returned value is: " + num);
        cutOffRule();
        printSum(100, 200);
        cutOffRule();
        System.out.println(getSum(2, 3));
        getSum(3, 5);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println("The answer is: " + result);
    }
}
