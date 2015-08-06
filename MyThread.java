class MyThread extends Thread{
public void run(){
System.out.println("My thread running");

} 
public static void  main(String[] a){
MyThread mt1 = new MyThread();
MyThread mt2 = new MyThread();
mt1.start();
mt2.start();
mt2.setName("My custom Thread");
System.out.println(mt2.getName());
}
}