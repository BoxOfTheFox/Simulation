package unit;

import attack.Attack;

/* klasa jednostki A */
public class UnitA extends AUnit{
	public UnitA() {
		super(110, 40);
	}

	@Override
	public IUnit clone() {
		return new UnitA();
	}

	/*
	przyjmuje atak i odejmuje jego wartosc od ilosci hp,
	nastepnie zeruje atak
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
