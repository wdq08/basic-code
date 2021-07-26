package cn.itcast.day05.demo01;

public class Demo04ArrayUse {
    public static void cutOffRule() {
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        cutOffRule();
        int num = array[1];
        System.out.println(num);
    }
}
