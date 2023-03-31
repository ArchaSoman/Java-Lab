class strings1{
    public static void main(String[] args)
{
    String s1="hello";
    String s2="world";
    String s3=new String("sngce");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1.length());
    System.out.println(s1+" "+s2);
    System.out.println(s1.concat(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.substring(0,1));
    System.out.println(s1.equals(s2));
    System.out.println(s1.replace('a','o'));
    System.out.println(s1.toUpperCase());

}
}