
abstract class printAbstract {
    printAbstract()
    {
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void a_methord()
    {
        System.out.println("This is normal methord of abstract class ");
    }
    public static void main(String[] v)
    {
        B b=new B();
        b.a_method();
    }
}
class B  extends printAbstract
{
    
    void a_method()
    {
        System.out.println("This is abstract methord");
    }
}
