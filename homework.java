public class java {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i <= n + 1; i++) {

            for (int j = i; j <= n; j++) {
                System.out.println("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}