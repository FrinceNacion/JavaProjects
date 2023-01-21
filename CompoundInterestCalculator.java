import java.util.InputMismatchException;
import java.util.Scanner;

public class CompoundInterestCalculator{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter principal value: ");
            int p = input.nextInt();
            System.out.println("Enter annual rate: ");
            double r = input.nextDouble();
            
            System.out.println("Enter compund periods: "+"\n"+
                "1 if compounded annualy"+"\n"+
                "2 if compounded semi-annualy"+"\n"+
                "4 if compounded quarterly"+"\n"+
                "12 if compounded monthly"+"\n"+
                "365 if compoundeddaily");
            
            int m = input.nextInt();
            System.out.println("Enter the number of years: ");
            int y = input.nextInt();
            int n = m*y;

            System.out.println("Given values: "+"\n"+
                "Principal value: "+p+"\n"+
                "Annual rate: "+r+"\n"+
                "Compound period: "+m+"\n"+
                "Total number of compound period: "+n);
            
            /*Compound Amount */
            double st = r/m + 1;
            double nd = Math.pow(st, n);
            double rd = nd*p;

            /*Compound Interest */
            double th = rd-p;
            
            System.out.println("You will have "+rd+" at the end of "+y+" years"+"\n"+
                "and the compoud interest is "+th);
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter an integer");
        }
    }
} 

