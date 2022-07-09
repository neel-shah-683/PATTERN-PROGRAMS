/*
                *
               **
              ***
              |**
            * | *
            **|
            ***
            **
            *
 */
public class Pattern31 {
 public static void main(String[] args) {
    
    int k;
    for(int i=1;i<=9;i++)
    {
        for(int j=1;j<=5;j++)
        {
            //1ST CASE
            if(i<=3)
            {
                if(j>=6-i)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" "); 
                }
            } 

            //2ND CASE
            else if(i>=4 && i<=6)
            {
                k=0;
                if(j==3)
                {
                    k=1;
                    System.out.print("|");
                }
                if(j>=i)
                {
                    k=1;
                    System.out.print("*");  
                }
                if(j<=i-4)
                {
                    k=1;
                    System.out.print("*");   
                }
                if(k==0)
                {
                    System.out.print(" ");
                }
            }
            
            //3RD CASE
            else if(i>=7)
            {
                if(j<=10-i)
                {
                    System.out.print("*");
                }
                else 
                {
                System.out.print(" ");
                }
            }
            
        }
        System.out.println();
    }
 }   
}
