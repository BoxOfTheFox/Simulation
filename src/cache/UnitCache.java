package cache;

import unit.*;
import java.util.*;

/**
 * klasa prototypu
 */
public class UnitCache {
	private Map<Integer, IUnit> unitPrototypes;

	/**
	 * utworzenie prototypow
	 */
	public UnitCache(){
		unitPrototypes = new HashMap<>();

		unitPrototypes.put(0,new UnitA());
		unitPrototypes.put(1,new UnitB());
		unitPrototypes.put(2,new UnitC());

	}

	/**
	 * @param unitID etykieta
	 * @return odpowiedni prototyp
	 */
	public IUnit getUnit(Integer unitID){
	return unitPrototypes.get(unitID).clone();
	}

	/**
	 * @return rozmiar mapy/ilosc prototypow
	 */
	public int getSize(){
		return unitPrototypes.size();
	}
}
