package pramidexam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

interface screen{
	void syst();
	void syst2();
}

abstract class first implements screen{
	public void syst() {
		System.out.println("Heyo");
	}
}

class second extends first{
	public void syst2() {
		System.out.println("A wild pokemon appeard!");
	}
}

public class main {
	Scanner sc = new Scanner(System.in);
	String naPok, PokBal;
	int CP;
	
	ArrayList<Pokemon> poke = new ArrayList <>();
	ArrayList<String> pokename = new ArrayList <>();
	ArrayList<Pokeball> pokeB = new ArrayList <>();
	ArrayList<String> pokeball = new ArrayList <>();
	
	public main() {
		
		int rand1;
		Random rd = new Random();
		rand1 = rd.nextInt(5);
		int rand2;
		rand2 = rd.nextInt(0,100);
		
		pokename.add("Pikachu");
		pokename.add("Snorlax");
		pokename.add("Charmander");
		pokename.add("Mewtwo");
		pokename.add("Thievul");
		pokename.add("Kleavor");
		Pokemon p = new Pokemon(pokename.get(rand1), rand2);
		poke.add(p);
		
		pokeball.add("Premierball");
		pokeball.add("Greatball");
		
		int temp = p.getCP();
		int percent;
		int choice;
		screen a= new second();
		
		do {
			a.syst();
			a.syst2();
			System.out.printf("\nPokemon name : %s\n", p.getNaPok());
			System.out.printf("Pokemon level : %d\n\n", temp);
			System.out.println("Choose your ball :");
			System.out.println("1. " + pokeball.get(0));
			System.out.println("2. " + pokeball.get(1));
			System.out.println("3. Run :3");
			System.out.print(">> ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				int rand3 = rd.nextInt(15,75);
				int temp1 = temp*rand3;
				percent = (25)-(temp1%(temp/2));
				System.out.println("Gotcha rate " + percent + "%!");
				sc.nextLine();
				break;
			case 2:
				int rand4 = rd.nextInt(35,50);
				int temp2 = temp*rand4;
				percent = (50)-(temp2%(temp/2));
				System.out.println("Gotcha rate " + percent + "%!");
				sc.nextLine();
				break;
			case 3:
				System.out.println("Okay... loser!");
				sc.nextLine();
				break;
			default:
				
				break;
			}
		}while(choice!=3);
	}
	
	public static void main(String[] args) {
		new main();
	}
}

	