/*
        A1
       AB12
      ABC123
     ABCD1234
 */
public class Pattern21 {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++)
        {
            char k = 64;
            int  s = 1;
            for(int j=1;j<=8;j++)
            {
                if(j>=5-i && j<=4+i)
                {
                    if(j<=4)
                    {
                        k++;
                        System.out.print(k);
                    }
                    else
                    {
                        System.out.print(s);
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
