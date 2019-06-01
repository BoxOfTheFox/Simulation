package attack;

/**
 * klasa ataku
 */
public class Attack {
	private int attackValue;

	/**
	 * ustawienie wartosci ataku
	 * @param attackValue
	 */
	public void setAttack(int attackValue) {
		this.attackValue = attackValue;
	}

	/**
	 * zwrocenie wartosci ataku
	 * @return
	 */
	public int getAttack(){
		return attackValue;
	}

	/**
	 * sprawdzenie czy wartosc ataku jest wieksza od 0
	 * @return
	 */
	public boolean isEmpty(){
		if(attackValue>0)
			return false;
		else
			return true;
	}
}
