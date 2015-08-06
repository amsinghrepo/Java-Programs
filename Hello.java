class Hello

{



public static void main(String[] myString)

	{

	System.out.print("hello");
				
	System.out.println("World!!!! \n");

/*
	System.out.print(myString[0]+" ");
	System.out.println(myString[1]);
	System.out.println(myString[2]);
	System.out.println(myString[3]);
	System.out.println(myString[4]);


	int a=10;
	int a1 = 30;
	String s = "Hello";
	boolean b = true;
	byte bt = 7;
	long l = 234344;
	float f = 344;
	char c = 'H';
	
	System.out.println(a);

	add(34, a1);
	System.out.println("\n");
	
	MyString myStr = new MyString();
	
	myStr.oprationsOnStirng();



StringConversion strConv = new StringConversion();

strConv.numberConversion();	


ArrayExample ae = new ArrayExample();

ae.copyArray();


StatementsDemo stmtDemo = new StatementsDemo();

stmtDemo.ifStmtDemo2("dfkdflk Hncsimanshu dfdfkldk  jksj xkdsfk ;l;;l;l;   ddd dfkdlfkdflk dkfkjdkfkd Sindddgh dfjdlkfdk ");


LoopDemo loop = new LoopDemo();

loop.forLoop();
*/
	
	PolymorphismDemo pd = new PolymorphismDemo();
	PolymorphismDemo pd1 = new PolymorphismDemo();
	
System.out.println("Value of X "+pd.getX());

pd.setX(1234);	
pd1.setX(123456);

System.out.println("Value of X "+pd.getX());
System.out.println("Value of X "+pd1.getX());	
	}

static void add(int a, int b){
	System.out.println(a+b);

}

}