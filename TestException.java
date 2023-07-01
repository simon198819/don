import java.io.*;
class Parent
{
void msg()
{
    System.out.println("parent method");
}
}
public class testExeptionChild extends Parent
{
    void msg()throws IOExeption
    {
        System.out.println("TestExeptionChild");
    }
    public static void main(String[]args)
    {
        Parent p=new TestExeptionChild();
        p.msg();
    }
}