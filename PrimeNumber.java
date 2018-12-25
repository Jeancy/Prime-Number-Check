/*
 * Program that prints a list of prime numbers less than a given integer.
 */
package primenumber;

/**
 *
 *@ author Jeancy Tshibemba
 */
public class PrimeNumber {
    /**
     * 
     * @param n : the number to be checked if prime or not.
     * @return a Boolean value true or false depending on the value of n entered. 
     */
    public static boolean isPrime(long n){
        long h = n / 2 ; // variable to be used to check all the value upto half the value of n.
        if ((n == 0) || n == 1) { // checking if the value n is 0 or 1 as these values are not prime.
            System.out.println(n + " is not a prime number!");
            return false;
        }else { // At this stage we know that n is different from either 0 or 1.
            for (int i = 2; i <= h; i++) {//Start checking from 2 upto m = n / 2 (Brute force version)
                if (n % i == 0) { // checking if the remainder of n divide by i is 0.
                    System.out.println(n + " is not a prime number!");
                    return false;
                  
                 }
             }  
        }
        System.out.println(n +" is a prime number for sure!"); // 
        return true; // Returning true in case all the tests fail which means n is a prime numnber
    }
    
    public static void main(String[] args) {
        isPrime(3);
    }
    
}
