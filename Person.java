public class Person
{
    String name;
    int age;
    String sex;
    String height;
    String weight;
    public void eat(String string)
    {
        System.out.println(string);
    }
    public void fight(String string) {
        
        System.out.println(string);
        
    }
    public static void main(String args[])
    {
        Person obj=new Person();
        obj.eat("KFC");
        obj.fight("YOU");
    }
}