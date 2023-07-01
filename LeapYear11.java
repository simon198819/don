import java.util.*;
class LeapYear11
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        System.out.println("Enter the Year");
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                System.out.println("leap year");
            }
            else
            {
                System.out.println("Not a leap year");
            }
        }
        else
        {
            System.out.println("leap year");
        }
    }
    else
    {
        System.out.println("Not a Leap Year");
    }
}
}