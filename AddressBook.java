package addressBookMain;

import java.util.*;

public class AddressBook {
	public static void main(String[] args) {
		Contacts ab = new Contacts();
		String input;
		// Welcome message in address book
		System.out.println("" + "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
				+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
				+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
				+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
				+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
				+ "-------------------WELCOME TO ADDRESS BOOK-----------------------\r\n");
		// loop for select choice
		while (true) {
			System.out.println("Enter Your Choice: ");
			System.out.println("1-Add\n2-Display\n3-Edit\n4-Delete\n5-Exit");
			Scanner sc = new Scanner(System.in);
			char ch = sc.next().charAt(0);

			switch (ch) {
			case '1':
				ab.addPerson();
				break;
			case '2':
				Scanner search = new Scanner(System.in);
				System.out.print("Search First Name -: ");
				String n = search.nextLine();
				ab.searchPerson(n);
				break;
			case '3':
				Scanner search2 = new Scanner(System.in);
				System.out.print("Search First Name -: ");
				String n2 = search2.nextLine();
				ab.editPerson(n2);
				break;
			case '4':
				Scanner search1 = new Scanner(System.in);
				System.out.print("Search First Name -: ");
				String s1 = search1.nextLine();
				ab.deletePerson(s1);
				break;

			case '5':
				;

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

	public String get() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] get(int i) {
		// TODO Auto-generated method stub
		return null;
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
		Scanner firstname = new Scanner(System.in);
		System.out.print("Enter First Name -: ");
		String FirstName = firstname.nextLine();

		Scanner lastname = new Scanner(System.in);
		System.out.print("Enter Last Name -: ");
		String LastName = firstname.nextLine();

		Scanner address = new Scanner(System.in);
		System.out.print("Enter Address -: ");
		String Address = address.nextLine();

		Scanner city = new Scanner(System.in);
		System.out.print("Enter City -: ");
		String City = city.nextLine();

		Scanner state = new Scanner(System.in);
		System.out.print("Enter State -: ");
		String State = city.nextLine();

		Scanner zip = new Scanner(System.in);
		System.out.print("Enter Zip Code -: ");
		String Zip = zip.nextLine();

		Scanner phonenumber = new Scanner(System.in);
		System.out.print("Enter Phone Number -: ");
		String PhoneNumber = phonenumber.nextLine();

		Scanner email = new Scanner(System.in);
		System.out.print("Enter Email Address -: ");
		String Email = email.nextLine();
		PersonInfo p = new PersonInfo(FirstName, LastName, Address, City, State, Zip, PhoneNumber, Email);
		persons.add(p);

	}

	// edit Person
	void editPerson(String n) {
		System.out.println(n);
		System.out.println(persons.size());
		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (n.equals(p.FirstName)) {
				String temp;
				System.out.println("Enter Your ChoiceFor edit : ");
				System.out.println(
						"1-First Name\n2-Last Name\n3-Address\n4-City\n5-State\n6-Zip\n7-Phone Number\n8-Email\n9-Exit");
				Scanner sc2022 = new Scanner(System.in);
				char ch = sc2022.next().charAt(0);

				switch (ch) {
				case '1':
					System.out.println("Old name: " + p.FirstName);
					Scanner fname = new Scanner(System.in);
					System.out.print("Enter new first name -: ");
					String firstname = fname.nextLine();
					p.FirstName = firstname;

					break;
				case '2':
					System.out.println("Old name: " + p.LastName);
					Scanner lname = new Scanner(System.in);
					System.out.print("Enter new last name -: ");
					String lastname = lname.nextLine();
					p.LastName = lastname;

					break;
				case '3':
					System.out.println("Old address: " + p.Address);
					Scanner address1 = new Scanner(System.in);
					System.out.print("Enter new address -: ");
					String address = address1.nextLine();
					p.Address = address;
					break;
				case '4':
					System.out.println("Old city" + p.City);
					Scanner city1 = new Scanner(System.in);
					System.out.print("Enter new first name -: ");
					String city = city1.nextLine();
					p.City = city;
					break;
				case '5':
					System.out.println("Old state: " + p.State);
					Scanner state1 = new Scanner(System.in);
					System.out.print("Enter new first name -: ");
					String state = state1.nextLine();
					p.Address = state;
					break;
				case '6':
					System.out.println("Old zip " + p.Zip);
					Scanner zip1 = new Scanner(System.in);
					System.out.print("Enter new first name -: ");
					String zip = zip1.nextLine();
					p.Zip = zip;
					break;
				case '7':
					System.out.println("Old phone number: " + p.PhoneNumber);
					Scanner phonenumber1 = new Scanner(System.in);
					System.out.print("Enter new first name -: ");
					String phonenumber = phonenumber1.nextLine();
					p.PhoneNumber = phonenumber;
					break;
				case '8':
					System.out.println("Old email: " + p.Email);
					Scanner email1 = new Scanner(System.in);
					System.out.print("Enter new first name -: ");
					String email = email1.nextLine();
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
}
