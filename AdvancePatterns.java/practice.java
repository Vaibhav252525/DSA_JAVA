public class practice {
    public static void main(String[] args) {

        int n = 10000;
        int x = n;
        for (int i = 2; i < n; i++) {

            while (x % i == 0 && isPrime(i)) {

                System.out.print(i + " ");
                x = x / i;
            }

        }

    }


    public static boolean isPrime(int n ){
        
        if(n<=1){
            return false;
        }
        
        for(int i =2;i<=Math.sqrt(n);i++){
            
            if(n%i==0){
                return false;
            }
            
            
        }
        return true;
}



}

// public static boolean printPrimeFactorization(int n){
// // code here
// for(int i=2;i<=Math.sqrt(n);i++){
// if(n%i==0){
// return false;
// }
// }
// return true;

// }

// public static void printPrime(int n){
// for(int i=2;i<=Math.sqrt(n);i++){
// if(printPrimeFactorization(i)){

// int x=i;

// while(n % x==0){
// System.out.print(i+ " ");
// x=x*i;
// }

// }

// }

// }