package inClassLearning1;
public class Main {
    public static void main(String[] args) {
    Person mike = new Person("Mike","heh",25,true);
        System.out.println(mike);
        mike.setFirstName("steve");
        System.out.println(mike);
        mike.setFirstName("B");
        mike.setAge(26);
        mike.setMale(false);
        mike.setLastName("NS");
        System.out.println(mike);
//        System.out.println(mike.getFirstName());
//        String name = mike.getFirstName();
//        System.out.println(name);
//        System.out.println(mike.getFullName());
    }

}