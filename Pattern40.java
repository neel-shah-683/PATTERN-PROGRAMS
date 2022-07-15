/*
            *
           **
          * *
         *  *
        *   *
       *    *
      *     *
     *      *
    *********
 */
import java.util.Scanner;

public class Pattern40 {
    
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter Number of Rows: ");

        int num = sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            
            for(int j=1;j<=num;j++)
            {
                if(i==num)
                {
                    if(j>=num+1-i && j<=num)
                    {
                        System.out.print("*");
                    }
                }
                else if(j==num+1-i || j==num)
                {
                    System.out.print("*");
                }
                else 
                {  
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
