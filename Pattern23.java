/*
    1
   12A
  123AB
 1234ABC
 */
public class Pattern23 {
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++)
        {
            int s = 1;
            char k = 64;
            for(int j=1;j<=7;j++)
            {
                if(j>=5-i && j<=3+i)
                {
                    if(j<=4)
                    {
                        System.out.print(s);
                        s++;                       
                    }
                    else
                    {
                        k++;
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
