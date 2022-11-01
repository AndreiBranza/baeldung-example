package baeldung;

public class CopyExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person alex = new Person("Alex", "Jones", new Address("Main Street", "Main City"));
		Person deepCopyOfAlex = (Person) alex.clone();
		Person shallowCopyOfAlex = new Person(alex.getFirstName(), alex.getLastName(), alex.getAddress());
		
		System.out.println(alex);
		System.out.println(deepCopyOfAlex);
		System.out.println(alex==deepCopyOfAlex);
		
		Address unknownAddress = new Address("Unknown Street", "Unknown City");
		
		alex.setFirstName("John");
		alex.setLastName("Doe");
		alex.getAddress().setCityName("Unknown city");
		//alex.setAddress(unknownAddress);
		
		System.out.println("\n" + alex);
		System.out.println(deepCopyOfAlex);
		System.out.println(shallowCopyOfAlex);
		
	}

}

class Person implements Cloneable
{
	private String firstName;
	private String lastName;
	private Address address;
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return (Person)super.clone();
		
	}
	
	private Person() {}

	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
		
}

class Address
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
