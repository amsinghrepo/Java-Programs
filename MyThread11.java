class MyThread11 extends Thread{
 public void run()
 {
 System.out.println("Thread needs to be created ");
 }
public static void main(String[] args){
MyThread11 m=new MyThread11();
m.start();
m.setName("HimanshuBagga");
System.out.println(m.getName());
}
} 