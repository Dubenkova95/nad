import java.util.Scanner;
 
class BankProc
{
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);
 
        double x = sc.nextInt();
        int p = sc.nextInt();
        int y = sc.nextInt();
 
        int year=0;
 
        while (x<y)
        {
            x=(Math.floor((x+(x/100*p))*100))/100;
            year++;
        }
 
        System.out.println(year);
    }
 
}