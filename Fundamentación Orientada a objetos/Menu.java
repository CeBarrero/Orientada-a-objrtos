
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barre
 */
public class Menu {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int lines = Integer.parseInt(br.readLine());
        
        Createfile cf = new Createfile(lines);
        SearchMotif sm = new SearchMotif();
        
        bw.write("\nDe que tamaño desea encontrar el motif más representativo: ");
        bw.flush();
        
        int length = Integer.parseInt(br.readLine());
        
        //sm.generatePatterns(length, "");
        bw.write(sm.toString());
        bw.close();
        br.close();
    }

    private static class SearchMotif {

        public SearchMotif() {
        }
    }
}
