class FactorialOfNumber{

public static void main(String args[]){

int n = 5;

System.out.println("Factorial of "+n+" = "+findFact(n));

}

static long findFact(long n){

long res =1;

for(int i = 2; i<=n; i++){

res = res*i;

}

return res;
}

}