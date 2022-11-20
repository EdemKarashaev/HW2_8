public class Person implements Comparable<Person> {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name=n;
    }

    public void setSurname(String s){
        surname=s;
    }

    public void setAge(int a){
        age=a;
    }

    @Override
    public int compareTo(Person o) {
        return surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return name + "  " + surname + "  " + age + " лет ";
    }
}
