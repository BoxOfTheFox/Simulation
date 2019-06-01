package cache;

import unit.*;
import java.util.*;

/* klasa prototypu */
public class UnitCache {
	private Map<Integer, IUnit> unitPrototypes;

	/* utworzenie prototypow */
	public UnitCache(){
		unitPrototypes = new HashMap<>();

		unitPrototypes.put(0,new UnitA());
		unitPrototypes.put(1,new UnitB());
		unitPrototypes.put(2,new UnitC());

	}

	/* zwrocenie prototypow */
	public IUnit getUnit(Integer unitID){
		try {
			return unitPrototypes.get(unitID).clone();
		}catch (NullPointerException ex){
			System.out.println("Prototype with name: " + unitID + ", doesn't exist");
			return null;
		}
	}

	/* okreslenie ilosci prototypow */
	public int getSize(){
		return unitPrototypes.size();
	}
}
