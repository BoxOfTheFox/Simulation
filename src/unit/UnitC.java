package unit;

import attack.Attack;

public class UnitC extends AUnit implements Cloneable {
	public UnitC(int hp, int defense) {
		super(hp, defense);
	}

	@Override
	public IUnit clone() {

		return new UnitC(90,20);
	}

	@Override
	public void receiveAttack(Attack attack) {
		int attackValue = attack.getAttack();

		if(attackValue>hp){
			attack.setAttack(attackValue-hp+10);
			hp=0;
		}
		else{
			attack.setAttack(hp-attackValue);
			hp-=attackValue;
		}
	}
}
