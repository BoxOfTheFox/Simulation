package army;

import attack.Attack;
import cache.UnitCache;
import unit.IUnit;
import java.util.*;

/**
 * klasa armii
 */
public class Army implements IArmy {
	private Random rnd;
	private List<IUnit> unitList;
	private UnitCache cache;
	private IUnit unit;

	/**
	 * konstruktor generujacy liste losowo wybranych prototypow jednostek
	 * @param armySize wartosc przekazywana z Simulation
	 */
	public Army(int armySize){
		rnd = new Random();
		unitList = new LinkedList<>();

		for(int i=0;i<armySize;i++){
			unitList.add(getRandomCacheUnit());
		}
	}

	/**
	 * metoda odbierajaca atak
	 * @param attack obiekt Attack
	 */
	@Override
	public void receiveAttack(Attack attack) {
		//petla sprawdza czy obiekt ataku nie jest pusty
		//i czy lista jednostek nie jest pusta
		//(przypadek gdy zginie ostatnia jednostka i nie wyzeruje ataku)
		while(attack.isEmpty()==false&&unitList.size()!=0){
			unit = getRandomListUnit();
			unit.receiveAttack(attack);
			//jesli jednostka umrze zostaje usunieta z listy
			if(unit.isAlive()==false){
				unitList.remove(unit);
			}
		}
	}

	/**
	 * metoda tworzaca atak przy pomocy losowej jednostki
	 * @return obiekt Attack
	 */
	@Override
	public Attack makeAttack() {
		Attack attack = new Attack();
		unit = getRandomListUnit();
		//obliczenie wartosci ataku od losowo wybranej jednostki oraz
		//ustawienie tej wartosci w obiekcie Attack
		int attackValue = (unit.getDefense()+unit.getHp())/2;
		attack.setAttack(attackValue);

		return attack;
	}

	/**
	 * metoda sprawdza czy jednostka zyje
	 * @return true - jesli zyje, false - w innym przyadku
	 */
	@Override
	public boolean isAlive() {
		if(unitList.size()==0) {
			return false;
		}
		else
			return true;
	}

	/**
	 * wylosowanie jednostki z prototypu
	 * 	zakres to ilosc prototypow
	 * @return losowy prototyp IUnit
	 */
	private IUnit getRandomCacheUnit(){
		cache = new UnitCache();
		return cache.getUnit(rnd.nextInt(cache.getSize()));
	}

	/**
	 * wylosowanie jednostki z listy jednostek
	 * 	zakres to ilosc jednostek w liscie
	 * @return losowa jednostka z listy
	 */
	private IUnit getRandomListUnit(){
		return unitList.get(rnd.nextInt(unitList.size()));
	}
}
