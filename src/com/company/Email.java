package com.company;

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

        //TODO: call a method askign for the department -return the department
    }

    //TODO: ask for the department

    //TODO: generate a random password

    //TODO: set the mailbox capacity

    //TODO: set alternate email

    //TODO: change the email

}
