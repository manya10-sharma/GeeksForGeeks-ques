public class Factorial {

    // RECURSIVE  CODE 
/*
     public int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
 */
    
    // USING LOOP

   static int factorial(int n){
        if(n==1 || n==0) return 1;
        int fact = 1;
        for(int i=1 ; i<=n ;i++ ){
            fact*=i;
        }
        return fact;
    }
}
