class Hello
{
    int a=10;
    int b=20;
void m1()
{
    System.out.println("m1 in Hello");
}
void m1(int a)
{
    System.out.println("m1(int a)in Hello");
}
void m1(int...a)
{
    System.out.println("m1(int a)in Hello");
    System.out.println(a.length);
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
}
void m1(double d,int a)
{
  System.out.println("m1(double d,int a)in Hello");
}
void m2(int...a)
{
    System.out.println("m2 in Hello");
    System.out.println("a,length");
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
}
void m1(int a,int b)
{
    System.out.println("m2(int a,int b)in Hello");
}
}
class Jtc86
{
    public static void main(String[]args)
    {
        Hello h1=new Hello();
        h1.m1();
        h1.m1(111);
        h1.m1(11,22,33,44,55);
        h1.m2();
    }
}