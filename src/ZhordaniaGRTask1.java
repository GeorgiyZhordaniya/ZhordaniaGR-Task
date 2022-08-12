import java.util.Scanner;

public class ZhordaniaGRTask1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество членов последовательности Фибоначчи: ");
        int n = in.nextInt();
        System.out.println();

        int[] fib = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0)
                fib[i] = 0;
            else if (i == 1)
                fib[i] = 1;
            else
                fib[i] = fib[i-2] + fib[i-1];
            System.out.print(fib[i] + " ");
        }
    }
}




