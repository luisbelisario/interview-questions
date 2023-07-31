public class Hero implements Actor {


    @Override
    public void act() {
        System.out.println("I act");
    }

    @Override
    public void speak() {
        System.out.println("I speak");
    }

    // Não é obrigatória a definição do método makeLaugh da interface
}
