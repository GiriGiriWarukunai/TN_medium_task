import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива чисел: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Введите массив чисел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Введите число, которое нужно найти в массиве: ");
        int x = scanner.nextInt();

        Search search = new Search();
        int res = search.binarySearch(a, x);
        if (res == -1){
            System.out.println("Число " + x + " не найдено");
        }
        else{
            System.out.println("Число " + x + " расположено по индексу " + res);
        }
    }
}
