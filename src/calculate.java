import java.util.Scanner;

public class calculate {


    public static void main(String[] args) {
        new calculate().listen();


    }

    private void listen() {
        //Make Scanner
        Scanner scanner = new Scanner(System.in);

        //Client/User Input
        System.out.println("Please enter your first vaule");
        int x = scanner.nextInt();
        System.out.println("Please enter your second vaule");
        int y = scanner.nextInt();

        //Close Scanner

        //Compute
        int add = x + y;
        int muti = x * y;
        int div = x / y;
        int sub = x - y;


        //Print
        System.out.println("Results:");
        System.out.println("sum: " + add);
        System.out.println("muti: " + muti);
        System.out.println("div: " + div);
        System.out.println("sub: " + sub);

        }
    }

