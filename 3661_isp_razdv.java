
import java.util.Scanner;
 
public class Splitter
{
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
 
        while(A != B)
        {
            if ((A % 2 == 0) && (A / 2 > B))
            {
                A = A / 2;
                System.out.print(":2"+"\n");
 
            }
            else
            {
                A = A - 1;
                System.out.print("-1"+"\n");
            }
        }
 
    }
}