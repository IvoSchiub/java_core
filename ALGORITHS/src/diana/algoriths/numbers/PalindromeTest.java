package diana.algoriths.numbers;

import java.util.Scanner;
/**
 * This Java program takes an input number from command line and integer array
 * and check if number is palindrome or not. A number is called palindrome
 * if number is equal to reverse of number itself.
 *
 * @author Javin Paul
 */
public class PalindromeTest {
  
  
    public static void main(String args[]){
      
        Scanner scanner = new Scanner(System.in);       
        //int number = scanner.nextInt();
        int[] numbers = {1, 20, 22, 102, 101, 1221, 13321, 13331, 0, 11};
      
        for(int number: numbers){
            System.out.println("Does number : "
               + number +" is a palindrome? " + isPalindrome(number));
        }             
    }

    private static boolean isPalindrome(int number) {
        if(number == reverse(number)){
            return true;
        }
        return false;
    }
  
      
    private static int reverse(int number){
        int reverse = 0;
      
        while(number != 0){
          reverse = reverse*10 + number%10; 
          number = number/10;
        }
              
        return reverse;
    }

}