class Hello
{
    int a;
    int b;
    static int c=30;;
    Hello(int a)
    {
        System.out.println("Hello(int a)");
        this.a=a;
    }
    Hello(int a,int b)
    {
        this(a);
        System.out.println("2 param constructor");
        this.a=a;
this.b=b;
    }
    Hello(int...a)
{
    System.out.println("Hello(int...a)");
}
void show()
{
    System.out.println("show in Hello");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
}
class Jtc88
{
    public static void main(String[]args)
    {
Hello h=new Hello();
Hello h1=new Hello();
Hello h2=new Hello();
h2.show();
    }
}