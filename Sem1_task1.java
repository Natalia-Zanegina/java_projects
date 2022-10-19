// Задача 1. Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;
public class Sem1_task1 {

    public static int triangularNum(int n) {
        return (n*n + n)/2;
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input number n: ");
        int num = iScanner.nextInt();
        int result = triangularNum(num);
        System.out.println(result);
        iScanner.close();
    }
}
