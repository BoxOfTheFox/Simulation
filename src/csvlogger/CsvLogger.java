package csvlogger;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Singleton Loggera, tworzy plik CSV z danymi o przebiegu walki (ilosci jednostek w armiach, zmianach w wartosci ataku
 */
public class CsvLogger {
	private FileWriter csvWriter;

	/**
	 * konstruktor tworzacy plik i pierwszy wiersz z informacjami co bedzie w danych kolumnach
	 */
	private CsvLogger(){
		try {
			csvWriter = new FileWriter("new.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			if (csvWriter != null) {
				csvWriter.append("army type,attack value,amount of units\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * metoda przechowujaca instancje obiektu
	 */
	private static class SingletionHolder{
		private static final CsvLogger INSTANCE = new CsvLogger();
	}

	/**
	 * metoda zwracajaca instancje
	 * @return instancja obiektu
	 */
	public static CsvLogger getInstance(){
		return SingletionHolder.INSTANCE;
	}

	/**
	 * metoda dodajaca wiersze do pliku CSV
	 * @param armyType Rodzaj armii (atakujaca lub broniaca)
	 * @param attackValue Wartosc ataku w klasie Attack
	 * @param unitsAmount Ilosc jednostek w armii
	 */
	public void add(String armyType, int attackValue, int unitsAmount){
		try {
			csvWriter.append(armyType).append(",").append(String.valueOf(attackValue)).append(",").append(String.valueOf(unitsAmount)).append("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * metoda pozwalajaca zamknac plik
	 */
	public void close(){
		try {
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}