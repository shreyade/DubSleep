
public class Client {

	// Instance Fields
    private String name;
    private char gender;
    private String bio;
    private Facility preference;
    private String commInfo;
    private boolean isLooking;
    private String occupiedLoc;
    
  
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
}
