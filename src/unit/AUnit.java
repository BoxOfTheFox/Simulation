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
	 * @param hp wartosc hp
	 * @param defense wartosc defense
	 */
	public AUnit(int hp, int defense){
		this.hp=hp;
		this.defense=defense;
	}

	/**
	 * @return klon obiektu
	 */
	@Override
	public IUnit clone() {
		return null;
	}

	/**
	 * odbiera atak drugiej armii
	 * @param attack obiekt Attack
	 */
	@Override
	public void receiveAttack(Attack attack) {
	}

	/**
	 * sprawdza czy jednostka zyje
	 * @return true - jesli tak, false - w przeciwnym przypadku
	 */
	@Override
	public boolean isAlive() {
		if(hp<=0)
			return false;
		else
			return true;
	}

	/**
	 * @return wartosc hp
	 */
	@Override
	public int getHp() {
		return hp;
	}

	/**
	 * @return wartosc defense
	 */
	@Override
	public int getDefense() {
		return defense;
	}
}
