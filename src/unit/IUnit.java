package unit;

import attack.Attack;

/** interfej jednostek */
public interface IUnit {
	/** tworzy klon obiektu jednostki */
	IUnit clone();
	/** atakuje jednostke */
	void receiveAttack(Attack attack);
	/** sprawdza czy jednostka jest zywa */
	boolean isAlive();
	/** zwraca ilosc hp */
	int getHp();
	/** zwraca ilosc defence */
	int getDefense();
}
