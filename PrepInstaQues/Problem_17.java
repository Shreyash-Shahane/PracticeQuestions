import java.util.Scanner;

public class Problem_17 {
    // Factor of a number
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    for (int i = 1; i <=number; i++) {
        if (number%i == 0) {
            System.out.println(i);
        }
    }
}
}
