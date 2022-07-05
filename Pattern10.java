/*
    ABCDCBA
    ABC CBA
    AB   BA
    A     A
 */
public class Pattern10 {
    public static void main(String[] args) {
        char k;
        for(int i=1;i<=4;i++)
        {
            k = 'A';
            for(int j=1;j<=7;j++)
            {
                if(j<=5-i || j>=3+i)
                {
                    if(j < 4)
                    {
                        System.out.print(k);
                        k++;
                    }
                    else
                    {
                        System.out.print(k);
                        k--;
                    }
                    
                }
                else 
                {
                    System.out.print(" ");
                    if(j == 4)
                    {
                        k--;
                    }
                }
            }
            System.out.println();
        }
    }
}
