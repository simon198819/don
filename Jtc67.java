class Arith
{
    void sum1()
{
    System.out.println("sum1 in Arith");
}
void sum1(int a)
{
    System.out.println("sum1(int a)in Airth");
}
void sum1(byte b1)
{
    System.out.println("sum1(byte b1)in Airth");
}
void sum1(int a,byte b1)
{
    System.out.println("sum1(int a,byte b1)in Airth");
}
void sum1(byte b1,int a)
{
System.out.println("sum1(byte b1,int a)in Airth");
}
void sum1(int a,int b)
{
    System.out.println("sum 1(int a,int b)in Airth");
}
void sum1(int a,double d)
{
    System.out.println("sum1(int a,double d)in Airth");
}
void sum1(double d,int a)
{
    System.out.println("sum1(double d,int a)in Airth");
}
}
public class Jtc67
{
    public static void main(String[]args)
    {
        Arith ar=new Arith();
        ar.sum1();
        ar.sum1(111);
        ar.sum1((byte)111);
        ar.sum1(111,22.22);
        ar.sum1(22.22,111); 
    }
}