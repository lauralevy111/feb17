package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;

    public String email;

    private int mailboxCapacity=100;
    private int defaultPasswordLength = 10;
    private String alertnateEmail;
    private String companysuffix = "lauracorp.com";

    //Constructor to receive first name and last name
    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName= lastName;
        System.out.println("email created for: " +this.firstName + " " + this.lastName);

        // call method asking for the department -return the department
        this.department = setDepartment();
        //System.out.println("department: " + this.department);

        // call method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //^will create null pointer exception bc defaultPasswordLength is null
        System.out.println("your password is: " + this.password);

        //combine elements and generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companysuffix;
        System.out.println("email: "+ email);

    }

    // ask for the department
    private String setDepartment(){
        String department = "";

        System.out.println("enter the deparmtent :\n1 for Sales \n2 for Development \n3 for Accounting \n0 for NA");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){ department = "sales"; }
        else if (depChoice==2) { department = "dev";}
        else if (depChoice == 3) {department = "acct";}
        //if(depChoice == 0) department = not applicable
        else if (depChoice == 0) {department = "na";}

        return department;
    }

    //generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] =passwordSet.charAt(rand);
        }

        return new String(password);

    }

    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

    //set alternate email
    public void setAlternateEmail(String altEmail){
        this.alertnateEmail=altEmail;
    }

    //change the password
    public void changePassword(String newPassword){
        this.password=newPassword;
    }

    //TODO: GETTER METHODS

}
