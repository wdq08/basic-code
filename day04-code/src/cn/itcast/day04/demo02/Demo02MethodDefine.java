package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void cutOffRule() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
    }
    public static void main(String[] args) {
        //单独调用
        sum(10, 20);
        cutOffRule();
        //打印调用
        System.out.println(sum(10, 20));
        cutOffRule();
        //赋值调用
        int number = sum(15, 25);
        System.out.println("The value of the variable is:" + number);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
