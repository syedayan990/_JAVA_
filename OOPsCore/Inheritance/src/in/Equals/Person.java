package in.Equals;

import java.util.Objects;

public class Person {
    private String Name;

    private int age;

    private String ID;

    public Person() {
    }

    public Person(String name, int age, String ID) {
        this.Name = name;
        this.age = age;
        this.ID = ID;
    }

//
//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        Person person = (Person)obj;
//        return person.Name.equals(Name) &&
//                person.age == age
//                && person.ID.equals(ID);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(Name, age, ID);
//    }
//
    //--------Or ----------
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(Name, person.Name) && Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, age, ID);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("ID='").append(ID).append('\'');
        sb.append(", age=").append(age);
        sb.append(", Name='").append(Name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
