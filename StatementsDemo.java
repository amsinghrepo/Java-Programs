class StatementsDemo{

public void ifStmtDemo(String fName,String lName){

if(!fName.equals("Himanshu") ){
if(lName != "Bagga"){
System.out.println(fName+" "+lName +" you can enter in the club ");

}
}
else{
System.out.println(fName+" "+lName +"  you can't enter in the club ");

}

}

void ifStmtDemo2(String name){

if(name.contains("Bagga")){

System.out.println("This name is exist11111");
}
else if(name.contains("Himanshu")){
System.out.println("This name is exist22222");

}
else if(name.contains("Amritpal")){
System.out.println("This name is exist33333");

}
else if(name.contains("Singh")){
System.out.println("This name is exist44444");

}
else{

System.out.println("This name is not exist");
}

}

}