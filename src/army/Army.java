package army;

import attack.Attack;
import cache.UnitCache;
import unit.IUnit;
import java.util.*;

public class Army implements IArmy {
	private Random rnd;
	private List<IUnit> unitList;
	private UnitCache cache;
	private IUnit unit;

	public Army(int armySize){
		rnd = new Random();
		unitList = new LinkedList<>();

		for(int i=0;i<armySize;i++){
			unitList.add(getRandomCacheUnit());
		}
	}

	@Override
	public void receiveAttack(Attack attack) {

		while(attack.isEmpty()==false){
			unit = getRandomListUnit();
			unit.receiveAttack(attack);
			if(unit.isAlive()==false){
				unitList.remove(unit);
			}
		}
	}

	@Override
	public Attack makeAttack() {
		unit = getRandomListUnit();
		Attack attack = new Attack();
		int attackValue;

		attackValue = (unit.getDefence()+unit.getHp())/2;

		attack.setAttack(attackValue);

		return attack;
	}

	@Override
	public boolean isAlive() {
		if(unitList.get(0)==null)
			return false;
		else
			return true;
	}

	private IUnit getRandomCacheUnit(){
		cache = new UnitCache();
		return cache.getUnit(rnd.nextInt(cache.getSize()));
	}

	private IUnit getRandomListUnit(){
		return unitList.get(rnd.nextInt(unitList.size()));
	}
}
