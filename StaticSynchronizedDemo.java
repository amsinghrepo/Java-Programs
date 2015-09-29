public class StaticSynchronizedDemo extends Thread{
 
    public StaticSynchronizedDemo(String name) {
        super(name);
    }
     
    public synchronized void aMethod(){
        for(int i=0;i<5; i++){
            System.out.println(Thread.currentThread().getName()+" aMethod.. "); 
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
    public synchronized void bMethod(){
        for(int i=0;i<5; i++){
            System.out.println(Thread.currentThread().getName()+" bMethod.. ");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
     
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" running");
        aMethod();
    }
     
    public static void main(String[] args) {
        StaticSynchronizedDemo s1 = new StaticSynchronizedDemo("s1");
        StaticSynchronizedDemo s2 = new StaticSynchronizedDemo("s2");
        s1.start();
        s2.bMethod();
         
    }
}