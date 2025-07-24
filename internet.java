class internet {
    public static void main(String[] args) {
      String plan = "Basic";
      int usage = 300;
    if(plan.equals("Basic") && usage >500){
        System.out.println("you should take premium");
    }else if(plan.equals("Standard") && usage >1000){
        System.out.println("you should take ultra");
    }else if(plan.equals("Basic") && usage<600){
        System.out.println("continue same plan");
    }
}
}
