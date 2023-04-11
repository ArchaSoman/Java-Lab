import java.util.Scanner;
class MatrixAdd
{
    int[][]a,b,c;
    void ReadArray()
    {
        a=new int[3][3];
        b=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of the first matrix"+a);
        for(int i=0;i<3;i++)
         
        {
            for(int j=0;j<3;j++) {
        a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element of the second matrix"+b);
        for(int i=0;i<3;i++)
         
        {
            for(int j=0;j<3;j++)
            {
            b[i][j]=sc.nextInt();
        }
    }
    }

void PrintArray()
{
    
    for(int i=0;i<3;i++)
         
    {
        for(int j=0;j<3;j++) {
            c[i][j]=a[i][j]+b[i][j];
        }
        
            System.out.println("Sum of matrices:");
        
            for(int i=0;i<3;i++)
         
            {
                for(int j=0;j<3;j++) 

            System.out.print(c[i][j]+"\t");
                
        }
        System.out.println();
}
}
      

public static void main(String[] args)
{
    MatrixAdd obj=new MatrixAdd();
    obj.ReadArray();
    obj.PrintArray();
    
} 
}
    

