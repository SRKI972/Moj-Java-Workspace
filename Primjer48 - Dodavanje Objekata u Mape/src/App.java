import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * Class Person, new data type
 * POINT: IF you want to use your custom objects in SET you need to implement Equals and hasCode 
 */
class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "ID is: " + id + ": " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class App {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		// Person4 is the same as Person2
		Person p4 = new Person(1, "Sue");
		
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3); 
		map.put(p4, 4); 
		
		for(Person key : map.keySet()) {
			System.out.println(key + " <-- key: " + map.get(key));
		}
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("cat");
		
		System.out.println(set);
		
	}

}
