class StringConversion{

String str = "my String"; // Not possible to parse into number

String myNum = "12345";

String myNum2 = "4321";
void numberConversion(){

String res = myNum+myNum2;

System.out.println(res);

int myInt = Integer.parseInt(myNum);
int myInt2 = Integer.parseInt(myNum2);

myInt = myInt+myInt2;

System.out.println(myInt);

res = str.substring(3,6);// >=3   and <6

System.out.println(res);

res = str.substring(4);
System.out.println(res);

res = str.trim();
System.out.println(res);

    System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
	 
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);
	 
	 System.out.println(c);
	 System.out.println(d);
	 
	 int ln = str.length();
	 
	 System.out.println(ln);
	 



}


}