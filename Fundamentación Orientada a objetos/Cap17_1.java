package Capítulo17;

/**
 *
 * @author barre
 */
public class Cap17_1 {
    
        private String pila;

        public boolean meter(boolean x){
            x = true;
            return x;
        }

        public boolean sacar(boolean x){
            x = false;
            return x;
        }

        public int pilavacia(int x){
            x = 0;
            return x;
        }

        public int pilallena(int x){
            x = 100;
            return x;
        }

        public static void main(String[] args) {
            char pila[] = new char [100];
            for (int i = 0; i < pila.length; i++) {
                char counter = (char) (Math.random()*(90-65)+65);
                    System.out.print("  " + counter + "  ");
            }
        }
}
