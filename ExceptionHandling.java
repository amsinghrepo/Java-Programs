public class ExceptionHandling{

public static void main(String args[]){

try{
String s = args[2];

System.out.println(s);

}catch(ArrayIndexOutOfBoundsException aob){

System.out.println(aob);
}


}


}