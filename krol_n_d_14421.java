import java.util.Scanner;

public class Rabbit
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long d;      
        long n1 = 1; 
        long n2 = 1; 


        for(int month = 3; month <= N; month++)
        {
            d = n1 * K;
            n1 = n2;
            n2 = d + n1;
        }

        System.out.print(n2);
    }
}
