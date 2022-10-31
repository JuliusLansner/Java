package inClassLearning1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;

    public Person(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public String getFullName() {
        return String.format("%s %s %d", firstName, lastName, age);
    }

    //setter
// er altid void
    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {

        this.lastName = name;
    }

    public void setAge(int number) {
        this.age = number;
    }
    public void setMale(boolean gender){
        this.isMale=gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
