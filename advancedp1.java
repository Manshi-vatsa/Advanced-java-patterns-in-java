import java.util.Scanner;

public class advancedp1 {
   public static void main(String[] args) {
   System.out.println("enter the number");
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   for (int i = 1; i <= num; i++) {
     for (int j = 1; j <=i; j++) {
        System.out.print("*");
     }
     for (int j = 1; j <=(num-i)*2; j++) {
        System.out.print(" ");
     }
     for (int j = 1; j <=i; j++) {
        System.out.print("*");
      }
     System.out.println("\n");
   }
   for (int i = num; i >=1; i--) {
     for (int j = 1; j <=i; j++) {
        System.out.print("*");
     }
     for (int j = 1; j <=(num-i)*2; j++) {
        System.out.print(" ");
     }
     for (int j = 1; j <=i; j++) {
        System.out.print("*");
      }
     System.out.println("\n");
   }
   
}
}