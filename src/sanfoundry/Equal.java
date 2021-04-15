package sanfoundry;

class A
{
    public int i;
    protected   int j;
}
class B extends A
{
    int j;
    void display()
    {
        System.out.println("before " + i);
        super.i = 3;
        System.out.println("after " + i);
        System.out.println(i + " " + j);
    }
}
class Output
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.i=1;
        obj.j=2;
        obj.display();
    }
}