package baeldung;

public class Person implements Cloneable
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
	
	public Person(Person personToBeCopied)
	{
	    this(personToBeCopied.getFirstName(), personToBeCopied.getLastName(), new Address(personToBeCopied.getAddress()));
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
