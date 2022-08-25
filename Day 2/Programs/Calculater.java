import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        
        
        int answer = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("press x to stop the program");
            System.out.println("enter the operator");
            char op = input.next().trim().charAt(0);
            
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.println("enter two number");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                
                
               if(op == '+'){
                    answer = num1 + num2;
                }
                
                if(op == '-'){
                    answer = num1 - num2;
                }
                if(op == '*'){
                    answer = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                    answer = num1 / num2;
                }}
                if(op == '%'){
                    answer = num1 % num2;
                }
                
                System.out.println("  " + answer );
                
                
            }
            else if(op == 'x' || op == 'X'){
                
                break;
            }
            else{
                System.out.println("invalid opretor");
            }
            
            
        } 
        
    }
}