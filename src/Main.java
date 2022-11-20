import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> sortPerson = new ArrayList<>();
        Person p1 = new Person("Maxim", "Filatov", 32);
        Person p2 = new Person("Nikolay", "Koster Valdau fon Neyman", 8);
        Person p3 = new Person("Olya", "Markova-Smirnova", 16);
        Person p4 = new Person("Pavel", "fon der Braun", 43);
        Person p5=new Person("Maria", "Galkina Voronova", 6);

        sortPerson.add(p1);
        sortPerson.add(p2);
        sortPerson.add(p3);
        sortPerson.add(p4);
        sortPerson.add(p5);
        Collections.sort(sortPerson, new CompPerson());
        System.out.println(sortPerson);
    }
}
