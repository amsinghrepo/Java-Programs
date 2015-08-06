//you cannnot use code, variable, method etc out of the class

class  Car{
//we cannot use statement outside of method

//ingeger types
byte bt;
short s;
int i;
long l;

//floting points
float f;
double d;

// boolean 
boolean b;

// character
char c= '-';
long charVal = (int)c;

void print(){
// we cannot define method inside a method
boolean b= false;
System.out.println("byte "+bt+" short "+s+" int "+i+" long "+l+" float "+f+" double "+d+" char "+c+" boolean "+b+" Char value "+charVal);
}

int gear;

int start(){
int speed= 12;


return speed;
}

}



class myCar{


public static void main(String a[]){
Car c = new Car();

System.out.println("Gear "+c.gear+"  Speed "+c.start());
c.print();
}
}