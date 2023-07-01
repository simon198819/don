class Jtc3
{
    public static void main(String[]args){
    byte by1=123;
    OverloadManager mngr=new OverloadManeger();
    mngr.show(12,by1);
    mngr.show(by1,123);
    mngr.show((int)by1,by1);
    mngr.show(by1,(int)by1);
    String str=null;
    Object obj=null;
    int arr[]=null;
    mngr.display(str);
    mngr.display(obj);
    mngr.display(arr);
    mngr.display(null);
    mngr.showValues(str);
    mngr.showValues((String)null);
    mngr.showValues((int[])null);
}
}
class OverloadManager
{
    void show(int ab,byte b1)
    {
        System.out.println("**show(int,byte)**");
    }
void show(byte b1,int ab)
{
    System.out.println("**_(byte,int)**");
}
    void display(String str)
    {
        System.out.println("__display(String)_");
    }
    void display(Object obj)
    {
        System.out.println("-display(Object)_");
    }
    void showValues(String str)
    {
        System.out.println("--showValue(String)--");
    }
    void showValues(int[]arr)
{
        System.out.println("--showValues(int[])--");
}
}
    
    
    
    

    

