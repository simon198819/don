class Hello
{
    int a=10;
void m1()
{
    System.out.println("m1 in Hello");
    int a=20;
    {
        System.out.println("local block in m1");
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(a);
    }
}}
class Jtc91
{
    public static void main(String[]args)
    {
    Hello h1=new Hello();
    h1.m1();
}
}