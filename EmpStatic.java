class Emp{
String name;
int age;
String desg;
static String compName = "UST Global";



public Emp(String name, int age, String desg){
this.name = name;
this.age = age;
this.desg = desg;


}

void display(){
System.out.println("Name: "+name+" Age: "+age+" Desg: "+desg+" Company Name: "+compName);

}

}

class MyEmp{

static{
 Emp.compName = "US Technology";
System.out.println("staic block running");
}




}