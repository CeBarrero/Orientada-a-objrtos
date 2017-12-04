import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static javafx.scene.input.KeyCode.X;

/*
    @ author Cesar Barrero
    @ date 12-09-2017
    @ version 1.0
*/

public class Calculador {
    
    static BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
    static BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
    
    public static void main(String[] args) throws IOException{
        
        int option;
        int [] parameters;
        
        do
        {
            option = getOption();
            parameters = getParameters(option);
            makeOperation(option, parameters);
        }
        while (option != 3);
                
        bw.write(getOption() );
        bw.flush();
    }
        
        public static int getOption() throws IOException // Menú de opciones
        {
            bw.write("\n\nSeleccione por favor una de las siguientes opciones:\n"
                    + "1. Suma\n2. Resta\n3. Multipliacacion\n4. Divison\n5. Modulo\n"
                    + "6. Potencia\n7. Factorial\n8. Seno\n9. Coseno\n10. Integral\n"
                    + "11. Cuadratica\n12. Salir\n");
            bw.flush();
            
            int option = Integer.parseInt(br.readLine() );
            
            return option;
        }
        
        public static int[] getParameters(int option) throws IOException // Parametros
        {
            int[] parameters = null;
            
            switch (option)
            {
                case 1: // Suma
                {
                    parameters = new int[2];
                    
                    bw.write("\nA continuacion se va a realizar una operacion de suma.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                    
                    bw.write("\n Ingrese el segundo numero");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine() );
                }
                break;
                case 2: // Resta
                {
                    parameters = new int[2];
                    
                    bw.write("\nA continuacion se va a realizar una operacion de resta.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                    
                    bw.write("\n Ingrese el segundo numero");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine() );
                }
                break;
                case 3: // Multiplicación
                {
                    parameters = new int[2];
                    
                    bw.write("\nA continuacion se va a realizar una operacion de multiplicacion.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                    
                    bw.write("\n Ingrese el segundo numero");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine() );
                }
                break;
                case 4: // División
                {
                    parameters = new int[2];
                    
                    bw.write("\nA continuacion se va a realizar una operacion de division.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                    
                    bw.write("\n Ingrese el segundo numero");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine() );
                }
                break;
                case 5: // Modulo
                {
                    parameters = new int[2];
                    
                    bw.write("\nA continuacion se va a realizar una operacion para hallar el modulo.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                    
                    bw.write("\n Ingrese el segundo numero");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine() );
                }
                break;
                case 6: // Potencia
                {
                    parameters = new int[2];
                    
                    bw.write("\nA continuacion se va a realizar una operacion de potencia.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                    
                    bw.write("\n Ingrese el segundo numero");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine() );
                }
                break;
                case 7: // Factorial
                {
                    parameters = new int[1];
                    
                    bw.write("\nA continuacion se va a realizar una operacion de factorial.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                }
                break;
                case 8: // Seno
                {
                    parameters = new int[1];
                    
                    bw.write("\nA continuacion se va a realizar una operacion para hallar el seno.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );
                }
                break;
                case 9: // Coseno
                {
                    parameters = new int[1];
                    
                    bw.write("\nA continuacion se va a realizar una operacion para hallar el coseno.\n");
                    bw.write("Ingrese el primer numero");
                    bw.flush();
                    parameters[0] = Integer.parseInt( br.readLine() );                                    
                }
                break;
                case 10: // Integral
                {
                    parameters = new int[3];
                    
                    bw.write("\nA continuacion se va a realizar una operacion para hallar la integral.\n");
                    bw.write("Ingrese el número de inicio");
                    bw.flush();
                    parameters[0] = Integer.parseInt(br.readLine());
                    
                    bw.write("\nA continuación se va a realizar una operación de la integral");
                    bw.write("Ingrese el final");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine());
                    
                    bw.write("\nA continuación sa va a realizar una operación de la integral");
                    bw.write("Ingrese del paso");
                    bw.flush();
                    parameters[2] = Integer.parseInt( br.readLine() );
                }    
                break;
                case 11: // Cuadratica
                {
                    parameters = new int[3];
                    
                    bw.write("\nA continuacion se va a realizar una operacion para hallar la cuadratica.\n");
                    bw.write("Ingrese el primer número");
                    bw.flush();
                    parameters[0] = Integer.parseInt(br.readLine());
                    
                    bw.write("\nA continuación se va a realizar una operación de la cuadratica");
                    bw.write("Ingrese el segundo número");
                    bw.flush();
                    parameters[1] = Integer.parseInt(br.readLine());
                    
                    bw.write("\nA continuación sa va a realizar una operación de la cuadratica");
                    bw.write("Ingrese el tercer número");
                    bw.flush();
                    parameters[2] = Integer.parseInt( br.readLine() );
                }
                default:
                {
                    System.exit(0);
                }
            }
            return parameters;
        }
        
        public static void makeOperation(int option, int[] parameters) throws IOException // Operaciones que realiza
        {
            
            Calculadora oper = new Calculadora();
            
            switch (option)
            {
                case 1: // Suma
                {
                    int result = oper.sum(parameters[0], parameters[1]);
                    bw.write("\nEl resultado de la suma es " + result + "\n");
                    bw.flush();
                }
                break;
                case 2: // Resta
                {
                    int result = oper.rest(parameters[0], parameters[1]);
                    bw.write("\nEl resultado de la resta es " + result + "\n");
                    bw.flush();
                }
                break;
                case 3: // Multiplicación
                {
                    int result = oper.multiplicacion(parameters[0], parameters[1]);
                    bw.write("\nEl resultado de la multiplicación es " + result + "\n");
                    bw.flush();
                }
                break;
                case 4: // División
                {
                    double result = oper.division(parameters[0], parameters[1]);
                    bw.write("\nEl resultado de la división es " + result + "\n");
                    bw.flush();
                }
                break;
                case 5: // Modulo
                {
                    int result = oper.modulo(parameters[0], parameters[1]);
                    bw.write("\nEl resultado del modulo es " + result + "\n");
                    bw.flush();
                }
                break;
                case 6: // Potencia
                {
                    int result = oper.exponentation(parameters[0], parameters[1]);
                    bw.write("\nEl resultado de la potencia es " + result + "\n");
                    bw.flush();
                }
                break;
                case 7: // Factorial
                {
                    int result = oper.factorial(parameters[0]);
                    bw.write("\nEl resultado del factorial es "+ result + "\n");
                    bw.flush();
                }
                break;
                case 8: // Seno
                {
                    double result = oper.sin(parameters[0]);
                    bw.write("\nEl resultado del seno es " + result + "\n");
                    bw.flush();
                }
                break;
                case 9: // Coseno
                {
                    double result = oper.cos(parameters[0]);
                    bw.write("\nEl resultado del coseno es " + result + "\n");
                    bw.flush();           
                }
                break;
                case 10: // Integral
                {
                    double result = oper.integral(parameters[0], parameters[1], parameters[2]);
                    bw.write("\nEl resultado de la integral es " + result + "\n");
                    bw.flush();
                }
                break;
                case 11:
                {
                   if (X == null)
                   {
                        bw.write("Las soluciones se encuentran en los imaginarios");
                        bw.flush();
                   }
                   else
                   {
                       String[] x = null;
                   bw.write("\n El resultado de x1 es: " + x[0] + "el resultado de x2 es: " + x[1]);
                   bw.flush();
                   }
                }
                break;
        }
    }
}
