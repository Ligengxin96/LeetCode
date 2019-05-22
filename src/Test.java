public class Test {

    public static int foo(int n){
        if (n<2){
            return n;
        }
            return foo(n-2) + foo(n-1);
    }

    public static void main(String[] args) {
        System.out.println(foo(5));
    }
}
