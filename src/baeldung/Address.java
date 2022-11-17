package baeldung;

public class Address implements Cloneable
{
    //Address class
	private String streetName;
	private String cityName;
	
	private Address() {}
        
        public Address(String streetName, String cityName) {
                this.streetName = streetName;
                this.cityName = cityName;
        }
        
        public Address(Address addressToBeCopied)
        {
            this(addressToBeCopied.getStreetName(), addressToBeCopied.getCityName());
        }
	
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
	
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + "]";
	}
        
	@Override
        protected Address clone() {
            try
            {
                return (Address) super.clone();
            } catch (CloneNotSupportedException cloneException)
            {
                return new Address(this.streetName, this.cityName);
            }  
        }	
        	
}