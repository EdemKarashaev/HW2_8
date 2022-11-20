import java.util.Comparator;

public class CompPerson implements Comparator<Person> {

    @Override
    public int compare(Person o2, Person o1) {
        int j = o1.surname.split("(\\s+|-)").length;
        int k = o2.surname.split("(\\s+|-)").length;
        if (j > k) {
            return -1;
        } else if (j < k) {
            return 1;
        } else {
            return o2.age - o1.age;
        }
    }
}
