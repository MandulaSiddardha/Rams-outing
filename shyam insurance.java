import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter shyam age:");
      int age=sc.nextInt();
      
      if(age>60){
          System.out.println("premium is 5000");
      }else if(age >= 40 && age <60){
          System.out.println("premium is 3000");
      }else if(age >= 20 && age <40){
          System.out.println("premium is 1500");
      }else if(age<20){
        System.out.println("premium is 1000");
      }
    }
}
