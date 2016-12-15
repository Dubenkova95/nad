import java.util.Scanner;

 
class DZ
{
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);
 
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        double e = sc.nextInt();
        double f = sc.nextInt();

        e= (100*c+d-100*a-b)% 100;
		f=(100*c+d-100*a-b)% 100;  
        {
			System.out.println(e,f);
		}
        