import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0039 390 4044");
	
	
	
	public static void main(String[] args) {
	
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("Enter action:");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Shutting down...");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			
			
			
			
			}
			
		}

	}
	
	private static void removeContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Successfully deleted");
		}else {
			System.out.println("error deleting contact");
		}
	}
	
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("Name: "+ existingContactRecord.getName()+"Phone number is"+ existingContactRecord.getPhoneNumber());	
	}
	
	
	private static void startPhone() {
		System.out.println("Starting phone...");
	}
	private static void printActions() {
		System.out.println("\nAvailable actions : \nprss");
		System.out.println("0~6");
		System.out.println("Choose your action: ");
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added" + name+ "phone ="+ phone);
		}else {
			System.out.println("Cannot add"+ name+"already on file");
			
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existContactRecord = mobilePhone.queryContact(name);
		if(existContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println("Enter new contact name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact phone number:");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existContactRecord, newContact)) {
			System.out.println("successfully updated record");
		}
		else {
			System.out.println("Error updating record");
		}
		}
	}



