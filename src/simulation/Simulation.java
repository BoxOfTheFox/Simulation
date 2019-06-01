package simulation;

import army.*;

public class Simulation {
	private IArmy army1;
	private IArmy army2;

	public Simulation(int army1Size, int army2Size){
		army1 = new Army(army1Size);
		army2 = new Army(army2Size);
	}

	public 	void runSimulation(){
		while(army1.isAlive()&&army2.isAlive()){
			army1.receiveAttack(army2.makeAttack());
			if(army1.isAlive()==false){
				System.out.println("Army1 died");
				break;
			}

			army2.receiveAttack(army1.makeAttack());
		}
		//System.out.println("after runSimulation");
		if(army1.isAlive()){
			System.out.println("Army1 won");
		}
		else{
			System.out.println("Army2 won");
		}
	}

	public static void main(String[] args){
		Simulation sim = new Simulation(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		sim.runSimulation();
	}
}
