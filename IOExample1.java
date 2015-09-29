
public class IOExample1{

public static void main(String s[]) throws java.io.IOException {
String name = s[0];
System.out.println("Input Stream: Welcome "+name);
System.out.println("Output Stream");
System.err.println("Error Stream");

int i=System.in.read();//returns ASCII code of 1st character  
System.out.println((char)i);//will print the character

}


}