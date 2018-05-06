
public class Location {
	
	// Fields
	private String address;
	private Facility fac;
	private Host host;
	private Client client;
	private String availability;
	private boolean isAvaiNow;
	private boolean isAvai24hrs;
	private int rating;
	
	// Constructor
	public Location(String add, Facility fac, Host host, Client cli,
					String availability, boolean isAvaiNow, 
					boolean isAvai24hrs, int rating) {
		this.address = add;
		this.fac = fac;
		this.host = host;
		this.client = cli;
		this.availability = availability;
		this.isAvaiNow = isAvaiNow;
		this.isAvai24hrs = isAvai24hrs;
		this.rating = rating;
	}
	
	// Getters
	public String getAddress() {
		return address;
	}
	
	public Facility getFacility() {
		return fac;
	}
	
	public Host getHost() {
		return host;
	}
	
	public Client getClient() {
		return client;
	}
	
	public String getAvailability() {
		return availability;
	}
	
	public boolean getAvaiNow() {
		return isAvaiNow;
	}
	
	public boolean getAvai24hrs() {
		return isAvai24hrs;
	}
	
	public int getRating() {
		return rating;
	}
	
	// Setters
	public void setAddress(String add) {
		this.address = add;
	}
		
	public void setFacility(Facility fac) {
		this.fac = fac;
	}
		
	public void setHost(Host ho) {
		this.host = ho;
	}
		
	public void setClient(Client cli) {
		this.client = cli;
	}
		
	public void setAvailability(String avai) {
		this.availability = avai;
	}
		
	public void setAvaiNow(boolean avai) {
		this.isAvaiNow = avai;
	}
		
	public void setAvai24hrs(boolean avai) {
		this.isAvai24hrs = avai;
	}
		
	public void setRating(int rating) {
		this.rating = rating;
	}
}
