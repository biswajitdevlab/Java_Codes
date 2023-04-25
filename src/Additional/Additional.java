package Additional;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
//primenumber
class prime {
    public void primenumber() {
        int num;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        boolean flag=false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }if(!flag){
            System.out.println(num+" The number is prime");
        }
        else{
            System.out.println(num+" The number is not prime");
        }
    }
}
//important conecpts
class allop {
    //String swap
    public void stringswap() {
        String str1="rama";
        String str2="hari";
        //StringBuilder s=new StringBuilder(st);
        System.out.println(str1+" , "+str2);
        str1=str1+str2;
        str2=str1.substring(0,4);
        str1=str1.substring(4);
        System.out.println(str1);
        System.out.println(str2);

    }
    //number swap
    public void numberswap() {
        int a=2,b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"    "+b);
    }
    public void third() {
        String a="rama";
        String b="hari";
        String c;
        c=a;
        a=b;
        b=c;
        System.out.println(a+ " "+b);

    }
    //factorial
    public void factorial() {
        int a=7,result=1;
        for(int i=1;i<=a;i++) {
            result=result*i;
        }
        System.out.println(result);
    }
    //array print
    public void arrayprint() {
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    //array length
    public void arraylength() {
        int a[]= {1,2,3,4,5};
        System.out.println(a.length);

    }
    //File operations
    //Read
    public void fileread() throws IOException {
        String file="C:\\Users\\soyeb\\Documents\\B.txt";
        BufferedReader bf=new BufferedReader(new FileReader(file));
        String startLine;
        while((startLine=bf.readLine())!=null) {
            System.out.println(startLine);
        }
    }
    //Write
    public void filewrite() {
        String file = "Hello World!";//inside the text file it will show.
        try {
            FileWriter fWriter = new FileWriter("C:\\Users\\soyeb\\Documents\\B.txt");
            fWriter.write(file);
            System.out.println(file);
            fWriter.close();
            System.out.println("File is created");
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
        finally{
            System.out.println("Successfully written");
        }
    }
    //Create File
    public void filecreate() throws IOException {
        File f=new File("C:\\Users\\soyeb\\Desktop\\hi.txt");
        if(f.createNewFile()) {
            System.out.println("File created Successfully!");
        }
        else {
            System.out.println("ALeady Exist!");
        }
    }
    //Array operations
    public void arraysort() {
        int a[]= new int[4];
        System.out.println("Enter array elements");
        Scanner sc=new Scanner (System.in);

        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();

        }
        Arrays.sort(a);
        System.out.print("Sorted array elements:\n");
        for(int b:a) {
            System.out.print(b+" , ");
        }
    }
    public void array2d() {
        int a[][]=new int[2][2];
        System.out.println("Enter array elements");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("\n Matrix elements: \n");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Number rev
    public void numrev() {
        int num = 1612, reverse = 0;
        while(num != 0) {
            int i = num % 10;
            reverse = reverse * 10 + i;
            num /= 10;
        }
        System.out.println("The reversed number is: " + reverse);
    }
    public static void main(String[]args) throws IOException {
        allop dc=new allop();
        dc.stringswap();
        dc.numberswap();
        dc.third();
        dc.arrayprint();
        dc.factorial();
        dc.arraylength();
        dc.filecreate();
        dc.filewrite();
        dc.fileread();
        dc.arraysort();
        dc.array2d();
        dc.numrev();

    }
}

public class Additional {
    //constructor
    Additional(){
        int a=8;
        int b=6;
        int c=a+b;
        System.out.println(c);
    }

    Additional(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[]args){
        Additional pt=new Additional();
        Additional pt1=new Additional(11,12);
    }
}
//Encapsulation
class encap {
    private String name;

    public void setname(String name) {
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public static void main(String[]args){
        encap en=new encap();
        en.setname("rama");
        System.out.print(en.getname());
    }
}
//abstract class
abstract class animal{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("Zoo Zoo");
    }
}
class pig extends animal{
    @Override
    public void animalsound(){
        System.out.println("Wee weee");
    }
}
class main{
    public static void main(String[]args){
        pig pg=new pig();
        pg.sleep();
        pg.animalsound();
    }
}
//Abstract interface
interface animal1{
    public void animalsound();
    public void sleep();
}
class goat implements animal1{
    public void sleep(){
        System.out.println("Zoo Zoo");
    }
    public void animalsound(){
        System.out.println("Mee Mee");
    }
}
class Main1{
    public static void main(String[]args){
        goat g=new goat();
        g.sleep();
        g.animalsound();
    }
}
//new instance obj creation
class D {
    public String name = "Hello";

    public static void main(String[] args) {
        try {
            D obj = D.class.newInstance();
            System.out.println(obj.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
//number reverse......
class numberrev{
    public static void main(String[]args) {
        int n=12,a,b=0;
        while(n!=0) {
            a=n%10;
            b=b*10+a;
            n=n/10;
        }
        System.out.println(b);
    }
}
//pallindrome...
class pallin{
    public static void main(String[]args) {
        int n=121,a,b=0,c;
        c=n;
        while(n!=0) {
            a=n%10;
            b=b*10+a;
            n=n/10;
        }
        if(b==c) {
            System.out.println("number is pallindrome");
        }
        else {
            System.out.println("number is not pallindrome");
        }
    }
}
//jdbc java
class sql{
    public static void main(String[]args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
        Statement st=con.createStatement();
        String s="select*from salary where id=12";
        st.execute(s);
        con.close();
        System.out.println("Query got executed");
    }
}
//To retrive data from sql
/*String s= "select id,first_name,last_name,eamil,department,salary from employees";
//3.Execute statement/Query
ResultSet rs= stmt.executeQuery(s);
while(rs.next())
{
	int id=rs.getInt("id");
	String fname=rs.getString("FIRST_NAME");
	String lname=rs.getString("LAST_NAME");
	String email=rs.getString("LAST_NAME");
	String dept=rs.getString("LAST_NAME");
	String salary=rs.getString("LAST_NAME");


System.out.println(id +" " +fname+ " " +lname+""+email+""+dept+""+salary);
	}
        }
   */
//vowel from
class vowel {
    public static void main(String[]args) {
        String num="hari";

        //System.out.println("Enter a string");
        //Scanner sc=new Scanner(System.in);
        num=num.toLowerCase();;

        //num=sc.nextLine();
        int count=0;
        for(int j=0;j<num.length();j++) {
            if(num.charAt(j)=='a'||num.charAt(j)=='e'||num.charAt(j)=='i'||num.charAt(j)=='o'||num.charAt(j)=='u') {
                count++;
            }


        }
        System.out.println(count);

    }
}
//String
class stringrev{
    public static void main(String[] args) {
        String a="rama";
        StringBuilder s=new StringBuilder(a);
        System.out.println(s.reverse());

    }
    class Stringswap{
        public static void main(String[]args) {
            String a="jay";
            String b="maa";
            System.out.println("Before swap :"+a+" "+b);
            a=a+b;
            b=a.substring(0,3);
            a=a.substring(3);
            System.out.println("Afetr swap :"+a+" "+b);
        }
    }
}
class numberrev1{
    public static void main(String[]args) {
        int a,b=0,c;
        int n;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0) {
            a=n%10;
            b=b*10+a;
            n=n/10;

        }

        System.out.println("The reverse of number is :"+b);
    }
}
class numberswap{
    public static void main(String[]args) {
        int a=2,b=3;
        System.out.println("Before swap: "+ a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Before swap: "+a+" "+b);
    }
}
class numberswap3rd{
    public static void main(String[]args) {
        int a=2,b=3,c=0;
        System.out.println("Before swap"+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swap"+a+" "+b);

    }
}
class stringswap3rd{
    public static void main(String[]args) {
        String a="rama",b="hari",c;
        System.out.println(a);
        System.out.println(b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swap:" +a+" "+b);
    }
}
//fibonnci series
class fibo{
    public static void main(String[]args) {
        int a=1,b=2,c;
        System.out.print(a+" , "+b);

        for(int i=1;i<=10;i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" , "+c);
        }

    }
}

//Armstrong number
class p5{
    public static void main(String[]args) {
        int a,num=371,c,p=0;
        c=num;
        while(num>0) {
            a=num%10;
            p=p+(a*a*a);
            num=num/10;
        }
        if(c==p) {
            System.out.println("The number is armstrong");
        }
        else {
            System.out.println("The number is not armstrong");
        }
    }
}
//Array Methods

//Twod array
class A{
    public void twodarray(){
        int a[][]=new int[2][2];
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=count;
                count++;
            }
        }
        System.out.println("The array formed is");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[]args){
        A b=new A();
        //b.twodarray()
    }
}
//twod array
class twod{
    public static void main(String[]args) {
        int a[][]=new int[3][3];
        System.out.println("Enter array elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+" ");


            }
            System.out.println();
        }
    }
}
//Method overriding
class B {
    // method overloading
    static int add(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println(a+b+c);
        return a + b + c;
    }

    public static void main(String[] args) {

        B b = new B();
        b.add(11, 11);
        b.add(11, 11,11);
    }
}
//Method overriding
class Shape{
    void draw(){

        System.out.println("No any shape");
    }
}
class Square extends Shape{
    @Override
        //methodoverloading
    void draw(){
        super.draw();
        System.out.println("Square shape");
    }
}
class Circle extends Square{
    @Override
    void draw(){
        super.draw();
        System.out.println("Circular shape");
    }
}
class c{
    public static void main(String[]args){
        Shape s=new Circle();
        s.draw();

    }
}
//String methods
class s{
    public static void main(String[]args){
        String s=new String("  rama   ");
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf("r"));
        System.out.println(s.isEmpty());
        System.out.println(s.trim());
        System.out.println(s.replace("r","n"));
    }
}
//sets tree and hashset
class set{
    public static void main(String[]args){
        java.util.Set<Integer> t=new java.util.TreeSet<>();
        t.add(9);
        t.add(9);
        t.add(9);
        t.add(6);
        t.add(5);
        System.out.println(t);
        java.util.Set<Integer> t1=new java.util.HashSet<>();
        t1.add(19);
        t1.add(19);
        t1.add(19);
        t1.add(16);
        t1.add(15);
        System.out.println(t1);
        class hasmap{

        }
        class hashtable{

        }
    }
}
//String tokenizer
class StringTokenizer {
 /*StringTokenizer st= new StringTokenizer("Hello welcome to my channel");
 while(st.hasMoreToken()){
     System.out.println(" "+st.nextToken());
    }
    */
}
//Array list
class arr {
    public static void main(String[] args) {

        java.util.ArrayList<Integer> at = new java.util.ArrayList<Integer>();
        at.add(1);
        at.add(8);
        at.add(12);
        at.add(3);
        System.out.println(at);
        at.remove(2);
        at.set(2, 7);
        System.out.println(at.get(2));
        Iterator it = at.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        //
        at.clear();
        System.out.println(at);
    }
}
//PriorityQueue
class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<Integer>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("priority queue content are" + list);
        System.out.println(list.peek());
        //to remove head node
        System.out.println(list.poll());
        //its kinda of sorting order.
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(list.poll() + " ");
        }
    }
    }
