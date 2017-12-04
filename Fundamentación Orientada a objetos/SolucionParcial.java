/**
 *
 * @author barre
 */

import java.io.*;
import javax.xml.bind.annotation.XmlAccessOrder;
public class SolucionParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char character = '0';
        int max = 0, temp;
    
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
    
        for (int i = 0; i < alphabet.length(); i++)
            {
                temp = countCharacter(alphabet.charAt(i), input);
                if (temp > max)
                {
                    character = alphabet.charAt(i);
                    max = temp;
                }
        }  
            bw.write ("El caracter que más se repite es " + character + " y se repite " + max + " veces \n");
            bw.flush();
    }
    
    public static int countCharacter(char character, String input)
    {
        int counter = 0;
        
        for (int i = 0; i < input.length(); i++)
            counter += input.charAt(i) == character ? 1 : 0;
        
        return counter;
    }
}