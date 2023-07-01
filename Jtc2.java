class Jtc2
{
    public static void main(String[]args)
    {
        int ab=90;
        System.out.println("ab in main Before\t:"+ab);
        Mno ref=new Mno();
        ref.showValue(ab);
        System.out.println("ab in Main after|t:"+ab);
    }
}
class Mno
{
void showValue(int ab)
{
    System.out.println("Before show Value\t"+ab);
    if(ab!=0)
    showValue(ab/10);
System.out.println("After showValue\t:"+ab);
}    
}
