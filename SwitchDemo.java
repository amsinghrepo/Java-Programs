class SwitchDemo{

public static void main(String ar[]){

int a = 5;
String month = "March";

switch(a){

case 1: System.out.println("Jan ");
		break;
case 2: System.out.println("Feb ");
		break;
case 3: System.out.println("March ");
		break;
default: System.out.println("NONE ");
}

switch(month){

case "Jan": System.out.println("Jan ");
		break;
case "Feb": System.out.println("Feb ");
		break;
case "March": System.out.println("Third Month of the year ");
		break;
default: System.out.println("NONE ");
}

}



}