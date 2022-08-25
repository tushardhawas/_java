public class Conditional {

    public static void main(String[] args) {
        
            // Syntax of if statements:
            // if (true or false) {
            //     // body
            // } else {
            //     // do this
            // }
        
//     if else statements
        int ssalary = 400;
      if (ssalary > 100) {
            ssalary = ssalary + 30000;
        } else {
            ssalary = ssalary + 4000;
        }
        System.out.println(ssalary);
       // multiple if-else
        int salary = 300;
        if (salary > 10000) {
            salary += 2000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);

        int a = 30;
        

        if (a != 5) {
            System.out.println("Hello World");
        }
    }
}