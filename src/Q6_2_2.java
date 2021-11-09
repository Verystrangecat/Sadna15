import java.util.Scanner;

public class Q6_2_2 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter the date (day, month, year):");
            int d= input.nextInt();
            int m= input.nextInt();
            int y= input.nextInt();
            if ((m>=9 && m<=12 && y==2021 && d<=30 && d>=1) )
                System.out.println("The date is valid in the current school year.");
            if(m>=1 && m<=5 && y==2022 && d<=30 && d>=1)
                System.out.println("The date is valid in the current school year.");
            if (m==6 && y==2022 && d<=20 && d>=0)
                System.out.println("The date is valid in the current school year.");
           if (!(d<=30 && d>=1)&& m>=9 && m<=12 && y==2021)
               System.out.println("The date is invalid in the current school year. The day is wrong");
           if(d<=30 && d>=1&& !(m>=9 && m<=12) && y==2021)
               System.out.println("The date is invalid in the current school year. The month is wrong");
           if(d<=30 && d>=1&& m>=9 && m<=12 && y!=2021)
               System.out.println("The date is invalid in the current school year. The year is wrong");
           if(m>=1 && m<=5 && y==2022 && !(d<=30 && d>=1))
               System.out.println("The date is invalid in the current school year. The day is wrong");
           if(!(m>=1 && m<=5) && y==2022 && d<=30 && d>=1)
               System.out.println("The date is invalid in the current school year. The month is wrong");
           if(m>=1 && m<=5 && y!=2022 && d<=30 && d>=1)
               System.out.println("The date is invalid in the current school year. The year is wrong");
           if(m==6 && y==2022 && !(d<=20 && d>=0))
               System.out.println("The date is invalid in the current school year. The day is wrong");
           if(m!=6 && y==2022 && d<=20 && d>=0)
               System.out.println("The date is invalid in the current school year. The month is wrong");
           if(m==6 && y!=2022 && d<=20 && d>=0)
               System.out.println("The date is invalid in the current school year. The year is wrong");
        }

    }


