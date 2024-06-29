package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName, lastName,infos, password, department, email, companySuffix = "arsif.com";
    private int defaultPasswordLength = 10;


    public String getPassword() {
        return password;
    }

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
    }

    private String setDepartment() {
        System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Dev";
        } else if (depChoice == 3) {
            return "Acc";
        } else {
            return "";
        }
    }

    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String ShowInfo() {
      infos = "Full name: " + firstName + " " + lastName + "\n" +
        "Email:" + email + "\n" +
        "Password: " + password;

        return infos;
    }
}