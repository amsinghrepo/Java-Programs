class Exp implements Runnable
{
public void run(){
System.out.println("Why Skill Port didn't workout");
}
public static void main(String[] args)
{
Exp e= new Exp();
Thread th1=new Thread(e,"Himanshu");
Thread th2=new Thread(e,"Bagga");
th1.start();
th2.start();
get.setName("Dog is a faithful animal");
System.out.println(th2.getName());
}

}