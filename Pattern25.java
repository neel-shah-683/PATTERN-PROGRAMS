/*
    *******
    *     *
    * *** *
    * * * *
    * *** *
    *     *
    *******

 */
public class Pattern25 {
    public static void main(String[] args) {
     
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(i==4 && j==4)
                {
                    System.out.print(" ");
                    j++;
                }
                if((i==1 || i==7 || j==1 || j==7) || (i>=3 && i<=5 && j>=3 && j<=5))
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
