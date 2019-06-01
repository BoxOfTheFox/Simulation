package unit;

import attack.Attack;

public class UnitC extends AUnit{
	public UnitC() {
		super(90, 20);
	}

	@Override
	public IUnit clone() {
		return new UnitC();
	}

	//przyjmuje atak i od jego wartosci odejmuje ilosc hp jednostki
	//nastepnie ustawia wartosc hp jednostki,
	//w przypadku smierci jednostki dodaje 10 do wartosci ataku
	@Override
	public void receiveAttack(Attack attack) {
		int attackValue = attack.getAttack();

		if(attackValue>hp){
			attack.setAttack(attackValue-hp+10);
			hp=0;
		}
		else{
			attack.setAttack(hp-attackValue);
			hp-=attackValue;
		}
	}
}
