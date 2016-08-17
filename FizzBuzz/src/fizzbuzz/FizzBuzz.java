package fizzbuzz;

/**
 *
 * @author J Feustel
 * FizzBuzz solution with Java
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     * @param 
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
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
