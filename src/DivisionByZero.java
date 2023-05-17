public class DivisionByZero {

    public static void main(String[] args) {
        int controle = 1;
        try {
            for ( ; true; controle--) {
                // Na primeira iteração controle = 1
                // No if ocorre --controle que será zero
                // pois primeiro ele faz a subtração depois a divisão
                if((controle/--controle) <= 0)
                    break;
            }
        } catch(ArithmeticException e) {
            System.out.println("A");
        } catch(RuntimeException e) {
            System.out.println("B");
        } catch(Exception e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
    }
}