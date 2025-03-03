package DataStructures.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderingList {

    public static void main(String[] args) {

        Person p1 = new Person("Athena", 22);
        Person p2 = new Person("Zeus", 40);
        Person p3 = new Person("Hades", 40);
        Person p4 = new Person("Ares", 32);
        Person p5 = new Person("Apollo", 20);
        Person p6 = new Person("Hermes", 25);
        Person p7 = new Person("Afrodite", 30);
        Person p8 = new Person("Hera", 32);
        Person p9 = new Person("Dionisio", 38);
        Person p10 = new Person("Poseidon", 40);
        Person p11 = new Person("Hefesto", 34);

        List<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        persons.add(p7);
        persons.add(p8);
        persons.add(p9);
        persons.add(p10);
        persons.add(p11);

        System.out.println("Printando a lista não ordenada");
        persons.forEach(Person::imprimeNome);


        System.out.println("------------------------------");
        System.out.println("Ordenando a lista por nome");
        persons.sort(Comparator.comparing(Person::getName));
        // outra opção
        // persons.sort((px, py) -> px.getNome().compareTo(py.getNome()));
        System.out.println("------------------------------");

        System.out.println("Printando a lista ordenada por nome");
        persons.forEach(Person::imprimeNome);

    }
}
