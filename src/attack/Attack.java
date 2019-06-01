package attack;

/* klasa ataku */
public class Attack {
	private int attackValue;

	/* ustawienie wartosci ataku */
	public void setAttack(int attackValue) {
		this.attackValue = attackValue;
	}

	/* zwrocenie wartosci ataku */
	public int getAttack(){
		return attackValue;
	}

	/* sprawdzenie czy wartosc ataku jest wieksza od 0 */
	public boolean isEmpty(){
		if(attackValue>0)
			return false;
		else
			return true;
	}
}
