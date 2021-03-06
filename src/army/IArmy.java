package army;

import attack.Attack;

/**
 * interfejs armii
 */
public interface IArmy {
	/**
	 * metoda przyjmuje obiekt ataku wygenerowany przez druga armie
	 * @param attack obiekt Attack
	 */
	void receiveAttack(Attack attack);

	/**
	 * metoda zwracajaca atak
	 * @return obiekt Attack
	 */
	Attack makeAttack();

	/**
	 * metoda sprawdzajaca czy jednostka jest zywa
	 * @return true - jesli zyje, false - w innym przypadku
	 */
	boolean isAlive();
}
