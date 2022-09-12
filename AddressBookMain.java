package addressBookMain;

import java.util.Scanner;
class  AddressBookMain1{
	    String FirstName;
	    String LastName;
	    String Address;
	    String City;
	    String State;
	    String Zip;
	    String PhoneNumber;
	    String Email; 
	  public void getInput() {                  
		  System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			Scanner firstname= new Scanner(System.in); 
	    	System.out.print("Enter First Name -: ");
	    	 FirstName= firstname.nextLine();
	    	
	    	Scanner lastname= new Scanner(System.in); 
	    	System.out.print("Enter Last Name -: ");
	    	 LastName= firstname.nextLine();
	    	
	    	Scanner address= new Scanner(System.in); 
	    	System.out.print("Enter Address -: ");
	    	 Address= address.nextLine();
	    	
	    	Scanner city= new Scanner(System.in); 
	    	System.out.print("Enter City -: ");
	    	 City= city.nextLine();
	    	
	    	
	    	Scanner zip= new Scanner(System.in); 
	    	System.out.print("Enter Zip Code -: ");
	    	 Zip= zip.nextLine();
	    	
	    	Scanner phonenumber= new Scanner(System.in); 
	    	System.out.print("Enter Phone Number -: ");
	    	 PhoneNumber= phonenumber.nextLine();
	    	
	    	Scanner email= new Scanner(System.in); 
	    	System.out.print("Enter Email Address -: ");
	    	 Email= email.nextLine();	
	  }
	  public void getOutput() {
		  System.out.println("Contact1 [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City="
					+ City + ", State=" + State + ", Zip=" + Zip + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email
					+ "]");
			 
		}

	}
public class AddressBookMain extends AddressBookMain1 {
	 
	
	public static void main(String[] args) {
		 System.out.println(""
	    			+ "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
	    			+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
	    			+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
	    			+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
	    			+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
	    			+ "-------------------WELCOME TO ADDRESS BOOK-----------------------\r\n");
		
		AddressBookMain1 Contact1= new AddressBookMain1();
		AddressBookMain1 Contact2 = new AddressBookMain1();
		AddressBookMain1 Contact3 = new AddressBookMain1();
	    Contact1.getInput();
	    Contact2.getInput();
	    Contact3.getInput();
	    Contact1.getOutput();
	    Contact2.getOutput();
	    Contact3.getOutput();
		}
	 
}
	



