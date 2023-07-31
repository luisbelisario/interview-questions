public interface Actor {

    void act();
    void speak();

    // A partir do Java 8 é possível colocar definições do método dentro da interface
    // Dessa forma as classes que implementam essa interface não serão obrigadas a defini-lo
    // É possível fazer isso declarando o método como default

    default void makeLaught() {
        System.out.println("I can make people laugh");
    }
}
