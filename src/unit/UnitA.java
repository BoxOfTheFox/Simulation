package unit;

import attack.Attack;

/**
 * klasa jednostki A
 */
public class UnitA extends AUnit{
	public UnitA() {
		super(110, 40);
	}

	/**
	 * przyjmuje atak i odejmuje jego wartosc od ilosci hp,
	 * 	nastepnie zeruje atak
	 * @param attack obiekt Attack
	 */
	@Override
	public void receiveAttack(Attack attack) {
		int attackValue = attack.getAttack();
		if(attackValue>hp){
			hp=0;
		}
		else{
			hp-=attackValue;
		}
		attack.setAttack(0);
	}
}
