/*
          0
         121
        23432
       3456543
      456787654
     56789098765
    6789012109876
   789012343210987
  89012345654321098
 9012345678765432109
012345678909876543210
 9012345678765432109
  89012345654321098
   789012343210987
    6789012109876
     56789098765
      456787654
       3456543
        23432
         121
          0
 */
public class Pattern26 {
 public static void main(String[] args) {
    int m=0,k=0;
    for(int i=1;i<=21;i++)
    {
        if(i<=11)
        {
            m++;
        }
        else 
        {
            m--;
        }
        k=m-1;
        for(int j=1;j<=21;j++)
        {
            if(j>=12-m && j<=10+m)
            {
                if(j<11)
                {
                    System.out.print(k%10);
                    k++;
                }
                else 
                {
                    System.out.print(k%10);
                    k--;
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
