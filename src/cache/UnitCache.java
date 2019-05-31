package cache;

import unit.*;
import java.util.*;

public class UnitCache {
	private Map<Integer, IUnit> unitPrototypes;

	public UnitCache(){
		unitPrototypes = new HashMap<>();

		//unitPrototypes.put(0,new UnitA(110,40));
		//unitPrototypes.put(1,new UnitB(100,30));
		//unitPrototypes.put(2,new UnitA(90,20));

	}

	public IUnit getUnit(Integer unitID){
		try {
			return unitPrototypes.get(unitID).clone();
		}catch (NullPointerException ex){
			System.out.println("Prototype with name: " + unitID + ", doesn't exist");
			return null;
		}
	}

	public int getSize(){
		return unitPrototypes.size();
	}
}
