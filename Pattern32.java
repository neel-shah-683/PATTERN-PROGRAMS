/*
        1
       A B
      1 2 3
     A B C D
 */
public class Pattern32 {
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++)
        {
            int k=1,s=1;
            char c = 'A';
            
            for(int j=1;j<=7;j++)
            {
                if(j>=5-i && j<=3+i && k==1)
                {
                    if(i%2==0)
                    {
                        System.out.print(c);
                        c++;
                        k=0;
                    }
                    else 
                    {
                        System.out.print(s);
                        s++;
                        k=0; 
                    }
                   
                }
                else 
                {
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println();
        }
    }
}
