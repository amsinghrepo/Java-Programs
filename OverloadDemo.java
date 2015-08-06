class OverloadDemo{

public OverloadDemo(){

}

 long x ;
 long y ;


 void abc(int x, int y){

System.out.println("inside int value"+this.x);
System.out.println("inside int value"+new OverloadDemo().x);
System.out.println("inside int value"+x);
}

 void abc(long x, long y){

System.out.println("inside long value");

System.out.println("inside int value"+this.x);
System.out.println("inside int value"+new OverloadDemo().x);
System.out.println("inside int value"+x);
}

static void abc(String a, long b){

System.out.println("inside String value");
}


public static void main(String[] abc){

OverloadDemo od = new OverloadDemo();

od.abc(od.x,3212);
abc("Hello",1234);
}

}