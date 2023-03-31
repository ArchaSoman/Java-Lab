import java.util.Scanner;
class arr{
    int[]a;
    void readarr(){
    a=new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the element:");
    for(int i=0;i<5;i++){
    a[i]=sc.nextInt();
    }
    }

void printarr(){
    System.out.println("Array elements are :");
    for(int i=0; i<5;i++)
    System.out.println(a[i]);
}
public static void main(String [] args){
arr sc=new arr();
sc.readarr();
sc.printarr();
}
}
