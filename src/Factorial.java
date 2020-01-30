public class Factorial {

    public static int factor(int n){

        if (n == 0) return 1;
        return n * factor(n-1);
    }

    public static void main(String[] args) {
        int n = factor(10);
        System.out.println(n);
    }

}

