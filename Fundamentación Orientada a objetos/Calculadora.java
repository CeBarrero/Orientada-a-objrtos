    /*
        @ author Cesar Barrero
        @ date 12-09-2017
        @ version 1.0
    */
public class Calculadora {
    
    private Object oper;

        // Listado de operaciones 
   
        public int sum(int number1, int number2) // función suma, menú 1, ingresar dos números 
        {
            return number1+number2;
        }
        
        public int rest(int number1, int number2) // función resta, menú 2, ingresar dos números 
        {
            return number1-number2;
        }
        
        public int multiplicacion(int number1, int number2) // función multiplicación, menú 3, ingresar dos números
        {
            int result=0;
            for (int i=0; i<number2; i+=1)
            {
                result=sum(result, number1);
            }
            return result;
        }
        
        public double division(int number1, int number2) // función división, mrnú 4, ingresar dos números
        {
            if (number2 !=0)
            {
                return number1/number2;
            }
            else
            {
                return Double.NaN;
            }
        }
        
        public int modulo(int number1, int number2) // función modulo, menú 5, ingresar dos números
        {
            return number1 % number2;
        }
        
        public int exponentation(int base, int exponent) // función potenciación, menú 6, ingresar dos números
        {
            if (exponent == 1)
            {
                return base;
            }
            else
            {
                if (exponent == 0)
                {
                    return 1;
                }
                else 
                {
                    if (exponent >1)
                    {
                        return multiplicacion(base, exponentation(base, exponent-1));
                    }
                    else
                    {
                        return 1/exponentation(base,exponent*(-1));
                    }
                }
            }
        }
        
        public int factorial(int number1) // función factorial, menú 7, ingresar un número
        {
            if (number1<1)
            {
                return 1;
            }
            else
            {
                return multiplicacion(number1,factorial(number1-1));
            }
        }
        
        public int signo(int number1) // función signo
        {
            if (number1 % 2 == 0)
            {
                return 1;
            }
            else 
            {
                return -1;
            }
        }
        
        public static double ConvertGradosRadians (double number1) // Convertir grados en radianes, ingresar un número
        {
    	
                return ((number1*3.14159265)/180);
        }
        
        public double sin(int x) // función seno, menú 8, ingresar un número
        {
            double t = 10;
            double R1 = 0;
            double x1 = Calculadora.ConvertGradosRadians(x);
            
            for(int n = 0 ;n < t; n ++)
            {
                R1 += (signo(n)/factorial(2*n+1))*exponentation((int) x1,2*n+1);
            }
            return R1;
        }
        
        public double cos(int number1) // función coseno, menú 9, ingresar un número
        {
            double t = 10;
            double R1 = 0;
            double x1 = Calculadora.ConvertGradosRadians(number1);
            
            for(int n=0;n<t;n++)
            {
                R1 += (signo(n)/factorial(2*n))*exponentation((int) x1,2*n);
            }
            return R1;
        }
        
        public double integral(int inicio, int fin, int paso) //función Integral, menú 10, ingresar tres números
        {
            int acum = 0;
            for (int i = inicio; i < fin; i += paso)
            {
                acum += ((paso)*exponentation(i,2));
            }
            return acum;
       }
        
        public double[] Cuadratica (int number1, int number2, int number3)
        {
            double [] x = new double [3];
            double discriminante;
            discriminante = ((number2*number2)-(4*(number1)*(number3)));
            
            if (discriminante > 0 && number1!=0)
            {
                x[0] += ((-number2)+ Math.sqrt(exponentation(number2,2)-(4*number1*number3)))/2*number1;
                x[1] += ((-number2)- Math.sqrt(exponentation(number2,2)-(4*number1*number3)))/2*number1;
            }
            else
            {
                return null;
            }
            return x;
        }
}