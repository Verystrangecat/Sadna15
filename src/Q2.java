import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of wins and fails of the team:");
        int w= input.nextInt();
        int f= input.nextInt();
        if(w>6 && f<5)
            System.out.println("The team can go to the Nationals");
        else
            System.out.println("The team can't go to the Nationals");
    }
}
