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
        
        int k=0,s=5,h=0;
        for(int i=1;i<=7;i++)
        {
            int l=4;
            if(i<=4)
            {
                if(i >= 2)
                {
                  h++; 
                }
                k++;
                s--;
            }
            else 
            {
                k--;
                s++;
                if(i<7)
                {
                    h--;
                }
               
            }
            for(int j=1;j<=7;j++)
            {
                int n=0;
                if(j>=k && j<=8-k)
                {
                    n=1;            
                    System.out.print(s);                    
                }
                if(j<=h || j>=8-h)
                {
                    n=1;
                    if(i>=2 && i<=6)
                    {
                        if(j<=4)
                        {
                            System.out.print(l);      
                            l--;              
                        }
                        else{
                            l++;
                            System.out.print(l);                    
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
