/*
        6543210
        543210
        43210
        3210
        210
        10
        0
 */
public class Pattern15 {
    
    public static void main(String[] args) {
     
        for(int i=1; i<=7;i++)
        {
            int k = 8 - i;
            for(int j=1;j<=7;j++)
            {
                k--;                
                if(j<=8-i)
                {
                    System.out.print(k);                
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
