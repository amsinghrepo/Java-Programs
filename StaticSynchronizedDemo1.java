  public class StaticSynchronizedDemo1 extends Thread    {
    public StaticSynchronizedDemo1(String name) {
        super(name);
    }
    public static synchronized void aMethod()   {
        for(int i=0;i<5; i++){
            System.out.println(Thread.currentThread().getName() + " aMethod.. ");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void bMethod()   {
        for(int i=0;i<5; i++){
            System.out.println(Thread.currentThread().getName() + " bMethod.. ");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running");
        aMethod();
    }
    public static void main(String[] args) {
        StaticSynchronizedDemo1 s1 = new StaticSynchronizedDemo1("s1");
        StaticSynchronizedDemo1 s2 = new StaticSynchronizedDemo1("s2");
        s1.start();
        s2.bMethod();
 
    }
}