package unit;

import attack.Attack;

/**
 * klasa jednostki B
 */
public class UnitB extends AUnit{
	public UnitB() {
		super(100, 30);
	}

	/**
	 * tworzy klon jednostki
	 * @return klon UnitB
	 */
	@Override
	public IUnit clone() {
		return new UnitB();
	}

	/**
	 * przyjmuje atak i od jego wartosci odejmuje ilosc hp jednostki,
	 * 	nastepnie ustawia wartosc hp jednostki
	 * @param attack obiekt Attack
	 */
	@Override
	public void receiveAttack(Attack attack) {
		int attackValue = attack.getAttack();

		if(attackValue>hp){
			attack.setAttack(attackValue-hp);
			hp=0;
		}
		else{
			attack.setAttack(0);
			hp-=attackValue;
		}
	}
}
