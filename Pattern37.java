/*
    4444444
    4333334
    4322234
    4321234
    4322234
    4333334
    4444444
 */
public class Pattern37 {
    public static void main(String[] args) {

        int k=0,s=5;
        for(int i=1;i<=7;i++)
        {
            int h=5;
            if(i<=4)
            {
                k++;
                s--;
            }
            else 
            {
                k--;
                s++;
            }
            for(int j=1;j<=7;j++)
            {
                int n=0;
                if(j>=k && j<=8-k)
                {
                    n=1;            
                    System.out.print(s);                    
                }
                if(j<=i-1 || j>=9-i)
                {
                    n=1;
                    if(i>=2 && i<=4)
                    {
                        if(j < 5)
                        {
                            h--;
                            System.out.print(h);                            
                        }
                        else 
                        {
                            System.out.print(h);                            
                            h++;
                        }
                    }
                }
                if(j<=2 || j>=6)
                {
                    n=1;
                    if(i==5)
                    {
                        if(j < 5)
                        {
                            h--;
                            System.out.print(h);                            
                        }
                        else 
                        {
                            System.out.print(h);                            
                            h++;
                        }                          
                    }
                }
                if(j<=1 || j>=7)
                {
                    n=1;
                    if(i==6)
                    {
                        if(j < 5)
                        {
                            h--;
                            System.out.print(h);                            
                        }
                        else 
                        {
                            System.out.print(h);                            
                            h++;
                        }
                    }
                }
                if(n==0)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
