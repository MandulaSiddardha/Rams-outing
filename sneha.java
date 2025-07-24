import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int averagemarks=sc.nextInt();
       System.out.println("average marks :"+averagemarks);
      if(averagemarks >= 90){
          System.out.println("Outstanding");
      }else if(averagemarks>=75){
           System.out.println("Distinction");
      }else if(averagemarks>=60){
           System.out.println("First class");
      }else if(averagemarks>=35){
           System.out.println("Pass");
      }
    else{
        System.out.println("she fails");
    }
    }
}
