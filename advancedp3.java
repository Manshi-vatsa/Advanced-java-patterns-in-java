import java.util.Scanner;

public class advancedp3 {
    public static void main(String[] args) {
        System.out.println("enter the number of rows in pyramid");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1 ; i <= num; i++) {
            for (int j = 0; j <num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + " ");
            }
           System.out.println("\n"); 
        }
        
    }
}
