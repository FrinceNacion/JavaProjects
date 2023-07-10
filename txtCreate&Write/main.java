import java.util.Scanner;

public class PerformanceTask1 {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("File name:");
            String fileName = inp.nextLine();
            myClass.createFile(fileName);
            System.out.println("Write content:");
            String input = inp.nextLine();
            myClass.writeFile(input);
        }catch (Exception e) {
           System.out.println("Error");
        }
    }
}
