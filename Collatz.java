package Projects;
import java.util.Scanner;

public class Collatz {
    /*The Collatz conjecture is one of the most famous unsolved problems in mathematics. 
    The conjecture asks whether repeating two simple arithmetic operations will eventually transform every positive integer into 1. 
    It concerns sequences of integers in which each term is obtained from the previous term as follows: if the previous term is even, the next term is one half of the previous term. If the previous term is odd, the next term is 3 times the previous term plus 1. 
    The conjecture is that these sequences always reach 1, no matter which positive integer is chosen to start the sequence.
    https://en.wikipedia.org/ */
    public static void Checker(int y) {
        while (y != 1) {
            if (y % 2 == 0) {
                y /=  2;
                System.out.println(y);
            } else {
                y *= 3;
                y += 1;
                System.out.println(y);
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in);){
            System.out.println("Enter number bigger than 1: ");
            int ver = in.nextInt();
            Checker(ver);
        } catch (Exception e) {
            System.out.println("Please enter an integer");
        }
    }
    
}