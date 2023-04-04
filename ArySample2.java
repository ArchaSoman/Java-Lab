import java.util.Scanner;
class ArySample2
{
    int[][]a;
    void ReadArray()
    {
        a=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<3;i++)
         
        {
            for(int j=0;j<3;j++) {
        a[i][j]=sc.nextInt();
        }
    }
    }

void PrintArray()
{
    System.out.println("Array elements are:");
    for(int i=0;i<3;i++)
         
    {
        for(int j=0;j<3;j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
}
}
      

public static void main(String[] args)
{
    ArySample2 obj=new ArySample2();
    obj.ReadArray();
    obj.PrintArray();
    
} 
}
    

