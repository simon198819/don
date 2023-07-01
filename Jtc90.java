class Hello
{
    int a;
    int b;
    static int c=303;
    {
        System.out.println("IB in Hello");
        int a=101;
        int b=202;
        {
            System.out.println("local block in IB");
            int a1=111;
            int b1=222;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(this.a);
            System.out.println(this.b);
            System.out.println(a1);
            System.out.println(b1);
            System.out.println("local block in IB");
        }
    }
        static
        {
            System.out.println("SB in Hello");
            int a=101;
            int b=202;
            {
                System.out.println("local block in SB");
                int a1=111;
                int b1=222;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(a1);
                System.out.println(b1);
                System.out.println("local block in SB");
            }
        }
        Hello()
        {
            System.out.println("default constructor in Hello");
        }
        Hello(int a1,int b1)
        {
        }
        void m1()
        {
            System.out.println("m1 in Hello");
        }
    }
    class Jtc90
    {
        public static void main(String[]args)
        {
            Hello h1=new Hello();
            h1.m1();
        }
    }
