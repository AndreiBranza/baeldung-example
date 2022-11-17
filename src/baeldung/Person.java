package baeldung;

public class Person implements Cloneable
{
    //Person class
	private String firstName;
	private String lastName;
	private Address address;
	
	@Override
	public Person clone() 
	{
	    Person clone = null;
	    try
	    {
	        clone = (Person) super.clone();
	    } catch (CloneNotSupportedException cloneException)
	    {
	        clone = new Person(this.getFirstName(), this.getLastName(), (Address) this.address.clone());
	    }	    
	    return clone;		
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
