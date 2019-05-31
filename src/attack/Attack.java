package attack;

public class Attack {
	private int attackValue;

	public void setAttack(int attackValue) {
		this.attackValue = attackValue;
	}

	public int getAttack(){
		return attackValue;
	}

	public boolean isEmpty(){
		if(attackValue>0)
			return false;
		else
			return true;
	}
}
