class AccessModifierDemo{

private int rollNo = 43; //within class
public String name = "Himanshu";//Anywhere publicaly
protected int age = 23;//within package


void printInfo(){
System.out.println();

}

public int getRollNo(){
return rollNo;
}

public static void main(String args[]){
AccessModifierDemo amd = new AccessModifierDemo();

amd.printInfo();

}


}

class AccessPrivate{


public static void main(String args[]){
AccessModifierDemo amd = new AccessModifierDemo();

amd.printInfo();

System.out.println("Accessed private "+amd.getRollNo());
}



}


class AccessProtected {

public static void main(String args[]){
AccessModifierDemo amd = new AccessModifierDemo();

amd.printInfo();

System.out.println("Accessed Protected "+amd.age);
}


}



class AccessPublic{

public static void main(String args[]){
AccessModifierDemo amd = new AccessModifierDemo();

amd.printInfo();

System.out.println("Accessed Public "+amd.name);
}


}