package Emailapp;

import java.util.Scanner;

import static java.lang.Math.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "boomerinc.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();


        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;


    }
    // Ask for the department
    private  String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){return "sales";}
        else if (depChoice == 2){return "Dev";}
        else if (depChoice == 3) {return "Accounting";}
        else { return "";}



    }
    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;

        }


    // Set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
    public String getEmail(){
        return new String ("Name: " + firstName + " " + lastName + " " + "\nEMAIL: " + email + " " + "\nMAILBOX CAPACITY: " +  mailboxCapacity + "mb");
    }

}
