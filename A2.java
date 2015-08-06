class A2{  
  static{System.out.println("static block is invoked");}  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}




public static void main(String args[]){

System.out.println("Main method running");

Emp emp1 = new Emp("Himanshu",24,"Software Developer");
Emp emp2 = new Emp("Amritpal",28,"Business Analyst");

emp1.display();
emp2.display();

}