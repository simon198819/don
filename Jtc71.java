class Hello
{
    void m1(byte b1)
    {
        System.out.println("m1(byte b1)in Hello");
    }
void m1(short s)
{
    System.out.println("m1(short s)in Hello");
    return;//Empty return Ststement
}
void m1(int i)
{
    System.out.println("m1(int i)in Hello");
}
void m1(long l)
{
    System.out.println("m1(long l)in Hello");
}
void m1(char ch)
{
    System.out.println("m1(char ch):"+ch);
}
}
class Jtc71
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        h1.m1(111);
        h1.m1(65);
        h1.m1((byte)111);
        h1.m1((short)111);
    }
}