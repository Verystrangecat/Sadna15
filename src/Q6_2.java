import java.util.Scanner;

public class Q6_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the date (day, month, year):");
        int d= input.nextInt();
        int m= input.nextInt();
        int y= input.nextInt();
        if ((m>=9 && m<=12 && y==2021 && d<=30 && d>=1) )
            System.out.println("The date is valid in the current school year.");
        else if(m>=1 && m<=5 && y==2022 && d<=30 && d>=1)
            System.out.println("The date is valid in the current school year.");
        else if (m==6 && y==2022 && d<=20 && d>=0)
            System.out.println("The date is valid in the current school year.");
        else
            System.out.println("The date isn't valid in the current school year.");
    }

}
