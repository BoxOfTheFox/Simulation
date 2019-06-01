package unit;

import attack.Attack;

/**
 * interfej jednostek
 */
public interface IUnit {
	/**
	 * tworzy klon obiektu jednostki
	 * @return
	 */
	IUnit clone();

	/**
	 * atakuje jednostke
	 * @param attack
	 */
	void receiveAttack(Attack attack);

	/**
	 * sprawdza czy jednostka jest zywa
	 * @return
	 */
	boolean isAlive();

	/**
	 * zwraca ilosc hp
	 * @return
	 */
	int getHp();

	/**
	 * zwraca ilosc defence
	 * @return
	 */
	int getDefense();
}
