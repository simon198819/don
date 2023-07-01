class Hai
{
void m1()
{
    System.out.println("m1 in Hello");
}
}
class Hello
{
    static Hai hai=new Hai();
    static Hai getHai()
    {
        System.out.println("getHAi()in Hello");
        return hai;
    }
}
class Jtc64
{
    public static void main(String[]args)
    {
        Hai hai=Hello.getHai();
        Hai hai1=Hello.getHai();
        System.out.println(hai.hashCode());
        System.out.println(hai1.hashCode());
    }
}