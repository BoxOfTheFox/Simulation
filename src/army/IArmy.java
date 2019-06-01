package army;

import attack.Attack;

/**
 * interfejs armii
 */
public interface IArmy {
	/**
	 * metoda przyjmuje obiekt ataku wygenerowany przez druga armie
	 * @param attack
	 */
	void receiveAttack(Attack attack);

	/**
	 * metoda zwracajaca atak
	 * @return
	 */
	Attack makeAttack();

	/**
	 * metoda sprawdzajaca czy jednostka jest zywa
	 * @return
	 */
	boolean isAlive();
}
