//Java practice questions

// import java.util.Scanner;
// public class Practicequestions {
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     char ch = sc.next().charAt(0);
    
//     int ascii = ch;
    
//     System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
//   }
// }





// import java.util.*;
// public class Practicequestions{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
    
//     String department = sc.nextLine();
//     String address = sc.nextLine();
    
    
//     System.out.println("Department: " + department);
//     System.out.println("College Address: " + address);
//   }
// }




// import java.util.*;
// public class Practicequestions{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String input = sc.nextLine().trim().toLowerCase();
    
    
//     if(input.equals("yes")){
//       System.out.println("Here's an ASCII art of a cat:");
//       System.out.println(" /\\_/\\ ");
//       System.out.println("( o.o )");
//       System.out.println(" > ^ <");
      
      
//     }
//     else{
//       System.out.println("Alright! No cat art for now.");
//     }
//   }
// }





// import java.util.*;
// public class Practicequestions{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
    
//     int a = sc.nextInt();
//     int b = sc.nextInt();
    
//     System.out.println("Rectangle pattern:");
    
    
//     for(int i=1;i<=a;i++){
//       for(int j=1;j<=b;j++){
//         if(i == 1 || j == 1 || i == a || j ==b){
//           System.out.print("+");
//         }
//         else {
//           System.out.print("-");
//         }
        
//       }
//       System.out.println();
//     }
//   }
// }





import java.util.Scanner;

public class Practicequestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
        }

        scanner.close();
    }
}

import java.util.*;
public class Practicequestions{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String fullname = sc.nextLine();
  String lastname = sc.nextLine();
  
  String name = fullname + " " + lastname;
  
  
  System.out.println("Full Name: " + name);
  }
}






import java.util.*;
public class Practicequestions{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  int totalminutes = sc.nextInt();
  
  int hours = totalminutes / 60 ;
  int minutes = totalminutes % 60 ;
  
  
  System.out.println(totalminutes + " minutes is " + hours + " hours and " + minutes + " minutes. ");
  
  }
}




import java.util.*;
public class Practicequestions{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    
    System.out.println("Before swapping: a = " + a + ", b = " + b);
    
    
    
    a = a + b;
    b = a - b;
    a = a - b;
    
    
    
    System.out.println("After swapping: a = " + a + ", b = " + b);
    
    
    
    
  }
}  





import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int choice = sc.nextInt();
    double temp = sc.nextDouble();
    
    
    if(choice == 2){
      double c = (temp - 32) * 5 / 9;
      System.out.println("Temperature in Celsius: " + c);
    }else if (choice == 1){
      double f = (temp * 9 / 5) + 32;
      System.out.println("Temperature in Fahrenheit: " + f);
    }
  }
}




