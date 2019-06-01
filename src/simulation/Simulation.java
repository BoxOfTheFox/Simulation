package simulation;

import army.*;

/**
 * klasa symulacji
 */
public class Simulation {
	private IArmy army1;
	private IArmy army2;

	/**
	 * utworzenie dwoch armii o zadanych rozmiarach
	 * @param army1Size
	 * @param army2Size
	 */
	public Simulation(int army1Size, int army2Size){
		army1 = new Army(army1Size);
		army2 = new Army(army2Size);
	}

	/**
	 * odtwarzanie symulacji
	 */
	public 	void runSimulation(){
		//petla sie wykonuje dopoki ktoras armia nie umrze
		//armie naprzemian wykonuja u odbieraja ataki
		while(army1.isAlive()&&army2.isAlive()){
			army1.receiveAttack(army2.makeAttack());
			//przypadek gdy army1 otrzyma atak, ktory ja zabije
			//i nie bedzie wstanie wykonac ataku na army2
			if(army1.isAlive()==false){
				break;
			}

			army2.receiveAttack(army1.makeAttack());
		}
		//wyswietlenie, ktora armia zwyciezyla
		if(army1.isAlive()){
			System.out.println("Army1 won");
		}
		else{
			System.out.println("Army2 won");
		}
	}

	/**
	 * glowna metoda
	 * @param args
	 */
	public static void main(String[] args){
		//argumenty typu String zostaja sparsowane na Integer
		Simulation sim = new Simulation(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		sim.runSimulation();
	}
}
