package attack;

/**
 * klasa ataku
 */
public class Attack {
	private int attackValue;

	/**
	 * ustawienie wartosci ataku
	 * @param attackValue wartosc przekazywana metodzie
	 */
	public void setAttack(int attackValue) {
		this.attackValue = attackValue;
	}

	/**
	 * @return zwrocenie wartosci ataku
	 */
	public int getAttack(){
		return attackValue;
	}

	/**
	 * sprawdzenie czy wartosc ataku jest wieksza od 0
	 * @return false - jesli wieksze od 0, true - w innym przypadku
	 */
	public boolean isEmpty(){
		if(attackValue>0)
			return false;
		else
			return true;
	}
}
