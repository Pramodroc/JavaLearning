import java.util.*;
public class Main{
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




import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    try{
      int intValue = Integer.parseInt(input);
      double doubleValue = Double.parseDouble(input);
      
      System.out.println("Integer value: " + intValue);
      System.out.println("Double value: " + doubleValue);
      
    }catch(NumberFormatException e){
      System.out.println("Invalid input. Please enter a valid number.");
    }
  }
}
