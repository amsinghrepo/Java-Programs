public class BreakContinueExample {
 
    public static void main(String args[]) {
   
        int[] numbers= new int[]{1,2,3,4,5,6,7,8,9,10};
     
        //calculate sum of all numbers till 5 appears
		
        int sum = 0;
        for(int i=0; i< numbers.length; i++){
            System.out.println("Executing for loop with iteration number: " + i);
            if(i == 5){
                System.out.println("calling break statement to break for loop");
                break;
            }
            if(i%2 != 0){
                sum = sum + i;
                System.out.println("calling continue statement to start new iteration");
                continue;
            }
            System.out.println("Last line of loop, not executing for odd numbers due to continue statement i: "+ i);
        }
        System.out.println("Outside of for loop, sum: " + sum);
    }
}

//Read more: http://javarevisited.blogspot.com/2012/05/break-continue-and-lablel-in-loop-java.html#ixzz3NgumsJ00
