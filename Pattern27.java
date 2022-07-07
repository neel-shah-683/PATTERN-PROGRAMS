/*
    A
    BA
    CBA
    DCBA
 */
public class Pattern27 {
    public static void main(String[] args) {

        char k = 64;
        for(int i=1;i<=4;i++)
        {
            k+=i;
            for(int j=1;j<=4;j++)
            {
                if(j<=i)
                {
                    System.out.print(k);
                    k--;        
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
