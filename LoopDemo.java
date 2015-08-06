class LoopDemo{

void forLoop(){

for(int i=0; i<10;i++){

System.out.println("Value of Loop index is "+i);

}
/*
for(;;){
System.out.println("infinite loop ");
}
*/
 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
 
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }

String names[] = {"Himanshu","Ram","Sham","Lucky","Vicky"};		

for(String name : names){

System.out.println("Name is "+name);

}

for(String name1 : names){
System.out.println("Name is "+name1);

if(name1 == "Lucky"){
System.out.println("Name is "+name1);
break;
}

}

for(int i=0; ;i++){

System.out.println("Value of Loop index is "+i);

if(i>10){
System.out.println("Reached 10 break executed");
break;
}
 
}

}

}