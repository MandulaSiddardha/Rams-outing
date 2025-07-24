import java.util.Scanner;

class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        sc.nextLine(); // consume the newline character

        System.out.print("Is Priya a member? (Yes/No): ");
        String membershipStatus = sc.nextLine();

        System.out.println("amount: " + amount);

        if(amount >= 10000 && membershipStatus.equalsIgnoreCase("yes")) {
            System.out.println("She gets 30% discount");
        } else if(amount >= 5000 && membershipStatus.equalsIgnoreCase("yes")) {
            System.out.println("She gets 20% discount");
        } else if(amount > 0 && membershipStatus.equalsIgnoreCase("no")) {
            System.out.println("She gets 5% discount");
        }
    }
}
