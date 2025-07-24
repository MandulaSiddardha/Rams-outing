class Visa {
    public static void main(String[] args) {
        int age = 25;
        boolean hasPassport = true;
    if(age>=18 && hasPassport){
        System.out.println(" visa application is accepted");
    }else if(age>=18 && !hasPassport){
        System.out.println(" application is rejected");
    }else{
        System.out.println("visa not allowed");
    }
    }
}
