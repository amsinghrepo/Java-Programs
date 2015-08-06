class MyClass{

int a;


void myMethod(){

System.out.println(" Today is Sunday ");
System.out.println(" Now its "+a+"th Week");

}

public MyClass(){

System.out.println(" I am intialising my class ");
a = 13;

}

public MyClass(int myweek){
//System.out.println(" Now its "+myWeek+"th Week");

a = myweek;

}


}

class GetDay{

public static void main(String[] arg){

MyClass mclass = new MyClass(16);

mclass = new MyClass();

mclass.myMethod();

}


}