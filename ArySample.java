import java.util.Scanner;
class ArySample
{
    int[]a;
    void ReadArray()
    {
        a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<5;i++)
        {
        a[i]=sc.nextInt();
        }
    }
void PrintArray()
{
    System.out.println("Array elements are:");

    for(int i:a)
    System.out.println(i);
}
void FindAry()
{
    int b;
    System.out.println("Enter the element to be searched");
    Scanner sc=new Scanner(System.in);
    b=sc.nextInt();
    for(int i=0;i<5;i++)
{
    if(a[i]==b)
    {
    System.out.println("Element is found");
    break;
    }
}

      
}
public static void main(String[] args)
{
    ArySample obj=new ArySample();
    obj.ReadArray();
    obj.PrintArray();
    obj.FindAry();
}
}
    

