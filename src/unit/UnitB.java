package unit;

import attack.Attack;

public class UnitB extends AUnit{
	public UnitB() {
		super(100, 30);
	}

	@Override
	public IUnit clone() {
		return new UnitB();
	}

	//przyjmuje atak i od jego wartosci odejmuje ilosc hp jednostki,
	//nastepnie ustawia wartosc hp jednostki
	@Override
	public void receiveAttack(Attack attack) {
		int attackValue = attack.getAttack();

		if(attackValue>hp){
			attack.setAttack(attackValue-hp);
			hp=0;
		}
		else{
			attack.setAttack(hp-attackValue);
			hp-=attackValue;
		}
	}
}
