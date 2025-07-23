import java.util.*;

public class problem1 {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the bredth of rectangle");
    int bredth =sc.nextInt();
    
   
    System.out.println("enter the lenght of rectangle");
    
    int lenght=sc.nextInt();

    // problem 1 solution
    // for (int i = 0; i < lenght; i++) {
    //    for (int j = 0; j <  bredth +1; j++) {
    //     System.out.print("*" + " ");
        
    //    }
    //    System.out.println("\n");
        
    // }

    //problem 2 solution
    // for (int i = 0; i < lenght+1; i++) {
    //    if(i==0 || i== lenght){
    //     for (int j = 0; j < bredth; j++) {
    //         System.out.print("*" + " ");
            
    //     }
    //     System.out.println("\n");

    //    }
    //    else{
    //     for (int j = 0; j <= bredth; j++) {
    //         if (j==0 || j== bredth) {
    //             System.out.print("*" );
    //         }
    //         else{
    //             System.out.print(" " +" ");
    //         }
    //     }
    //     System.out.println("\n");
    //    }
        
    // }


    //problems 3 solution
    // for (int i = 0; i < lenght; i++) {
    //     for (int j = 0; j < i; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println("\n");
    // }
   //problem 4 solution
   for (int i = lenght; i >0; i--) {
  for (int j = 0; j >i; j++) {
    System.out.print("*");
}
System.out.println("\n");
    
   }

}
    
}