package Projects;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
    int score = 0;
    Random rndm = new Random();
    try (Scanner in = new Scanner(System.in)) {
        String[] questions = {
            "What is 2 x 3?",
            "What is 4 x 5?",
            "What is 6 x 7?",
            "What is 8 x 9?",
            "What is 10 x 11?",
            "What is 12 x 13?",
            "What is 14 x 15?",
            "What is 16 x 17?",
            "What is 18 x 19?",
            "What is 20 x 21?"
            };
        int[] answerBank = {2 * 3,4 * 5,6 * 7,8 * 9,10 * 11,12 * 13, 14 * 15,16 * 17,18 * 19,20 * 21};

        for(int i=0;i<5;i++){
           int res =  rndm.nextInt(1,10);
           System.out.println(questions[res]);
           int answer = in.nextInt();
                if(answerBank[res] == answer){
                    System.out.println("You're correct");
                    score++;
                } else{
                    System.out.println("Try again");
                    break;
                }
            System.out.println("Score: "+score);
            }
        }
    }
}
