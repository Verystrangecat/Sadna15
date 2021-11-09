import java.util.Scanner;

public class Q6_2new {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter the date (day, month, year):");
            int d= input.nextInt();
            int m= input.nextInt();
            int y= input.nextInt();
            if (d>0 && d<=30)
                if(m>=9 && m<=12)
                {if (y==2021)
                    System.out.println("The date is valid");
                else System.out.println("The date is invalid. The year is wrong");}
                else if(m>0 && m<6){
                    if (y==2022)
                        System.out.println("The date is valid");
                    else System.out.println("The date is invalid. The year is wrong");}
                else if(m==6){
                    if (d>=1 && d<=20)
                        if(y==2022)
                            System.out.println("The date is valid");
                        else System.out.println("The date is invalid. The year is wrong");
                    else System.out.println("The date is invalid. The day is wrong");}
                else System.out.println("The date is invalid. The month is wrong");
            else System.out.println("The date is invalid. The day is wrong");
        }

    }


