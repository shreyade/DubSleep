
public class Facility {
	
	// Fields
	private String sleepLoc;
	private boolean hasShower;
	private boolean hasMeal;
	private boolean hasFridge;
	private boolean hasWifi;
	private boolean adjustTemp;
	private boolean powerOutlet;
	private String additional;
	private String mateInfo;
	private boolean canSmoke;
	private String pet;
	private String conditions;
	
	// Constructors
	public Facility(String sleep, boolean shower, boolean meal,
					boolean fridge, boolean wifi, boolean adjustTemp,
					boolean power, String addition, String mate, 
					boolean smoke, String pet, String condi) {
		this.sleepLoc = sleep;
		this.hasShower = shower;
		this.hasMeal = meal;
		this.hasFridge = fridge;
		this.hasWifi = wifi;
		this.adjustTemp = adjustTemp;
		this.powerOutlet = power;
		this.additional = addition;
		this.mateInfo = mate;
		this.canSmoke = smoke;
		this.pet = pet;
		this.conditions = condi;
	}
	
	public String getSleepLoc() {
		return sleepLoc;
	}
	
	public boolean getShower() {
		return hasShower;
	}
	
	public boolean getMeal() {
		return hasMeal;
	}
	
	public boolean getFridge() {
		return hasFridge;
	}
}
