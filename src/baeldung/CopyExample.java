package baeldung;

 class CopyExample {

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