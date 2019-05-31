package army;

import attack.Attack;

public interface IArmy {
	void receiveAttack(Attack attack);
	Attack makeAttack();
	boolean isAlive();
}
