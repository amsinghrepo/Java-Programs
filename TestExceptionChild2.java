import java.io.*;  
class Parent{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild2 extends Parent{  
  void msg()throws Exception{System.out.println("child");

  }  
  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  