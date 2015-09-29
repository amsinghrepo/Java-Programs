//write a program save your name, designation and age in a file. using FileOutputStream

class FileOutputStreamExample1{

public static void main(String s[]){

try{

final String uid = "U23123";
int exp  = 65;

String name = " Himanshu, Developer, 24";


java.io.FileOutputStream fout =new java.io.FileOutputStream("C:\\Users\\U38587\\Desktop\\userinfo.txt");





byte b[] = name.getBytes();

  fout.write(exp);

  fout.write(b);  
  fout.close();  



  System.out.println("success...");  

}catch(Exception e){e.printStackTrace();}


}




}
