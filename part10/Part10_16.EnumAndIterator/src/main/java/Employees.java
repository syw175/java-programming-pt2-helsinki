import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.persons.addAll(peopleToAdd);
    }

    // Use the iterator method
    public void print() {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            Person currentPerson = iterator.next();
            if (currentPerson.getEducation() == education) {
                System.out.println(currentPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.persons.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
