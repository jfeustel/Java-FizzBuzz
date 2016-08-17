package fizzbuzz;

/**
 *
 * @author J Feustel
 * 8/26/2016
 * FizzBuzz solution with Java
 * 
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){ //counts from 1 to 100, allowing program to check for divisibility of 3, 5, both, or neither.
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");                
            }
            else if(i % 3 == 0){
                System.out.println("Fizz"); 
            }
            else if(i % 5 == 0){
                System.out.println("Buzz"); 
            }
            else{
                System.out.println(i);
            }
        }
    }    
}
