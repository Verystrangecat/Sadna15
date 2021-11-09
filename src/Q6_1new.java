import java.util.Scanner;

public class Q6_1new {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the date (Day, month, year):");
        int d= input.nextInt();
        int m= input.nextInt();
        int y= input.nextInt();
        if(d<=30 && d>0)
            if(m<=12 && m>0)
                if(y<2101 && y>=2001)
                    System.out.println("The date is valid");
                else System.out.println("The date is invalid. The year is wrong");
                else System.out.println("The date is invalid. The month is wrong");
            else System.out.println("The date is invalid. The day is wrong");

        }
    }

