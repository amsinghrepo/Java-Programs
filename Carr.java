class Carr{

String stairing;
int speed;
int gear;
boolean brk;
void start(){
System.out.println("Car is starting ");

}
void run(int gear){
this.gear = gear;

System.out.println("Car is running in "+this.gear+" Gear" );
}

}
class Nano extends Carr{

public static void main(String args[]){

Nano nano = new Nano();

nano.speed= 30;
nano.start();
nano.run(2);

}

class skoda extends Carr{


}

}