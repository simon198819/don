public class MultipleCatchBlock3
{
    public static void main(String[]args)
    {
try
{
    int[5]=30/0;
    System.out.println(a[10]);
}
catch(ArithmeticException e)
{
        System.out.println("Arithmetic Exception occurs");
}
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("ArrayIndexOutOfBounds Exception occurs");
    }
catch(Exception e)
{
    System.out.println("Parent Exception Occurs");
}
System.out.println("rest of the code");
    }
