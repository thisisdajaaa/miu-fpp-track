package lesson7.prog1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PersonList {
    private Person[] people;
    private int size;

    public PersonList() {
        int INITIAL_LENGTH = 4;
        people = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // add in last
    public void add(Person person) {
        if (person == null) return;
        if (size == people.length) resize();

        people[size++] = person;
    }

    public Person find(String lastName) {
        for (Person person : people) {
            if (person.getLastName().equals(lastName)) {
                return person;
            }
        }

        return null;
    }

    public Person get(int i) {
        for (int j = 0; j < people.length; j++) {
            if (i == j) return people[i];
        }

        return null;
    }

    // insert specific position
    public void insert(int position, Person person) {
        if (position > size || position < 0) return;
        if (size == people.length) resize();

        Person[] temp = new Person[people.length + 1];

        for (int i = 0; i < temp.length; i++) {
            if (position == i) {
                temp[i] = person;
            } else if (position < i) {
                System.arraycopy(people, i - 1, temp, i, temp.length - i);

                break;
            } else {
                temp[i] = people[i];
            }


        }

        people = temp;
        size++;
    }

    public boolean remove(Person person) {
        if (isEmpty() || person == null) return false;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getLastName().equals(person.getLastName())) {
                people[i] = null;
                size--;
                return true;
            }
        }

        return false;
    }

    private void resize() {
        int currentLength = people.length;
        int newLength = currentLength * 2;
        Person[] updatedPersonList = new Person[newLength];

        System.arraycopy(people, 0, updatedPersonList, 0, currentLength);

        people = updatedPersonList;
    }

    // create toString of all
    public String printAll() {
        StringBuilder builder = new StringBuilder();

        for (Person person : people) {
            if (person != null) builder.append(String.format("Name is %s. ", person.getFirstName()));
        }

        return builder.toString();
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        PersonList pl = new PersonList();
        pl.add(new Person("1", "Thomas", 34));
        pl.add(new Person("2", "Steve", 30));
        pl.add(new Person("3", "Kyle", 54));
        pl.add(new Person("4", "Mark", 22));
        pl.add(new Person("5", "GG", 23));
        pl.add(new Person("6", "GG", 23));

        pl.insert(6, new Person("7", "WEW", 30));

        System.out.println(pl.printAll());
    }
}
