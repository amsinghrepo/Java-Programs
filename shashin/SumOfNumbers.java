//write a java program to find the sum of 100 numbers.

class SumOfNumbers{

public static void main(String args[]){

int nums = 100;
long sum = 0;

if(args.length > 0 ){
nums = Integer.parseInt(args[0]);
}


for(int i=1;i<=nums;i++){

sum = sum+i;

}
System.out.println("Sum of 1 to "+nums+" = "+sum);
}


}