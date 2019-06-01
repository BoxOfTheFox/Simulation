package unit;

import attack.Attack;

public class UnitA extends AUnit implements Cloneable {
	public UnitA(int hp, int defense) {
		super(hp, defense);
	}

	@Override
	public IUnit clone() {
	//	Object clone = null;

		//try {
		//	clone = super.clone();
//
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}

		return new UnitA(110,40);
	}

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
