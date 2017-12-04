public class Bases {

    public static int suma(int a , int b){
	
        int c = a + b;
	return c;
    }
    
    public static int resta(int a , int b){
		
	int c = a - b;
	return c;
    }
    
    public static int mod(int a , int b){
	
	int c = a%b;
	return c;
    }
    
    public static double multiplicacion(double a , double b){
		
	double c = a*b;
	return c;
    }
    
    public static double division (int a, int b){
		
	if(b != 0)
	{
            double c = a/b;
            return c;
	}
        else
	{
            return Double.NaN;
        }
    }
    
    public static int factorial (double a){
	
	if(a < 1)
	{
            return 1;
	}
        else
	{
            return (int) (a * (factorial(a-1)));
	}
    }
    
    public static double potencia (double x, double d){
	
	if(d == 1)
	{
            return x;
	}
        else
        {
            if(d == 0)
            {
                return 1;
            }
            else
            {
                if(d > 1)
                {
                    return (x*potencia(x, d-1));
                } 
                else
                {
                    return 1/potencia (x, d*(-1));
		}
            }
	}
    }
    
    public static double Signo(double n){
    	
    	if(n % 2 == 0)
    	{
            return 1;
    	}
        else
        {
            return -1;
    	}
    }
    
    public static double ConvertGradosRadians (double x){
    	
    	return ((x*3.14159265)/180);
    }
    
    public static double Sin (double x){
		
	double t = 10;
	double R1 = 0;
	double x1 = Bases.ConvertGradosRadians(x);
		
        for(int n=0;n<t;n++)
        {
            R1 += (Bases.Signo(n)/Bases.factorial(2*n+1))*Bases.potencia(x1,2*n+1);
        }
            return R1;
    }
    
    public static double Cos (double x){
 		
     	double t = 10;
  	double R1 = 0;
  	double x1 = Bases.ConvertGradosRadians(x);
  		
        for(int n=0;n<t;n++)
        {
  	R1 += (Bases.Signo(n)/Bases.factorial(2*n))*Bases.potencia(x1,2*n);
        }
        return R1;
    }

}