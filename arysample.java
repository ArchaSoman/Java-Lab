class arysample{
    int [] []x;
    arysample(){
        x=new int [] []{{11,22,33},{55,66,77}};
    }
    void printarray(){
        System.out.println("elements in the given matrix : ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++)
            System.out.print(x[i][j]+" ");
            System.out.println ("\n");
        }}
        public static void main (String[] args){
            arysample obj=new arysample();
            obj.printarray();
        }

            
        
    
}