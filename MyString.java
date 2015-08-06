class MyString{
//Declaration of String 
String str;

//Declaration and defination
String str1 = "abc";

//Creating a object of String
String str2 = new String();

String str3 = new String("My");

void oprationsOnStirng(){

//concatination of string
str2 = str3+" String";
str = str3+ " second String";
System.out.println("Str "+str+" str2 "+str2+" str3 "+str3);

//concatination using method
str2 = str3.concat(" String");


}



}