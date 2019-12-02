import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

    public static void addPerson(Person [] arr1, String newperson){

        Person [] copy1 = Arrays.copyOf(arr1, arr1.length + 1);
        copy1[copy1.length-1] = new Person(newperson);
        System.out.println("The added person is " + newperson);
        for (Person personname : copy1){
            System.out.println("Person objects = " + Person.getName(personname));
        };
    };


    public static void main (String[] args){

//        int [] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers);
        Person person1 = new Person ("Billy");
        Person person2 = new Person ("Joe");
        Person person3 = new Person ("Montana");

        Person [] personslist = {person1, person2, person3};

        addPerson(personslist, "Sophie K.");
        addPerson(personslist, "David Stephens");



    }
}
