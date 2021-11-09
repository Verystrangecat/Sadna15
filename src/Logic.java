import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            int n1,n2;
            System.out.println("enter two numbers");
            n1=input.nextInt();
            n2=input.nextInt();
            if(n1>0 && n2>0)
                System.out.println("positive");
            System.out.println("end");
        }
    }


