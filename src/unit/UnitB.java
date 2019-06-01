package unit;

import attack.Attack;

public class UnitB extends AUnit implements Cloneable {
	public UnitB(int hp, int defense) {
		super(hp, defense);
	}

	@Override
	public IUnit clone() {

		return new UnitB(100,30);
	}

	@Override
	public void receiveAttack(Attack attack) {
		int attackValue = attack.getAttack();

		if(attackValue>hp){
			attack.setAttack(attackValue-hp);
			hp=0;
		}
		else{
			attack.setAttack(hp-attackValue);
			hp-=attackValue;
		}
	}
}
