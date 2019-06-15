package csvlogger;
import java.io.FileWriter;
import java.io.IOException;

public class CsvLogger {
	FileWriter csvWriter;
	private CsvLogger(){
		try {
			csvWriter = new FileWriter("new.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			csvWriter.append("army type,attack value,amount of units\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class SingletionHolder{
		private static final CsvLogger INSTANCE = new CsvLogger();
	}

	public static CsvLogger getInstance(){
		return SingletionHolder.INSTANCE;
	}

	public void add(String armyType, int attackValue, int unitsAmount){
		try {
			csvWriter.append(armyType + "," + attackValue + "," + unitsAmount + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void close(){
		try {
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}