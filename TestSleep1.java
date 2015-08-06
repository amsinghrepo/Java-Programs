class TestSleep1 extends Thread{

public void run(){// Thread in Running state
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  //Thread in not-runnable state
    System.out.println(i);  
  } 
}  
public static void main(String args[]){  
  TestSleep1 t1=new TestSleep1(); // Thread in New State 
  TestSleep1 t2=new TestSleep1();  
   
  t1.start();  //Thread in Runnable state
  t2.start();  
  t2.start(); 
 }  
 
}