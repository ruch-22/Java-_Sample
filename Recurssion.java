public class Recurssion {
    static int factorial(int n){
        // factorial(n) = n*n-1*....1 = n*factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n* factorial(n-1);}

            }
            static int factorial_iterative(int n){
                // factorial(n) = n*n-1*....1 = n*factorial(n-1)
                if(n==0 || n==1){
                    return 1;
                }
                else {
                    int product =1;
                for(int i=1;i>=1;n++){
                    return n*factorial(n-1);
                    product *= i;
                }
                return product;
        
                    }    
    public static void main(String[] args) {
        int n=5;
        System.out.println("the value of factorial x is:"+ factorial(n));
    }
    
}
