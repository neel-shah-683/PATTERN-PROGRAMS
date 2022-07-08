/*
        A
       CB
      FED
     JIHG
    ONMLK
 */
public class Pattern30 {
    public static void main(String[] args) {
        
        char k=64,p;
        for(int i=1;i<=5;i++)
        {
            k+=i;
            p=k;
            for(int j=1;j<=5;j++)
            {
                if(j>=6-i)
                {
                    System.out.print(p);
                    p--;
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
