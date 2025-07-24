class Main {
    public static void main(String[] args) {
     int distance = 10000;
      if(distance >= 20000){
          System.out.println("it needs full service");
      }else if(distance>=10000 && distance<20000){
          System.out.println("it needs semi service");
      }else if(distance<10000){
          System.out.println("only general checkup needed");
      }
    }
}
