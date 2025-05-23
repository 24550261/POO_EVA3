/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author oujeffu
 */
public class EVA3_10_LECTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta= "/Users/oujeffu/Desktop/archivos/prueba.txt";
        try{
            readUsingScanner(ruta);
                System.out.println("");
                System.out.println("");
            readUsingFiles(ruta);
            System.out.println("");
                System.out.println("");
            readusingBufferedReader(ruta);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void readUsingScanner (String ruta) throws IOException{
       System.out.println("Lectura de archivos usando Scanner");
        Path path= Paths.get(ruta);
       String cade= Files.readString(path);
        //System.out.println(cade);
        File source = new File(ruta);
        Scanner leerArch = new Scanner(source);
        leerArch.nextLine();
        while (leerArch.hasNextLine()){
            cade= leerArch.nextLine();
            System.out.println(cade);
        }
        leerArch.close();
        
                
        
    }
    public static void readUsingFiles(String ruta)throws IOException{
            System.out.println("Lectura de archivos usando files");
        Path path= Paths.get(ruta);
       String cade= Files.readString(path);
       System.out.println(cade);
        }
    
    public static void readusingBufferedReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lectura de Archivos usando buffered reader");
        File file= new File(ruta);
        FileInputStream inStream= new FileInputStream(file);
        InputStreamReader in= new InputStreamReader(inStream);
        BufferedReader leertxt= new BufferedReader(in);
        String cade;
        //Asignamos la cadena a cade, luego evauo cade != null
        while ((cade=leertxt.readLine())!= null){
            
            System.out.println(cade);
        }
        leertxt.close();

    }
    
    
    
}
