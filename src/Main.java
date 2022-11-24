import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> sortPerson = new ArrayList<>();
        Person p1 = new Person("Maxim", "Filatov", 32);
        Person p2 = new Person("Nikolay", "Koster Valdau fon Neyman", 8);
        Person p3 = new Person("Olya", "Markova-Smirnova", 16);
        Person p4 = new Person("Pavel", "fon der Braun", 43);
        Person p5=new Person("Maria", "Galkina Voronova", 6);

        Comparator<Person> CompPerson = (Person o2, Person o1) -> {
            int j = o1.surname.split("(\\s+|-)").length;
            int k = o2.surname.split("(\\s+|-)").length;
            if (j > k) {
                return -1;
            } else if (j < k) {
                return 1;
            } else {
                return o2.age - o1.age;
            }
        };

        sortPerson.add(p1);
        sortPerson.add(p2);
        sortPerson.add(p3);
        sortPerson.add(p4);
        sortPerson.add(p5);
        Collections.sort(sortPerson, CompPerson);
        System.out.println(sortPerson);
    }
}


