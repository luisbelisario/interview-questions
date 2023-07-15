public class Person {

    private final String name;

    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void imprimeNome(Person person) {
        System.out.println(person.getName());
    }
}
