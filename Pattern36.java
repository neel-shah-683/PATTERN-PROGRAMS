/*
    0
    01
    024
    0369
    0481216
 */
public class Pattern36 {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            int k=0,s=2;
    
            for(int j=1;j<=5;j++)
            {
                if(j<=i)
                {
                    if(j<=2)
                    {
                        System.out.print(k);
                        k = i - 1;
                    }
                    if(j>=3)
                    {
                        k = i - 1;
                        k = k * s;
                        System.out.print(k);
                        s++;
                    }
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
