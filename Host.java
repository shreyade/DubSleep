
/**
 * 
 * A class to represent the host.
 *
 */

package my.mainui;

public class Host {

	//Fields
    private String name;
    private char gender;
    private String bio;
    private String location;
    private String commInfo;
    
    // Constructor
    public Host(String name, char gender, String bio,
    							String location, String commInfo) {
    	this.name = name;
        this.gender = gender;
        this.bio = bio;
        this.location = location;
        this.commInfo = commInfo;
    }
    
    // getters
    public String getName() {
    	return name;
    }
    
    public char getGender() {
    	return gender;
    }
    
    public String getBio() {
    	return bio;
    }
    
    public String getLocation() {
    	return location;
    }
    
    public String getCommInfo() {
    	return commInfo;
    }
    
    // setters
    public void setName(String newName) {
    	this.name = newName;
    }
    
    public void setGender(char newGender) {
    	this.gender = newGender;
    }
    
    public void setBio(String newBio) {
    	this.bio = newBio;
    }
    
    public void setLocation(String newLoc) {
    	this.location = newLoc;
    }
    
    public void setCommInfo(String newInfo) {
    	this.commInfo = newInfo;
    }
    
}