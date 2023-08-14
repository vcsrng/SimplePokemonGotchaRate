package pokemain;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
		rand2 = rd.nextInt(10,4341);
		
		pokename.add("Pikachu");
		pokename.add("Snorlax");
		pokename.add("Charmander");
		pokename.add("Mewtwo");
		pokename.add("Thievul");
		pokename.add("Kleavor");
		Pokemon p = new Pokemon(pokename.get(rand1), rand2);
		poke.add(p);
		
		pokeball.add("Standard Pokeball");
		pokeball.add("Greatball");
		pokeball.add("Ultraball");
		pokeball.add("Masterball");
		
		int temp = p.getCP();
		int percent;
		int choice;
		
		do {
			System.out.println("Heyo");
			System.out.println("A wild pokemon appeard!");
			System.out.printf("\nPokemon name : %s\n", p.getNaPok());
			System.out.printf("Pokemon combat power : %d\n\n", temp);
			System.out.println("Choose your ball :");
			System.out.println("1. " + pokeball.get(0));
			System.out.println("2. " + pokeball.get(1));
			System.out.println("3. " + pokeball.get(2));
			System.out.println("4. " + pokeball.get(3));
			System.out.println("5. Run :3");
			System.out.print(">> ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				percent = (1160*100)/(temp);
				if(percent<=100) {
					System.out.println("Gotcha rate " + percent + "%!");
				}else {
					System.out.println("Gotcha rate 100%!");
				}
				sc.nextLine();
				break;
			case 2:
				percent = (1700*100)/(temp);
				if(percent<=100) {
					System.out.println("Gotcha rate " + percent + "%!");
				}else {
					System.out.println("Gotcha rate 100%!");
				}
				sc.nextLine();
				break;
			case 3:
				percent = (2700*100)/(temp);
				if(percent<=100) {
					System.out.println("Gotcha rate " + percent + "%!");
				}else {
					System.out.println("Gotcha rate 100%!");
				}
				sc.nextLine();
				break;
			case 4:
				System.out.println("Gotcha rate 100%!");
				sc.nextLine();
				break;
			case 5:
				System.out.println("Okay... loser!");
				sc.nextLine();
				break;
			default:
				
				break;
			}
		}while(choice!=5);
	}
	public static void main(String[] args) {
		new main();
	}
}

	