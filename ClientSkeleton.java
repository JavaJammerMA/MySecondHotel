package hotelParts;
import java.util.ArrayList;
import java.util.Scanner;
public class ClientSkeleton {
	
	protected static ArrayList<String[]> clientList = new ArrayList<String[]>();
	private  String firstName;
	private  String lastName;
	private  String age;
	private  String idNumber;
	private  String gender;
	private Scanner userInput;
	
	public ClientSkeleton(){
		
        userInput = new Scanner(System.in);
		
	 	System.out.println("Please enter first name: ");
		this.firstName = userInput.next();
		System.out.println("Please enter your last name: ");
		this.lastName = userInput.next();
		System.out.println("Please enter your age: ");
		this.age = userInput.next();
		System.out.println("Please enter your ID number: ");
		this.idNumber = userInput.next();
		System.out.println("Please enter your gender: ");
		this.gender = userInput.next();
		
		
		String[] clientArray = {this.firstName, this.lastName, this.age, this.idNumber, this.gender};
		clientList.add(clientArray);
		
		System.out.println("Client processed, inser next");
		
		
		
	}
	
	
	public static void printClients(){
		
		System.out.println("Current clients in the hotel: ");
		System.out.println("First Name, Second Name, Age, ID, Sex");
		
		for(String[] client : clientList){
			
			for(int i = 0; i < client.length; i++){
				
			System.out.print( client[i].toString() + " ");
			
			}
			System.out.println();
			}
	}
	
	
	
}
