import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

           int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            System.out.println("choose operation");
            String op = new Scanner(System.in).nextLine();

            if (op.equals("+")) {
                add(a,b);
            } else if (op.equals("-")) {
                extract(a,b);
            } else if (op.equals("*")) {

                multiply(a,b);
            }
            else if (op.equals("/")) {

                divide(a,b);
            }
        }

    public static void add(int a, int b){

        System.out.println(a+b);

    }

    public static void extract(int a, int b){

        System.out.println(a-b);

    }
    public static void multiply (int a, int b){

        System.out.println(a*b);

    }
    public static void divide(int a, int b){

        System.out.println(a/b);

    }

}