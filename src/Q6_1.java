import java.util.Scanner;

public class Q6_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the date (day, month, year):");
        int d= input.nextInt();
        int m= input.nextInt();
        int y= input.nextInt();
        if(d<=30 && d>0 && m<=12 && m>0 && 2001<=y && y<2101 )
            System.out.println("The date is valid");
       if (!(d<=30 && d>0))
           System.out.println("The date is invalid. The day is wrong");
       if (!( m<=12 && m>0))
           System.out.println("The date is invalid. The month is wrong");
       if (!(2001<=y && y<2101))
           System.out.println("The date is invalid. The year is wrong");




    }
}
