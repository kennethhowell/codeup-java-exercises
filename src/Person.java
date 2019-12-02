public class Person {
    private String name;

    public static String getName(Person personname) {
        return personname.name;
    }

    public String getName(){
        return this.name;
    };

    public void setName(String setname){
        this.name = setname;
    };

    public void sayHello(){
        System.out.printf("Hello there, %s!", this.name);
    };

    public Person(String usersName){
        setName(usersName);
//        System.out.println("Person constructed with name: " + getName());
//        sayHello();
        ;
    }

    public static void main(String[] args){
        Person ken = new Person("Ken");

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.setName("Robocop");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
