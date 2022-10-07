package calculator.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean working = true;
        
        calculator c = new calculator();

        System.out.println("WELCOME TO THE CALCULATOR");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = scan.nextInt();

        System.out.println("Enter y: ");
        int y = scan.nextInt();

        while(working){ 

            System.out.println("\nX: " + x + "\nY: " + y + "\n");
            System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Quit\n");
            int options = scan.nextInt();

            switch(options){
                case 1:
                    System.out.println("\nAnswer: " + c.addition(x, y));
                    break;
                case 2:
                    System.out.println("\nAnswer: " + c.subtraction(x, y));
                    break;
                case 3:
                    System.out.println("\nAnswer: " + c.multiplication(x, y));
                    break;
                case 4:
                    System.out.println("\nAnswer: " + c.division(x, y));
                    break;
                case 5: 
                    working = false;
            }
        }
        
    }
}