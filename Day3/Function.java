import java.util.Scanner;

public class Function {

    public static void main(String[] args){
            sum();
    }
static void sum(){
    Scanner num = new Scanner(System.in);

        System.out.println("enter no. one");
        int input1 = num.nextInt(); 
        
        System.out.println("enter no. two");
        
        int input2 = num.nextInt(); 

        int sum2 = input1 + input2;
        System.out.println(+sum2 );
        num.close();


}
}