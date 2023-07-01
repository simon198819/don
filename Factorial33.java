import java.util.*;
class Factorial33
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The No");
        int no=s.nextInt();
        int fact=1;
        {
            for(int i=1;i<=no;i++)
            {
                fact=fact*i;
            }
            System.out.println("factorial of"+no+"is"+fact);
        }
    }
}