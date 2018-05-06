
package my.mainui;

public class Client {

	// Instance Fields
    private String name;
    private char gender;
    private String bio;
    private Facility preference;
    private String commInfo;
    private boolean isLooking;
    private String occupiedLoc;
    
    // Constructors
    public Client(String name, char gender, String bio,
    			Facility preference, String commInfo,
    			boolean isLooking, String occupiedLoc) {
    	this.name = name;
        this.gender = gender;
        this.bio = bio;
        this.preference = preference;
        this.commInfo = commInfo;
        this.isLooking = isLooking;
        this.occupiedLoc = occupiedLoc;
    }
    
    public Client(Facility preference, boolean isLooking, String occupiedLoc) {
    	this.preference = preference;
        this.isLooking = isLooking;
        this.occupiedLoc = occupiedLoc;
    }
    
    public Client(String name, char gender, String bio, String commInfo, boolean isLooking) {
	this.name = name;
        this.gender = gender;
        this.bio = bio;
        this.commInfo = commInfo;
        this.isLooking = isLooking;
        this.occupiedLoc = "";
        this.preference = new Facility();

    }

    // Default Constructor
    public Client() {
        this.name = "";
        this.gender = 'a';
        this.bio = "";
        this.commInfo = "";
        this.isLooking = false;
    }
    
    // Getters
    public String getName() {
    	return name;
    }
    
    public char getGender() {
    	return gender;
    }
    
    public String getBio() {
    	return bio;
    }
    
    public String getCommInfo() {
    	return commInfo;
    }
    
    public Facility getFacilityPref() {
    	return preference;
    }
    
    public boolean isLookingNow() {
    	return isLooking;
    }
    
    public String getOccupiedLoc() {
    	return occupiedLoc;
    }
    
    
    // Setters
    public void setName(String newName) {
    	name = newName;
    }
    
    public void setGender(char gender) {
    	this.gender = gender;
    }
    
    public void setBio(String bio) {
    	this.bio = bio;
    }
    
    public void setCommInfo(String commInfo) {
    	this.commInfo = commInfo;
    }
    
    public void setFacilityPref(Facility preference) {
    	this.preference = preference;
    }
    
    public void setLookingNow(boolean isLooking) {
    	this.isLooking = isLooking;
    }
    
    public void setOccupiedLoc(String occupiedLoc) {
    	this.occupiedLoc = occupiedLoc;
    }
    
    //To-String for FileIO
    public String toString() {
        String boolString = "false";
        if (isLooking) 
            boolString = "true";
        String returnString =  this.name + ","
    + gender + ","
    + bio + ","
    + commInfo + ","
    + boolString + ","
    + occupiedLoc + ";"
    + preference.toString();

        return returnString;
    }
    
    public void deserializeClient(String input) {
    	String[] clientData = input.split(",");
        this.name = clientData[0];
        this.gender = clientData[1].charAt(0);
        this.bio = clientData[2];
        this.commInfo = clientData[3];
        this.isLooking = Boolean.parseBoolean(clientData[4]);
        this.occupiedLoc = clientData[5];
    }
}