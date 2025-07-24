class Bus {
    public static void main(String[] args) {
        int distance = 70;
        boolean isWeekday = true;
        boolean isWeekend = true;
    if(distance<=50){
        System.out.println("fare is 50/-");
    }else if(distance >= 50 && distance <= 100){
        System.out.println("fair is 100/-");
    }else if(distance >100 && isWeekday){
        System.out.println("fair is 200/-");
    }else if(distance >100 && isWeekend){
        System.out.println("fair is 300/-");
    }
    }
}
