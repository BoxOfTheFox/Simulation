package unit;

import attack.Attack;

/**
 * interfej jednostek
 */
public interface IUnit {
	/**
	 * @return klon obiektu
	 */
	IUnit clone();

	/**
	 * odbiera wartosc ataku
	 * @param attack obiekt Attack
	 */
	void receiveAttack(Attack attack);

	/**
	 * sprawdza czy jednostka jest zywa
	 * @return true - jesli zyje, false - w  innym wypadku
	 */
	boolean isAlive();

	/**
	 * @return ilosc hp
	 */
	int getHp();

	/**
	 * @return ilosc defense
	 */
	int getDefense();
}
