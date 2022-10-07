package calculator.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        calculator c = new calculator();

        System.out.println("WELCOME TO THE CALCULATOR");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = scan.nextInt();

        System.out.println("Enter y: ");
        int y = scan.nextInt();

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. 5Divide\n ");
        int options = scan.nextInt();

        switch(options){
            case 1:
                c.addition(x, y);
                break;
            case 2:
                c.subtraction(x, y);
                break;
            case 3:
                c.multiplication(x, y);
                break;
            case 4:
                c.division(x, y);
                break;
        }
    }
}