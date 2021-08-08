import java.util.Scanner;
import java.io.*;

public class basicCal {
    public static void main(String[] args) throws IOException {

        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter an option : Addition = 1 or Subscript = 2 or Multiplication =3");
        int operator = uInput.nextInt();

        Scanner s = new Scanner(new File("sample.TXT"));
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        if (operator==1) {

            System.out.println(n1+n2);
        }
        else if (operator==2) {
            System.out.println(n1-n2);
        }
        else if (operator==3) {

            System.out.println(n1*n2);
        }

    }
}
