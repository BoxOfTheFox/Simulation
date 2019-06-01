package unit;

import attack.Attack;

public abstract class AUnit implements IUnit {

	protected int hp;
	protected int defense;

	//ustawia wartosci hp i defense
	public AUnit(int hp, int defense){
		this.hp=hp;
		this.defense=defense;
	}

	@Override
	public IUnit clone() {
		return null;
	}

	@Override
	public void receiveAttack(Attack attack) {
	}

	@Override
	public boolean isAlive() {
		if(hp<=0)
			return false;
		else
			return true;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public int getDefense() {
		return defense;
	}
}
