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
	//UWAGA!!!
//	static int i=0;

	public Army(int armySize){
		rnd = new Random();
		unitList = new LinkedList<>();
		for(int i=0;i<armySize;i++){
			IUnit temp = getRandomCacheUnit();
			//System.out.println(temp);
			unitList.add(temp);
		}
	}

	@Override
	public void receiveAttack(Attack attack) {
	//	System.out.println("recieveAttack in");
		while(attack.isEmpty()==false&&unitList.size()!=0){
	//		System.out.println("recieveAttack loop nr. " + i++);
			unit = getRandomListUnit();
			unit.receiveAttack(attack);
			if(unit.isAlive()==false){
				unitList.remove(unit);
			}
		}
	//	System.out.println("recieveAttack out");
	//	i=0;
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
//UWAGA!!!!
	@Override
	public boolean isAlive() {
		if(unitList.size()==0) {
			//System.out.println("isAlive false");
			return false;
		}
		else
			return true;
	}

	private IUnit getRandomCacheUnit(){
		cache = new UnitCache();
		//System.out.println(cache.getUnit(rnd.nextInt(cache.getSize())));
		return cache.getUnit(rnd.nextInt(cache.getSize()));
	}

	private IUnit getRandomListUnit(){
		//System.out.println(" getRandomListUnit() size() " + unitList.size());
		if(unitList.size()==0)
			System.out.println("fuck");
		return unitList.get(rnd.nextInt(unitList.size()));
	}
}
