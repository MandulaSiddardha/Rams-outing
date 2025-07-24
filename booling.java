class Booking {
    public static void main(String[] args) {
        boolean vipseat=true;
        boolean isWeekday = true;
        boolean isWeekend = true;
    if(isWeekend && vipseat){
        System.out.println("ticket price is 500/-");
    }else if(isWeekend && !vipseat){
        System.out.println("ticket price is 300/-");
    }else if( isWeekday && vipseat){
        System.out.println("ticket price is 400/-");
    }else if(isWeekday && !vipseat){
        System.out.println("ticket price is 200/-");
    }
    }
}
