/*
    1
   232
  34543
 4567654
 */
public class Pattern14 {
    
    public static void main(String[] args) {
        
        int k = 0;
        for(int i=1; i<=4;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(j>=5-i && j<=3+i)
                {
                    if(j <= 4)
                    {
                        k++;
                        System.out.print(k);
                    } 
                    if(j>=5)
                    {
                        k--;
                        System.out.print(k);
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
