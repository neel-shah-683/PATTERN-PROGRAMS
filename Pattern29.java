/*
    1
    3*2
    4*5*6
    10*9*8*7
    11*12*13*14*15 // CHALLENGING
 */
public class Pattern29 {
    public static void main(String[] args) {
        
        int k=0,p;
        for(int i=1;i<=5;i++)
        {       
            if(i%2==1)
            {
                k++;
            } 
            else 
            {
                k--;
                k = k + i;
            }
            p=k;
            for(int j=1;j<=9;j++)
            {
                if(j<=i*2-1)
                {
                    if(j%2==0)
                    {
                        System.out.print("*");
                    }
                    else 
                    {
                        
                        System.out.print(p);
                        if(i%2==1)
                        {
                            p++;
                            k++;
                        }
                        else
                        {
                            p--;
                        }
                        
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
