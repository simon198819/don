class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        super(str);
    }
}
public class TestThrow3
{
    public static void main(String[]args)
    {
        try{
            throw new UserDefinedException("This is user-defined exception");
            }
            catch(UserDefinedException ude)
            {
                System.out.println("Cought the exception");
                System.out.println(ude.getMessage());
            }
        }
    }
