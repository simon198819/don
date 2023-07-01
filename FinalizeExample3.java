public class FinalizeExample3
{
    public static void main(String[]args)
    {
        FinalizeExample3 obj=new FinalizeExample3();
        System.out.println("Hashcode is:"+obj.hashCode());
        obj=null;
        System.gc();
        System.out.println("End of the garbage collection");
    }
    protected void finalize()
    {
        System.out.println("Called the finalize()method");
    }
}
