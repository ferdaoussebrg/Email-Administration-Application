package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {

        Email em1 = new Email("Ferdaousse", "Bourzgui");
        System.out.println("Your Infos are: \n"  + em1.ShowInfo());

        System.out.println("DO YOU WANT TO CHANGE YOUR PASSWORD? (Y/N)");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        if (response.equals("Y")) {
            em1.changePassword(em1.randomPassword(10));
            System.out.println("Your new password is: " + em1.getPassword());
        } else if (response.equals("N")) {
                System.out.println("Your password is: ");
            }

               }
    }

