
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Datoscal {
    
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
    
    public static void main (String[]args) throws IOException{
		
	int option;
	do{
			
            option = getOption();
            int [] parameters = getParameters(option);
            makeOperation(option, parameters);
			
            }
            while(option!=3);
		
		bw.write(getOption());
		bw.flush();
    }
    
    public static int getOption() throws IOException{
        
	bw.write("\n\nSeleccione por favor una de las Siguientes opciones: \n"
                + "1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Modulo \n"
		+ "6. Potencia\n7. Factorial\n8. Seno\n9. Coseno\n10.Salir");
			
	bw.flush();
			
	int option = Integer.parseInt(br.readLine());
	return option;
			
    }
    
    public static int[] getParameters(int option) throws IOException{
		
	int[] parameters = null;
			
	switch(option){
			
            case 1: //Suma
            {
                parameters = new int[2];
				
                bw.write("\nA continuacion se va a realizar una operacion de Suma\n");
                bw.write("Ingrese el primer numero: ");
                bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
				
		bw.write("Ingrese el segundo numero: ");
		bw.flush();
				
		parameters[1] = Integer.parseInt(br.readLine());
				
            }
		break;
            case 2: //Resta
            {
                parameters = new int[2];
				
		bw.write("\nA continuacion se va a realizar una operacion de Resta\n");
		bw.write("Ingrese el primer numero: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
				
		bw.write("Ingrese el segundo numero: ");
		bw.flush();
				
		parameters[1] = Integer.parseInt(br.readLine());
            }
		break;
            case 3: //Multiplicacion
            {
               parameters = new int[2];
				
		bw.write("\nA continuacion se va a realizar una operacion de Multiplicacion\n");
		bw.write("Ingrese el primer numero: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
				
		bw.write("Ingrese el segundo numero: ");
		bw.flush();
				
		parameters[1] = Integer.parseInt(br.readLine());
            }
		break;
            case 4: //Division
            {
                parameters = new int[2];
				
		bw.write("\nA continuacion se va a realizar una operacion de Division\n");
		bw.write("Ingrese el primer numero: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
				
		bw.write("Ingrese el segundo numero: ");
		bw.flush();
				
		parameters[1] = Integer.parseInt(br.readLine());
            }
		break;
            case 5: //Modulo
            {
		parameters = new int[2];
                
		bw.write("\nA continuacion se va a realizar una operacion de Modulo\n");
		bw.write("Ingrese el primer numero: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
				
		bw.write("Ingrese el segundo numero: ");
		bw.flush();
				
		parameters[1] = Integer.parseInt(br.readLine());
            }
		break;
            case 6: //Potencia
            {
                parameters = new int[2];
				
		bw.write("\nA continuacion se va a realizar una operacion de Potencia\n");
		bw.write("Ingrese numero de la base: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
				
		bw.write("Ingrese numero de la potencia : ");
		bw.flush();
		parameters [1] = Integer.parseInt(br.readLine());
            }
		break;
            case 7: //Factorial
            {
		parameters = new int[1];
				 
		bw.write("\nA continuacion se va a realizar una operacion de Factorial\n");
		bw.write("Ingrese un numero: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
            }
		break;
            case 8: //Seno
            {
		parameters = new int[1];
				
		bw.write("\nA continuacion se va a realizar una operacion de Seno\n");
		bw.write("Ingrese el numero: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
            }
		break;
            case 9: //Coseno
            {
		parameters = new int[1];
				
		bw.write("\nA continuacion se va a realizar una operacion de Coseno\n");
		bw.write("Ingrese el numero: ");
		bw.flush();
				
		parameters[0] = Integer.parseInt(br.readLine());
            }
		break;
            default:
            {
		System.exit(0);
            }
	}
	return parameters;
    }
    
    public static int makeOperation(int option, int[] parameters) throws IOException{
			
	Bases Oper = new Bases();
			
        switch(option){
			
            case 1: //Suma
            {
				
		int result = Bases.suma(parameters[0], parameters[1]);
		bw.write("El resultado de la suma es: " + result);
		bw.flush();
                
            }
		break;
            case 2: //Resta
            {
				
		int result = Bases.resta(parameters[0], parameters[1]);
		bw.write("El resultado de la resta es: " + result);
		bw.flush();
                
            }
		break;
            case 3: //Multiplicacion
            {
               
		double result = Bases.multiplicacion(parameters[0], parameters[1]);
		bw.write("El resultado de la multiplicacion es: " + result);
		bw.flush();
				
            }
		break;
            case 4: //Division
            {
                
		double result = Bases.division(parameters[0], parameters[1]);
		bw.write("El resultado de la division es: " + result);
		bw.flush();
				
            }
		break;
            case 5: //Modulo
            {
				
		double result = Bases.mod(parameters[0], parameters[1]);
		bw.write("El resultado del mudulo es: " + result);
		bw.flush();
				
            }
		break;
            case 6: //Potencia
            {
                
		double result = Bases.potencia(parameters[0], parameters[1]);
		bw.write("El resultado de la potencia es: " + result);
		bw.flush();
				
            }
		break;
            case 7: //Factorial
            {
				
		double result = Bases.factorial(parameters[0]);
		bw.write("El resultado del Factorial es: " + result);
		bw.flush();
				
            }
		break;
            case 8: //Seno
            {
		double result = Bases.Sin(parameters[0]);
		bw.write("El Seno es : " + result);
		bw.flush();
            }
		break;
            case 9: //Coseno
            {
				
		double result = Bases.Cos(parameters[0]);
		bw.write("El Coseno es : " + result);
		bw.flush();
				
            }
		break;
            }
            return 0;
		}	
}

