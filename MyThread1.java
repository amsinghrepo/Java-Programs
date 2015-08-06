class MyThread1 extends Thread{

public void run(){
System.out.println("My Thread 1 is Running");

}

}
 class MyThreadExc1{
 public static void main(String[] a){
 MyThread1 mt1 = new MyThread1();
 
 mt1.start();
 
 }
 
 }