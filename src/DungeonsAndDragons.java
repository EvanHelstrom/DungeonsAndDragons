import java.util.*;
public class DungeonsAndDragons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You enter the marketplace, and you see 3 men. Which one would you like to approach first (1) (2) or (3)");
		String npcChoice = scanner.nextLine();
		try{Integer.parseInt(npcChoice);}
		catch (Exception e)
		{
			System.out.println("Fuck off thats not what I asked...");
		};
		boolean proceed = false;
		String GeneralStoresayings[] = {"Hello and welcome to my shop!","Hello traveler!","How can I help you?"};
		int randomKey = (int) Math.round(Math.random()*2);
		System.out.println(GeneralStoresayings[randomKey]);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Well hello " + name + ", its nice to see you.\nI have many items! Would you like to see them?");
		String input = scanner.nextLine();
		if(input.toLowerCase().equals("yes")) {
			proceed = true;
		}
		if(proceed) {
		System.out.println("Alright! Right this way....");
		}
		
	}

}
