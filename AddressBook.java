package addressBookMain;

import java.util.*;


public class AddressBook {
	public static void main(String[] args) {

		
		Contacts ab = new Contacts();
		// Welcome message in address book
		System.out.println("" + "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
				+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
				+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
				+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
				+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
				+ "-------------------WELCOME TO ADDRESS BOOK-----------------------\r\n");
		// loop for select choice
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice: ");
			System.out.println("1-Add\n2-Display\n3-Edit\n4-Delete\n5-Search By City\n6-Exit");
			switch (sc.next().charAt(0)) {
			case '1':
				ab.addPerson();
				break;
			case '2':

				System.out.print("Search First Name -: ");
				String firstName1 = sc.next();
				ab.searchPerson(firstName1);
				break;
			case '3':

				System.out.print("Search First Name -: ");
				String firstName2 = sc.next();
				ab.editPerson(firstName2);
				break;
			case '4':

				System.out.print("Search First Name -: ");
				String firstName3 = sc.next();
				ab.deletePerson(firstName3);
				break;
			case '5':
				System.out.print("Search By City -: ");
				String city = sc.next();
				ab.searchByCity(city);
				break;

			case '6':
				System.exit(0);
			}
			sc.close();

		}

	}

}

class PersonInfo {
	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	String Zip;
	String PhoneNumber;
	String Email;

	PersonInfo(String f, String l, String a, String c, String s, String z, String ph, String e) {
		FirstName = f;
		LastName = l;
		Address = a;
		City = c;
		State = s;
		Zip = z;
		PhoneNumber = ph;
		Email = e;
	}

	// Display Person details
	void display() {
		System.out.println("First Name: " + FirstName + " Last Name: " + LastName + " Address: " + Address + " City: "
				+ City + "  State: " + State + " Zip: " + Zip + " Phone No: " + PhoneNumber + " Email: " + Email
				+ "\n");
	}

}

class Contacts {

	ArrayList<PersonInfo> persons;

	Contacts() {
		persons = new ArrayList<PersonInfo>();

	}

	// Add person in address book
	void addPerson() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------");
		Scanner addInfo = new Scanner(System.in);
	    System.out.print("Enter First Name -: ");
		String FirstName = addInfo.next();

		System.out.print("Enter Last Name -: ");
		String LastName = addInfo.next();

		System.out.print("Enter Address -: ");
		String Address = addInfo.next();

		System.out.print("Enter City -: ");
		String City = addInfo.next();

		System.out.print("Enter State -: ");
		String State = addInfo.next();

		System.out.print("Enter Zip Code -: ");
		String Zip = addInfo.next();

		System.out.print("Enter Phone Number -: ");
		String PhoneNumber = addInfo.next();

		System.out.print("Enter Email Address -: ");
		String Email = addInfo.next();
		PersonInfo p = new PersonInfo(FirstName, LastName, Address, City, State, Zip, PhoneNumber, Email);
		// Check Duplicate Entry using Stream
		boolean checkRepeateEntry = persons.stream().anyMatch(y -> FirstName.equals(y.FirstName));
		if (persons.size() == 0 || checkRepeateEntry == false) {
			System.out.println("---Contact Added---");
			persons.add(p);
		} else {
			System.out.println("Duplicate Entry");
		}
		addInfo.close();

	}

	// edit Person
	void editPerson(String n) {
		Scanner edit = new Scanner(System.in);
		System.out.println(n);
		System.out.println(persons.size());
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.FirstName)) {
				System.out.println("Enter Your ChoiceFor edit : ");
				System.out.println(
						"1-First Name\n2-Last Name\n3-Address\n4-City\n5-State\n6-Zip\n7-Phone Number\n8-Email\n9-Exit");
				char ch = edit.next().charAt(0);

				switch (ch) {
				case '1':
					System.out.println("Old name: " + p.FirstName);
					System.out.print("Enter new first name -: ");
					String firstname = edit.next();
					p.FirstName = firstname;

					break;
				case '2':
					System.out.println("Old name: " + p.LastName);
					System.out.print("Enter new last name -: ");
					String lastname = edit.next();
					p.LastName = lastname;

					break;
				case '3':
					System.out.println("Old address: " + p.Address);
					System.out.print("Enter new address -: ");
					String address = edit.next();
					p.Address = address;
					break;
				case '4':
					System.out.println("Old city" + p.City);
					System.out.print("Enter new first name -: ");
					String city = edit.nextLine();
					p.City = city;
					break;
				case '5':
					System.out.println("Old state: " + p.State);
					System.out.print("Enter new first name -: ");
					String state = edit.nextLine();
					p.Address = state;
					break;
				case '6':
					System.out.println("Old zip " + p.Zip);
					System.out.print("Enter new first name -: ");
					String zip = edit.nextLine();
					p.Zip = zip;
					break;
				case '7':
					System.out.println("Old phone number: " + p.PhoneNumber);
					System.out.print("Enter new first name -: ");
					String phonenumber = edit.nextLine();
					p.PhoneNumber = phonenumber;
					break;
				case '8':
					System.out.println("Old email: " + p.Email);
					System.out.print("Enter new first name -: ");
					String email = edit.next();
					p.Email = email;
					break;
				case '9':
					System.exit(0);

				}
				edit.close();
			}
		}
	}

	// Search person by name
	void searchPerson(String n) {
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.FirstName)) {

				p.display();
			} else {
				System.out.println("--------------------Not Found In Records-----------------------");
			}
		}
	}

	// Delete person method
	void deletePerson(String n) {

		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.FirstName)) {
				persons.remove(i);
				System.out.println("Contact First Name " + p.FirstName);
				System.out.println("------------------Deleted---------------------");
			}
		}
	}

	// Search Person By City
	void searchByCity(String city) {
		persons.stream().filter(y -> city.equals(y.City)).forEach(y -> y.display());
	}

}
