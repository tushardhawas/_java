import java.util.Scanner;

     public class Casecheck  {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     System.out.println("Enter the Character");
     char alpha = input.next().trim().charAt(0);
     input.close();
     if(alpha >= 'a' & alpha <= 'z')
     System.out.println("the character is lowercase");
     else{
         
         System.out.println("the character is uppercase");
     }

    }
}