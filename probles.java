import java.util.Scanner;

public class probles {
    public static void main(String[] args) {
        System.out.println("enter the legth of triangle");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number++;
                
            }
            System.out.println("\n");
            
        }
    }
}
