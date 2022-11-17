package test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import baeldung.Address;
import baeldung.Person;


public class TestCopyExample {
	//Test class1
	@Test
	public void objectsTheSame() 
	{
		Person alex = new Person("Alex", "Jones", new Address("Main Street", "Main City"));
		Person shallowCopyOfAlex = new Person(alex.getFirstName(), alex.getLastName(), alex.getAddress());
		
		assertThat(alex).usingRecursiveComparison().isEqualTo(shallowCopyOfAlex);
	}
	
	@Test
	public void althoughObjectsAreDifferentChangingTheOriginalModifiesTheCopyToo()
	{
		
		Person alex = new Person("Alex", "Jones", new Address("Main Street", "Main City"));
                Person shallowCopyOfAlex = new Person(alex.getFirstName(), alex.getLastName(), alex.getAddress());
		
		alex.getAddress().setCityName("Unknown City");
				
		assertThat(alex.getAddress()).usingRecursiveComparison().isEqualTo(shallowCopyOfAlex.getAddress());
	}
	
	@Test
	public void deepCopyUsingConstructorCopying()
	{
	    Person alex = new Person("Alex", "Jones", new Address("Main Street", "Main City"));
            Person constructorCopyOfAlex = new Person(alex);
            
            assertThat(alex).usingRecursiveComparison().isEqualTo(constructorCopyOfAlex);
            
            alex.setAddress(new Address("Unknown Street", "Unknown City"));
            
            assertThat(alex).usingRecursiveComparison().isNotEqualTo(constructorCopyOfAlex);
	}
	
	@Test
	public void deepCopyUsingCloneMethod()
	{
	    Person alex = new Person("Alex", "Jones", new Address("Main Street", "Main City"));
            Person cloneMethodCopyOfAlex = alex.clone();
            
            assertThat(alex).usingRecursiveComparison().isEqualTo(cloneMethodCopyOfAlex);
            
            alex.setAddress(new Address("Unknown Street", "Unknown City"));
            
            assertThat(alex).usingRecursiveComparison().isNotEqualTo(cloneMethodCopyOfAlex);
	    
	}
}
