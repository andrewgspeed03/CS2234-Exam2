
import java.util.*;

public class AgeQueue {

	//fill
	private Queue<Person> people = new LinkedList<>();

	public void addPerson(Person person) {
		//fill
		if(!isEmpty()) {
			int compare = person.compareTo(people.peek());
			if(compare > 0) {
				Person temp = removePerson();
				people.offer(person);
				people.offer(temp);
			}
			else {
				people.offer(person);
			}
		}
		else {
			people.offer(person);
		}
	}

	public Person removePerson() {
		//fill
		if(!isEmpty())
			return people.remove();
		else
			return null;
	}

	public boolean isEmpty() {
		//fill
		return people.isEmpty(); 
	}
}
