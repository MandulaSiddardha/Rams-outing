class Marathon {
    public static void main(String[] args) {
       int age = 35;
        boolean valid= true;
    if(age>18 && age<46 && valid){
        System.out.println("she can paricipate");
    }else if(age < 18 && age > 45){
        System.out.println("Paricipation not allowed");
    }else if(!valid){
        System.out.println("participation denied");
    }
    }
}
