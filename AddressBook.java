package addressBookMain;

import java.util.*;
import java.util.stream.Collectors;

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
			System.out.println(
					"1-Add\n2-Display\n3-Edit\n4-Delete\n5-Count Person By City\n6-Count Person By State\na-Sort By Name\nb-Sort By City\nc-Sort By State\nd-Sort By Zip\n7-Exit");
			char input = sc.nextLine().charAt(0);
			switch (input) {
			case '1':
				ab.addPerson();
				break;
			case '2':

				System.out.print("Search First Name -: ");
				String firstName1 = sc.nextLine();
				ab.searchPerson(firstName1);
				break;
			case '3':

				System.out.print("Search First Name -: ");
				String firstName2 = sc.nextLine();
				ab.editPerson(firstName2);
				break;
			case '4':

				System.out.print("Search First Name -: ");
				String firstName3 = sc.nextLine();
				ab.deletePerson(firstName3);
				break;
			case '5':
				System.out.print("Search By City -: ");
				String city = sc.nextLine();
				ab.searchByCity(city);
				break;
			case '6':
				System.out.print("Search By State -: ");
				String state = sc.nextLine();
				ab.searchByCity(state);
				break;
			case 'a':
				ab.sortByFirstName();
				break;
			case 'b':
				ab.sortByCity();
				break;
			case 'c':
				ab.sortByState();
				break;
			case 'd':
				ab.sortByZip();
				break;

			case '7':
				System.exit(0);
			}

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

	// Count Person who having Same City
	void searchByCity(String city) {
		long countOfContacts = persons.stream().filter(y -> city.equals(y.City)).count();
		System.out.println("Count Of Person Having Same City: " + countOfContacts);
	}

	// Count Person who having Same State
	void searchBystate(String state) {
		long countOfContacts = persons.stream().filter(y -> state.equals(y.State)).count();
		System.out.println("Count Of Person Having Same State: " + countOfContacts);
	}

	// Sort Contacts In AddressBook By Name
	void sortByFirstName() {
		System.out.println("Sorted Contacts In Address Book By Name");
		persons.stream().sorted((p1, p2) -> p1.FirstName.compareTo(p2.FirstName)).forEach(y -> y.display());
	}

	// Sort Contacts In AddressBook By City Using collection
	void sortByCity() {
		System.out.println("Sorted Contacts In Address Book By City");
		List<PersonInfo> SortByCity = persons.stream().sorted((p1, p2) -> p1.City.compareTo(p2.City))
				.collect(Collectors.toList());
		SortByCity.forEach(y -> y.display());
	}

	// Sort Contacts In AddressBook By State Using collection
	void sortByState() {
		System.out.println("Sorted Contacts In Address Book By State");
		List<PersonInfo> SortByState = persons.stream().sorted((p1, p2) -> p1.State.compareTo(p2.State))
				.collect(Collectors.toList());
		SortByState.forEach(y -> y.display());
	}

	// Sort Contacts In AddressBook By ZipCode Using collection
	void sortByZip() {
		System.out.println("Sorted Contacts In Address Book By Zip");
		List<PersonInfo> SortByState = persons.stream()

				.sorted((p1, p2) -> Long.valueOf(p1.Zip).compareTo(Long.valueOf(p2.Zip))).collect(Collectors.toList());
		SortByState.forEach(y -> y.display());
	}

}
