public class TestFinallyBlock2{  
  public static void main(String args[]){  
  try{  
  System.out.println("Before system exit..."); 
	
   int data=25/3;  
   System.out.println(data);  
  }  
  catch(ArithmeticException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.exit(0);
  System.out.println("rest of the code...");  
  }  
} 