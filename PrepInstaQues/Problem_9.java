import java.util.Scanner;

public class Problem_9 {
    //Prime number within a given range
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0 ;
        for (int i = a; i <= b ; i++) {
            if (i < 2){
                System.out.println(i);
            }
            else {
                for (int j = 1; j <=i; j++) {
                    if (i % j == 0){
                        count++;
                    }
                }
                if (count <= 2) {
                    System.out.println(i);
                }
            }
        }
    }
}
