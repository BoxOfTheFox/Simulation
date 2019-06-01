package unit;

import attack.Attack;

public interface IUnit {
	Object clone();
	void receiveAttack(Attack attack);
	boolean isAlive();
	int getHp();
	int getDefence();
}
