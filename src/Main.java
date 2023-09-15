import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What are your home maintenance costs for Summer?");
        int summerCosts = scan.nextInt();
        System.out.println("What are your home maintenance costs for Fall?");
        int fallCosts = scan.nextInt();
        System.out.println("What are your home maintenance costs for Winter?");
        int winterCosts = scan.nextInt();
        System.out.println("What are your home maintenance costs for Spring?");
        int springCosts = scan.nextInt();

        int yearlyCost = summerCosts + fallCosts + winterCosts + springCosts;

        System.out.println("Your yearly maintenance cost is $ " + yearlyCost);

    }
}