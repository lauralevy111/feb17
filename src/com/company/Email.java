package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alertnateEmail;

    //Constructor to receive first name and last name
    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName= lastName;
        System.out.println("email created: " +this.firstName + " " + this.lastName);

        // call method asking for the department -return the department
        this.department = setDepartment();
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

    //TODO: generate a random password

    //TODO: set the mailbox capacity

    //TODO: set alternate email

    //TODO: change the email

}
