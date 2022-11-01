package baeldung;

public class Address
{
	private String streetName;
	private String cityName;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	private Address() {}
	
	public Address(String streetName, String cityName) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
	}
	
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + "]";
	}	
	
	
}