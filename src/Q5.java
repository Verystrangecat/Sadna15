import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        if(n1==n2 && n1==n3 && n2==n3)
            System.out.println("All numbers are equal");
        else if(n1==n2 || n1==n3 || n2==n3)
            System.out.println("Only two numbers are equal");
        else if (n1!=n2 && n1!=n3 && n2!=n3)
            System.out.println("The numbers are different");

    }
}
