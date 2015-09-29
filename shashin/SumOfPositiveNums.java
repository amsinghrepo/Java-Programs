//write a program to find the sum of positive even numbers from a set of numbers which contains positive and negative numbers using While or do-while

class SumOfPositiveNums{

public static void main(String args[]){
int array[] = {12,34,32,77,43,22,88};
int index = 0;
long sum= 0;



if(args.length > 0 ){

array = new int[args.length];

for(int i = 0; i< array.length;i++){

array[i] = Integer.parseInt(args[i]);
}
}

do{

if((array[index] % 2) == 0 ){

System.out.println(" Positive Number "+array[index]);
sum = sum+array[index];
}

index++;
}while(index < array.length);

System.out.println("\n The sum of positive numbers = "+sum);

}
}