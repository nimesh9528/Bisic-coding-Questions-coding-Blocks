abstract class abstractCatDog {
    abstract void cats();
    abstract void dogs();
    public static void main(String[] v)
    {
        cat c=new cat();
        c.cats();
        dog d=new dog();
        d.dogs();
    }
}
class cat extends abstractCatDog
{
    void cats()
    {
        System.out.println("cats meow");
    }
    void dogs(){}
}
class dog extends abstractCatDog
{
    void cats(){}
    void dogs()
    {
        System.out.println("dogs barks");
    }
}
