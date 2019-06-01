package army;

import attack.Attack;

/* interfejs armii */
public interface IArmy {
	/* metoda przyjmuje obiekt ataku wygenerowany przez druga armie */
	void receiveAttack(Attack attack);
	/* metoda zwracajaca atak */
	Attack makeAttack();
	/* metoda sprawdzajaca czy jednostka jest zywa */
	boolean isAlive();
}
