import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barre
 */
public class Createfile {
    
    static int max = 0;
    static String motifWinner;
    
    public Createfile()
    {
        this.max = -1;
        this.motifWinner = "";
    }
    
    public Createfile(int lines) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("sequences.umd"));
        for (int i = 0; i < lines; i++)
        {
            bw.write(createExperimentalRead());
        }
        bw.flush();
    }
    
    public String createExperimentalRead()
    {
        String read = "";
        Random rd = new Random();
        int number1 = Math.abs(rd.nextInt());
        int length = 5 + rd.nextInt(26);
            
        read = number1 + "," + (number1 + length) + "," + createSequences(length) + "\n";
                
        return read;
    }
    
    public String createSequences(int length)
    {
        String sequence = "";
        Random rd = new Random();
        
        for (int i = 0; i < length; i++)
        {
         switch (rd.nextInt(4))
         {
             case 0: { sequence += "A"; } break;
             case 1: { sequence += "C"; } break;
             case 2: { sequence += "G"; } break;
             case 3: { sequence += "T"; } break;
         }
        }
        return sequence;
    }
    
    public static int numberReads(String motif) throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader("sequences.umd");
        BufferedReader br = new BufferedReader(fr);
        
        int lines = 0, linesMotif = 0;
        
        String read = br.readLine();
        
        while (read != null)
        {
            if (read.split(",")[2].contains(motif))
            {
                linesMotif += 1;
            }
            lines += 1;
            read = br.readLine();
        }
        return linesMotif;
    }
    
    public static void generatePatterns(String motif, int length) throws IOException
    {
        int tempCounter;
        if (length == 1)
        {
            tempCounter = numberReads( motif + "A");
            if (tempCounter > max)
            {
                motifWinner = motif + "A";
                max = tempCounter;
            }
            tempCounter = numberReads ( motif + "C");
            if (tempCounter > max)
            {
                motifWinner = motif + "C";
                max = tempCounter;
            }
            tempCounter = numberReads ( motif + "G");
            if (tempCounter > max)
            {
                motifWinner = motif + "G";
                max = tempCounter;
            }
            tempCounter = numberReads(motif + "T");
            if (tempCounter > max)
            {
                motifWinner = motif + "T";
                max = tempCounter;
            }
            else
            {
                generatePatterns(motif + "A", length -1 );
                generatePatterns(motif + "C", length -1 );
                generatePatterns(motif + "G", length -1 );
                generatePatterns(motif + "T", length -1 );
            }
        }
    }
}    


