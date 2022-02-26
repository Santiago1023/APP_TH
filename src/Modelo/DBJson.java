package Modelo;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DBJson implements IDAO{

    @Override
    public void guardar(Empleado empleado) {
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson
        
         /*Mediante el método toJson(), se convierten los valores del objeto 
        Person a formato de texto JSON, lo  cual se concatena en la cadena de 
        caracteres json junto a las llaves que abren y cierran el arreglo del 
        archivo */

        
        String json="["+gson.toJson(empleado)+"]";
        
        
        
         /* El siguiente fragmento de código muestra la escritura sobre 
        un fichero desde Java, visto en cursos anteriores como técnicas de 
        programación, se escribirá lo concatenado en la cadena de caracteres 
        json en un archivo llamado e2.json*/
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            File file = new File("archivoEmpleados.json");
            // Si el archivo no existe, se crea
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(json);
            bw.newLine();
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println("\n"+"Escritura sobre e2.json"+"\n"+json);
    }

    @Override
    public void modificar(Empleado empleado) {
        
    }

    @Override
    public Empleado consultar(String identificacion) {
        return null;
    }

}
