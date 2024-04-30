// class fun {
//     public static void main(String[] args) {
//         System.out.println("1");
//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("4");
//         System.out.println(100/0);
//         System.out.println("6");
//         System.out.println("7");
//         System.out.println("8");
//     }
// }

// import java.io.FileInputStream;
// class error{
//     public static void main(String[] args) {
//         try{
//             System.out.println("1");
//             FileInputStream abc=new FileInputStream("d:/xyz.txt");
//             System.out.println("2");

//         }
//         catch(Exception e){
//             System.out.println("Check file do not exist");
//         }
//     }

// }

// class fun {
//     public static void main(String[] args) {
//         try{
//         System.out.println("1");
//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("4");
//         //System.out.println(100/0);
//         System.out.println("6");
//         System.out.println("7");
//         System.out.println("8");
//         }
//         // catch(Exception e){
//         //     System.out.println(e);
//         // }
//         finally{
//             System.out.println("finally block executed");
//         }
//     }
// }


// import java.io.FileInputStream;
// class fun {
//     public static void main(String[] args) {
//         try{
//         System.out.println("1");
//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("4");
//         FileInputStream abc=new FileInputStream("d:/xyz.txt");
//         System.out.println(100/0);
//         System.out.println("6");
//         System.out.println("7");
//         System.out.println("8");
//         }
//         catch(ArithmeticException e){
//             System.out.println("First execption");
//         }
//         catch(Exception e){
//             System.out.println("Sec execption");
//            // e.printStackTrace();
//         }
//         finally{
//             System.out.println("finally block executed");
//         }
//     }
// }
//import java.util.Scanner;
// class Divide{
//     public static void main(String args[]) {
//         try{
//             int a=Integer.parseInt(arr[0]);
//             int b=Integer.parseInt(arr[1]);
//             int c=a/b;
//             System.out.println("Result is: "+c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Second number must be non-zero");
//         }
//         catch(NumberFormatException n){
//             System.out.println("Arguments must be Numeric");
//         }
//         catch(ArrayIndexOutOfBoundsException a){
//             System.out.println("Invalid Number of arguments");
//         }
//    }
// }


// class NestedTryDemo{
//     public static void main(String[] args) {
//         try{
//             int a=Integer.parseInt(args[0]);
//             try{
//                 int b=Integer.parseInt(args[1]);
//                 System.out.println(a/b);
//             }
//             catch(ArithmeticException e)
//             {
//                 System.out.println("Div by zero error!");
//             }
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Need 2 parameters!");
//         }
//     }
// }

// class Divide{
//     public static void main(String arr[]) {
//         try{
//             int a=Integer.parseInt(arr[0]);
//             int b=Integer.parseInt(arr[1]);
//             int c=a/b;
//             System.out.println("Result is: "+c);
//         }
//         catch(Throwable e)
//         {
//             System.out.println(e);
//         }
//     }
// }


// public class TestThrow{
//     public static void checkNum(int num) {
//         if(num<1){
//             throw new ArithmeticException("\nNumber is negative, can not calculate square");

//         }
//         else{
//             System.out.println("Square of "+num+"is "+(num*num));
//         }
//     }
//     public static void main(String[] args) {
//         TestThrow obj=new TestThrow();
//         obj.checkNum(-3);
//         System.out.println("Rest of the code..");
//     }
// }

// class ThrowDemo{
//     static void demo(){
//         try{
//             throw new NullPointerException("demo");
//         }
//         catch(NullPointerException e){
//             System.out.println("Caught inside demo,");
//             throw e;
//         }
//     }
//     public static void main(String[] args) {
//         try{
//             demo();
//         }
//         catch(NullPointerException e){
//             System.out.println("Recaught: "+e);
//         }
//     }
// }

// public class TestThrows {

//     public static int divideNum(int m, int n) throws ArithmeticException{
//         int div=m/n;
//         return div;
//     }
//     public static void main(String[] args) {
//         TestThrows obj=new TestThrows();
//         try{
//             System.out.println(obj.divideNum(45, 0));
//         }
//         catch(ArithmeticException e){
//             System.out.println("\nNumber cannot be divided by 0");
//         }
//         System.out.println("Rest of the code..");
//     }
// }

// class Divide{
//     public static void main(String arr[]) {
//         try{
//             int a=Integer.parseInt(arr[0]);
//             int b=Integer.parseInt(arr[0]);
//             int c=a/b;
//             System.out.println("Result is: "+c);
//         }
//         catch(Throwable e){
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("It is Finally block!");
//         }
//     }
// }


// import java.io.*;
// class BRRead{
//     public static void main(String[] args)throws IOException {
//         char c;
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter characters,'q' to quit.");
//         do{
//             c=(char) br.read();
//             System.out.println(c);
//         }
//         while(c!='q');
//     }
// }



// import java.io.*;
// class Student{
//     String name;
//     int rollnu;
//     double fee;
//     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//     void readData() throws IOException{
//         System.out.print("Enter the Student name: ");
//         name=br.readLine();
//         System.out.print("Enter the Student RollNumber: ");
//         rollnu=Integer.parseInt(br.readLine());
//         System.out.print("Enter the fee paid: ");
//         fee=Double.parseDouble(br.readLine());
//     }
//     void display(){
//         System.out.println("The Student name: ");
//         System.out.println(name);
//         System.out.println("The Student RollNum: ");
//         System.out.println(rollnu);
//         System.out.println("The Student Paid fee: ");
//         System.out.println(fee);
//     }
//     public static void main(String[] args) throws IOException {
//         Student s=new Student();
//         s.readData();
//         System.out.println("===");
//         s.display();
        
//     }
// }


// import java.io.File;
// class FileDemo{
//     static void p(String s){
//         System.out.println(s);
//     }
//     public static void main(String[] args) {
//         File f1=new File("C:\\Users\\91709\\Downloads\\File\\COPYRIGHT.txt");
//         p("FileName: "+f1.getName());
//         p("Path: "+f1.getPath());
//         p("Abs Path: "+f1.getAbsolutePath());
//         p("Parent: "+f1.getParent());
//         p(f1.exists()?"exist":"does not exist");
//         p(f1.canWrite()?"is writeable":"is not writeable");
//         p(f1.canRead()?"is readable":"is not readable");
//         p("is "+(f1.isDirectory()?"":"not "+"a diractory"));
//         p(f1.isFile()?"is normal file":"might not a named pipe");
//         p(f1.isAbsolute()?"is absolude":"is not absolute");
//         p("File last modified " + f1.lastModified());
//         p("File size: "+f1.length() + " Bytes");

//     }
// }

// import java.io.FileOutputStream;
// public class FileOutputStreamEx {
//     public static void main(String[] args) {
//         try{
//             FileOutputStream fout=new FileOutputStream());
//             String s="Welcome to LPU.";
//             byte b[]=s.getBytes();
//             fout.write(b);
//             fout.close();
//             System.out.println("Success..");
//         }
//     }

    
// }


// import java.io.*;
// public class Student implements Serializable{
//     public String stu_Name;
//     public String stu_Addr;
//     //transient String stu_Addr;
//     public int stu_Id;
//     //staticint stu_Id;
//     public static void main(String[] args) {
//         Student s=new Student();
//         s.stu_Name="Vijay";
//         s.stu_Addr="ABC, XYZ";
//         s.stu_Id=15;
//         try{
//             FileOutputStream fileout=new FileOutputStream("C:\\Users\\91709\\Desktop\\s.txt");
//             ObjectOutputStream out=new ObjectOutputStream(fileout);
//             out.writeObject(s);
//             out.close();
//             fileout.close();
//             System.out.println("Object setialized and saved in s.txt");
//         }catch(IOException i){
//             i.printStackTrace();
//         }
//     }

// }


// import java.io.*;
// public class Student1 implements Serializable{
//     public String stu_Name;
//     public String stu_Addr;
//     //transient String stu_Addr;
//     public int stu_Id;
//     //staticint stu_Id;
//     public static void main(String[] args) {
//         Student s=null;
//         try{
//             FileInputStream fileIn=new FileInputStream("C:\\Users\\91709\\Desktop\\s.txt");
//             ObjectInputStream in=new ObjectInputStream(fileIn);
//             s=(Student)in.readObject(s);
//             in.close();
//             fileIn.close();
//         }catch(IOException i){
//             i.printStackTrace();
//         }catch(ClassNotFoundException c){
//             System.out.println("Student class not found");
//             c.printStackTrace();
//             return;
//         }
//         System.out.println("\nDeserialized Student..");
//         System.out.println("Name: "+s.stu_Name);
//         System.out.println("Add: "+s.stu_Addr);
//         System.out.println("Id: "+s.stu_Id);
//     }

// }

// import java.io.*;
// import java.util.Scanner;
// public class Student1 implements Serializable{
//     public String Name;
//     //public String Addr;
//     transient String Addr;
//     public String Id;
//     //staticint Id;
//     public static void main(String[] args) {
//         Student1 s=new Student1();
//         Scanner sc=new Scanner(System.in);
//         s.Name=sc.nextLine();
//         s.Addr=sc.nextLine();
//         s.Id=sc.nextLine();
//         try{
//             FileOutputStream fileout=new FileOutputStream("C:\\Users\\91709\\Desktop\\s.txt");
//             ObjectOutputStream out=new ObjectOutputStream(fileout);
//             out.writeObject(s);
//             out.close();
//             fileout.close();
//             System.out.println("Object setialized and saved in s.txt");
//         }catch(IOException i){
//             i.printStackTrace();
//         }
//     }

// }

import java.io.*;
public class Student1 implements Serializable{
    public String stu_Name;
    public String stu_Addr;
    //transient String stu_Addr;
    public int stu_Id;
    //staticint stu_Id;
    public static void main(String[] args) {
        Student s=null;
        try{
            FileInputStream fileIn=new FileInputStream("C:\\Users\\91709\\Desktop\\s.txt");
            ObjectInputStream in=new ObjectInputStream(fileIn);
            s=(Student)in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
        }catch(ClassNotFoundException c){
            System.out.println("Student class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("\nDeserialized Student..");
        System.out.println("Name: "+s.stu_Name);
        System.out.println("Add: "+s.stu_Addr);
        System.out.println("Id: "+s.stu_Id);
    }

}