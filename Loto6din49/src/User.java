
import java.util.Scanner;
public class User {

	 private  String numeUser;
	 private String numereUser;
	
	public String getNumeUser() {
		return numeUser;
	}
	
	public String getNumereUser() {
		return numereUser;
	}
	
	public void userInput (){
		Scanner input = new Scanner(System.in);
		System.out.println("Introdu numele!");
		this.numeUser = input.nextLine();
		System.out.println("Introdu 6 numere pana la 49!");
		this.numereUser = input.nextLine();
		
	}
	
    
	
}
