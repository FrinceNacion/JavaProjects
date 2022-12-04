import java.util.Scanner;
public class annuityCalculator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter PV if present value"+"\n"
        + "Enter FV if future value");
        String Mode = Input.nextLine();
        System.out.println("Enter periodic payment: ");
        int r = Input.nextInt();
        System.out.println("Enter rate per period: ");
        double i = Input.nextDouble();
        System.out.println("Enter payment periods: ");
        int n = Input.nextInt();

    switch (Mode) {
        case "PV":
        double num_1st = i + 1;
        double num_2nd = Math.pow(num_1st, n);
        double num_3rd = num_2nd - 1;
        System.out.println(num_3rd);

        double den_1st = Math.pow(num_1st, n);
        double den_2nd = den_1st*i;
        System.out.println(den_2nd);

        double third = num_3rd/den_2nd;
        System.out.println(third);

        double finalAnswer = r*third;
        System.out.println("Present Value: " + finalAnswer);
            break;
        case "FV" :
        double num_fv = i + 1;
        double num_fv2 = Math.pow(num_fv, n);
        double num_fv3 = num_fv2 - 1;
        System.out.println(num_fv3);

        double Second = num_fv3/i;
        double Third = Second*r;
        System.out.println("Future Value: "+Third);
            break;
    
        default:
            break;
    }
    }
}
