class ArrayExample{

//ArrayType ar[];
//ArrayType[] ar
//ArrayType []ar;

//ar[] = NewDataType[size];

int ar[] = new int[10];

void sdArray(){
ar[0]= 12;
ar[1] = 20;
ar[2] = 70	;
ar[3] = 07;
ar[4] = 88;

System.out.println(" My Array "+ar[3]);
boolean ar1[] = new boolean[7];
ar1[5]= true;
ar1[2]=false;
ar1[6]=true;
System.out.println(" My Array "+ar1[5]);
}



int mdArray[][] = {
{23, 123, 44},{22,55,66}

};

void mdArray(){

System.out.println(mdArray[1][0]);

}

//Copy Array 

void copyArray(){

 char[] copyFrom = { 'H', 'i', 'm', 'a', 'n', 's', 'h',
			    'u', 'b', 'a', 'g', 'g' ,'a'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		
        System.out.println(new String(copyTo));
		
		
		String[] myFreinds = new String[10];
		
		myFreinds[0] = "Ram";
		myFreinds[1] = "Sham";
		myFreinds[2] = "Radha";
		myFreinds[3] = "Santa";
		
		String youFreinds[] = new String[3];
		
		System.arraycopy(myFreinds,1,youFreinds,0,3);
		
		 System.out.println(youFreinds[0]);
		 System.out.println(youFreinds[1]);
		 System.out.println(youFreinds[2]);
		
		int arr3[][] = new int[2][3];
		
		for(int i = 0; i<2; i++){
		for(int j=0;j<3;j++){
		arr3[i][j] = i;
		arr3[i][j] = j;
		
		System.out.println(arr3[i][j]);
		
		
		}
		
		
		}

}

}