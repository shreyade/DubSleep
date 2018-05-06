
package my.mainui;
import java.util.*;
import java.lang.*;

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
        
        // empty constructor for facility
public Facility() {
	this.sleepLoc = "";
    this.hasShower = false;
    this.hasMeal = false;
    this.hasFridge = false;
	this.hasWifi = false;
    this.adjustTemp = false;
	this.powerOutlet = false;
    this.additional = "";
    this.mateInfo = "";
    this.canSmoke = false;
    this.pet = "";
	this.conditions = "";  
}
	
/**
     * @return the sleepLoc
     */
    public String getSleepLoc() {
        return sleepLoc;
    }

    /**
     * @param sleepLoc the sleepLoc to set
     */
    public void setSleepLoc(String sleepLoc) {
        this.sleepLoc = sleepLoc;
    }

    /**
     * @return the hasShower
     */
    public boolean isHasShower() {
        return hasShower;
    }

    /**
     * @param hasShower the hasShower to set
     */
    public void setHasShower(boolean hasShower) {
        this.hasShower = hasShower;
    }

    /**
     * @return the hasMeal
     */
    public boolean isHasMeal() {
        return hasMeal;
    }

    /**
     * @param hasMeal the hasMeal to set
     */
    public void setHasMeal(boolean hasMeal) {
        this.hasMeal = hasMeal;
    }

    /**
     * @return the hasFridge
     */
    public boolean isHasFridge() {
        return hasFridge;
    }

    /**
     * @param hasFridge the hasFridge to set
     */
    public void setHasFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
    }

    /**
     * @return the hasWifi
     */
    public boolean isHasWifi() {
        return hasWifi;
    }

    /**
     * @param hasWifi the hasWifi to set
     */
    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    /**
     * @return the adjustTemp
     */
    public boolean isAdjustTemp() {
        return adjustTemp;
    }

    /**
     * @param adjustTemp the adjustTemp to set
     */
    public void setAdjustTemp(boolean adjustTemp) {
        this.adjustTemp = adjustTemp;
    }

    /**
     * @return the powerOutlet
     */
    public boolean isPowerOutlet() {
        return powerOutlet;
    }

    /**
     * @param powerOutlet the powerOutlet to set
     */
    public void setPowerOutlet(boolean powerOutlet) {
        this.powerOutlet = powerOutlet;
    }

    /**
     * @return the additional
     */
    public String getAdditional() {
        return additional;
    }

    /**
     * @param additional the additional to set
     */
    public void setAdditional(String additional) {
        this.additional = additional;
    }

    /**
     * @return the mateInfo
     */
    public String getMateInfo() {
        return mateInfo;
    }

    /**
     * @param mateInfo the mateInfo to set
     */
    public void setMateInfo(String mateInfo) {
        this.mateInfo = mateInfo;
    }

    /**
     * @return the canSmoke
     */
    public boolean isCanSmoke() {
        return canSmoke;
    }

    /**
     * @param canSmoke the canSmoke to set
     */
    public void setCanSmoke(boolean canSmoke) {
        this.canSmoke = canSmoke;
    }

    /**
     * @return the pet
     */
    public String getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(String pet) {
        this.pet = pet;
    }

    /**
     * @return the conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * @param conditions the conditions to set
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
        
        
        
        //toString method for facility: string of each of the fields separated by a comma
//toString method for facility: string of each of the fields separated by a comma
    public String toString() {
            return this.sleepLoc + "," + String.valueOf(this.hasShower) + "," + String.valueOf(this.hasMeal) + "," + 
               String.valueOf(this.hasFridge) + "," + String.valueOf(this.hasWifi) + "," + String.valueOf(this.adjustTemp) + "," +
               String.valueOf(this.powerOutlet) + "," + this.additional + "," + this.mateInfo + ","
                + String.valueOf(this.canSmoke) + "," + this.pet + "," + this.conditions;
    }
    
    
    public void deserialize(String input) {
	String[] facilityData = input.split(",");
    this.sleepLoc = facilityData[0];
    this.hasShower = Boolean.parseBoolean(facilityData[1]) ;
    this.hasMeal = Boolean.parseBoolean(facilityData[2]) ;
    this.hasFridge = Boolean.parseBoolean(facilityData[3]);
    this.hasWifi = Boolean.parseBoolean(facilityData[4]);
    this.adjustTemp = Boolean.parseBoolean(facilityData[5]);
    this.powerOutlet = Boolean.parseBoolean(facilityData[6]);
    this.additional = facilityData[7];
    this.mateInfo = facilityData[8];
    this.canSmoke = Boolean.parseBoolean(facilityData[9]);
    this.pet = facilityData[10];
    this.conditions = facilityData[11];
}

}


//// Fields
//	private String sleepLoc;
//	private boolean hasShower;
//	private boolean hasMeal;
//	private boolean hasFridge;
//	private boolean hasWifi;
//	private boolean adjustTemp;
//	private boolean powerOutlet;
//	private String additional;
//	private String mateInfo;
//	private boolean canSmoke;
//	private String pet;
//	private String conditions;




