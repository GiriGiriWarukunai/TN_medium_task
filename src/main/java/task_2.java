import java.util.ArrayList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива чисел: ");
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        System.out.print("Введите массив чисел: ");
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        FindDups findDups = new FindDups();
        System.out.print(findDups.findDups(a));
    }
}
