class TestMemberOuter1{
 private int data=30;
 class Inner{
  void msg(){System.out.println("data is "+data);}
 }
class MyClass{}
 
 void display(){
  Inner in=new Inner();
  in.msg();
 }
 public static void main(String args[]){
  TestMemberOuter1 obj=new TestMemberOuter1();
  obj.display();
	TestMemberOuter1.Inner myIn = obj.new Inner();

 }
}
