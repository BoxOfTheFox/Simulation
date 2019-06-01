package unit;

import attack.Attack;

/**
 * abstrakcyjna klasa jednostek
 */
public abstract class AUnit implements IUnit {

	protected int hp;
	protected int defense;

	/**
	 * ustawia wartosci hp i defense
	 * @param hp
	 * @param defense
	 */
	public AUnit(int hp, int defense){
		this.hp=hp;
		this.defense=defense;
	}

	/**
	 * tworzy klon obiektu
	 * @return
	 */
	@Override
	public IUnit clone() {
		return null;
	}

	/**
	 * odbiera atak drugiej armii
	 * @param attack
	 */
	@Override
	public void receiveAttack(Attack attack) {
	}

	/**
	 * sprawdza czy jednostka zyje
	 * @return
	 */
	@Override
	public boolean isAlive() {
		if(hp<=0)
			return false;
		else
			return true;
	}

	/**
	 * zwraca wartosc hp
	 * @return
	 */
	@Override
	public int getHp() {
		return hp;
	}

	/**
	 * zwraca wartosc defense
	 * @return
	 */
	@Override
	public int getDefense() {
		return defense;
	}
}
