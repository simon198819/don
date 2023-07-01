public class NestedTryBlock2
{
    public static void main(String[]args)
    {
        try{
            try
            {
                try
                {
                    int arr[]={1234};
                    System.out.println(arr[10]);
                }
                catch(ArithmeticException e)    
                {
                    System.out.println("Arithmetic exception");
                System.out.println("inner try block 2");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
            System.out.println("inner try block 1");
        }
    }
    catch(ArrayIndexOutOfBoundsException e4)
    {
            System.out.println(e4);
            System.out.println("outer(main)try block");
    }
    catch(Exception e5)
    {
        System.out.println("Exception");
        System.out.println("handled in main try block");
    }
    }
    }
