public class Testtrycatch1{  
  public static void main(String args[]){  
  
  try{
      int data=50/0;//may throw exception  
      System.out.println("rest of the code...");  
}catch(ArithmeticException  ae){
System.out.println("inside catch");
}  
}
}  