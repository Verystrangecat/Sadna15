import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter amount of years of education and the average grade:");
        int ed= input.nextInt();
        int gr= input.nextInt();
        if ((ed>=15) ||(ed>12 && gr>90))
            System.out.println("He can be accepted to the Civil Pilot course");
        else
            System.out.println("He can't be accepted to the Civil Pilot course");
    }
}
