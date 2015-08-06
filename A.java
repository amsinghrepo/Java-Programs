class A{
public static void main(String a[]){
B b = new B();
System.out.println("Result "+b.c);

b = new B(7);
System.out.println("Result "+b.c);

b.insOf();

}

}

class B{
int c;
public B(){

c = 10;
c = 10;

}

public B(int x){

c = x;

c = (x<10) ? x+5: x-5; // Ternary Operator
System.out.println(x);


}

void insOf(){
    String name = "James";
      // following will return true since name is type of String
      boolean result = name instanceof Object;  
      System.out.println( result );
	  
	  int x = 7 * 6 / 5;
	  System.out.println( x );

}
}