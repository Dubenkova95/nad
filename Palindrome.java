import java.util.Scanner;
 
public class Palindrome
{
    public static void main(String[] args)
    {
 
        Scanner sc = new Scanner(System.in);
 
        String str = sc.nextLine().replaceAll(" ","");
        String revers_str = new StringBuffer(str).reverse().toString();
 
        if(str.equals(revers_str) == true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
 
    }
}