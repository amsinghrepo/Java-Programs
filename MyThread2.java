class MyThread2 implements Runnable{
public void run(){
System.out.println("Runnable thread running");
}
public static void main(String r[]){
MyThread2 mt2 = new MyThread2();

Thread t1 = new Thread(mt2,"Himanshu");
Thread t2 = new Thread(mt2, "Amritpal");
t1.start();
t2.start();

System.out.println(t1.getName());
System.out.println(t2.getName());
}

}