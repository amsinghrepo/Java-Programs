
class IOExample2{  
  public static void main(String args[]){  
   try{  
     java.io.FileOutputstream fout=new java.io.FileOutputStream("C:\\Users\\U38587\\Desktop\\userinfo.txt");  
     String s="Sachin Tendulkar is my favourite player";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }catch(Exception e){system.out.println(e);}  
  }  
}