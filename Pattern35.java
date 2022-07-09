/*
    1
    62
    1073
    131184
    15141295
 */
public class Pattern35 {
    public static void main(String[] args) {
        
        int k=1,p;
        for(int i=1;i<=5;i++)
        {
            p=k;
            for(int j=1;j<=5;j++)
            {
                if(j<=i)
                {
                    System.out.print(p);
                    p=p-(5-i+j);
                    
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            k=k+1+5-i;
        }
    }
}
