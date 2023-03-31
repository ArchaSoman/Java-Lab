import java.util.Scanner;
class  array{
    int [] mark ;
    array() {
        mark=new int []{100,200,300};
    }
    void printarray(){
        System.out.println("Array elements are :");
        for (int i=0;i<mark.length;i++)
        System.out.println(mark[i]);
    }
    public static void main (String[] args){
        array obj=new array();
        obj.printarray();
    }
}