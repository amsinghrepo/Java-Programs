class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
		
		int arr3[][] = new int[6][7];
		
		for(int i = 0; i<6; i++){
		for(int j=0;j<7;j++){
		arr3[i][j] = i;
		arr3[i][j] = j;
		
		if(i>2 && i<=5)
		continue ;
		
		System.out.println(arr3[i][j]);
		}
			
		}
		System.out.println("\n");
		
		test:	
		for(int i = 0; i<6; i++){
		System.out.println("Outer Loop");
		for(int j=0;j<7;j++){
		System.out.println("Inner Loop");
		//arr3[i][j] = i;
		arr3[i][j] = j;
		
		if(j>2 && j<=5)
		break test;
		
		System.out.println(arr3[i][j]);
		}
			
		}
		
		
    }
}