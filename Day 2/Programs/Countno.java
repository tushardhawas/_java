import java.util.Scanner;
     public class Countno {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
int count = 0 ;
     System.out.println("enter the number");
    int num = input.nextInt();

    while(num > 0){

        num = num / 10;
        count ++ ;
    }

    System.out.println("The number is of "+ count +" digit");

input.close();
    }
}