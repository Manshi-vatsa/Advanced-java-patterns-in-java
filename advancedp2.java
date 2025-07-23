import java.util.Scanner;

public class advancedp2 {
    public static void main(String[] args) {
        System.out.println("enter then lenght of figure");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=num; j++) {
                System.out.print("*");
            }

        System.out.println("\n");
        }
    }
}
