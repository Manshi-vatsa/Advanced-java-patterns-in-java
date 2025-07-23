import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {
        System.out.println("enter the legth of triangle");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if ((i+j)%2==0 || i+j==0) {
                        System.out.print("0");
                        
                    }
                    else{
                        System.out.print("1");
                    }
                    
                }
                System.out.println("\n");
        }
    }
}
