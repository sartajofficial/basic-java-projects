package PasswordGenerator.main;

import java.util.Scanner;

import static PasswordGenerator.logic.OTPGeneratorLogic.OTP;
import static PasswordGenerator.logic.PasswordGeneratorLogic.geek_Password;

public class PasswordGeneratorMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("To generate password, Press 1 \nTo generate OTP, Press 2 \nTo exit, Press any other number");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Enter the length of password");
                int length1 = sc.nextInt();
                System.out.println(geek_Password(length1));
                break;
            case 2:
                System.out.println("Enter the length of OTP");
                int length2 = sc.nextInt();
                System.out.println(OTP(length2));
                break;

            default: System.exit(0);

        }
    }
}
