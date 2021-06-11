package emaillApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;

	// Constructor to receive the first name and last name;
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "company.com";
		System.out.println("Your email is: " + this.email);
	}

	// Ask for the department;
	public String setDepartment() {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Department code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the code: ");
		int deptCode = input.nextInt();

		if (deptCode == 1)
			return "sales";
		else if (deptCode == 2)
			return "dev";
		else if (deptCode == 3)
			return "acct";
		else
			return "";
	}

	// Generate a random password;
	public String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%^&*()";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return (new String(password));
	}

	// Set the mailbox capacity;

	// Set the alternate email;

	// Change the password;

	public void changePassword(String password) {
		this.password = password;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";	}
	

}
