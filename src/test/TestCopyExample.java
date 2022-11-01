package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import baeldung.Address;
import baeldung.Person;


public class TestCopyExample {
	
	@Test
	void testEqualsReferenceCopy() 
	{
		Person alexExpected = new Person("Alex", "Jones", new Address("Main Street", "Main City"));
		Person shallowCopyOfAlex = alexExpected;
		
		assertEquals(alexExpected, shallowCopyOfAlex, "Should be equal considering we are just copying the reference.");
	}
	
	@Test
	void testNotEquals() throws CloneNotSupportedException
	{
		Person alexExpected = new Person("Alex", "Jones", new Address("Main Street", "Main City"));

		Person deepCopyOfAlex = (Person) alexExpected.clone();
		
		assertNotEquals(alexExpected, deepCopyOfAlex, "Should not be equal considering we are cloning the object.");
	}
}
