package Arrays;

public class HorseBarn {
	
	private Horse[] spaces;
	
	public HorseBarn(Horse[] horses) {
		this.spaces = horses;
	}

	public int findHorseSpace(String name) {
		for (int i = 0; i < this.spaces.length; i++) {
			if (this.spaces[i]!=null && name.equals(this.spaces[i].getName())) {
				return i;
			}
		}
		return -1;
	}
	
	public void consolidate() {
		Horse[] newSpaces = new Horse[this.spaces.length];
		int nextSpot = 0;
		for (Horse nextHorse : this.spaces) {
			if (nextHorse != null) {
			newSpaces[nextSpot] = nextHorse;
			nextSpot++;
			}
		}
		this.spaces = newSpaces;
	}
	
	public Horse[] getHorses() {
		return this.spaces;
	}
	
    @Override
    public String toString()
    {
    	String res = "";
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] != null) {
				res = res + "["+spaces[i].getName()+"] ";
			}
			else {
				res = res + "["+spaces[i]+"] ";
			}
		}
	return res;
    }
}
