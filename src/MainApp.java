
package exampleGson;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author santi
 */
public class MainApp {
    
    public static void main(String[] args) {   
        
        /*Los ficheros utilizados se encuentran en la carpeta
        raíz del proyecto*/
        readJson();
        writeJson();            
        
    }
    
    public static void readJson(){
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson

        /* El siguiente fragmento de código muestra la lectura de ficheros en 
        Java, visto en cursos anteriores como técnicas de programación,
        las líneas leídas del arhivo e1.json se almacenan en una cadena de texto 
        llamada json */

        String json = ""; 
        
        try (BufferedReader br = new BufferedReader(new FileReader("e1.json"))){
            String line;
            while ((line = br.readLine()) != null) {
                json+= line;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        /*Una vez leído todo el fichero, se convertirán sus elementos a objetos 
        de acuerdo a la coincidencias de atributos entre la clase Person y los 
        objetos del JSON, todos irán a un arreglo compuesto de objetos de la 
        clase Person.*/
        
        Person[] persons = gson.fromJson(json, Person[].class);

        System.out.println("Lectura de e1.json");
        
        for (Person person : persons) {
            System.out.println(person.toString());
        }
        
        /*Se recorre el arreglo de objetos Person, donde se llamará al método 
        toString() de cada objeto, el cual devuelve un String con todos los 
        valores de los atributos de cada persona, y se imprimen en pantalla .*/        
    }
    
    public static void writeJson(){
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson
        Person p=new Person("José",18,"Colombia");//Se instancia un objeto Person 
        
         /*Mediante el método toJson(), se convierten los valores del objeto 
        Person a formato de texto JSON, lo  cual se concatena en la cadena de 
        caracteres json junto a las llaves que abren y cierran el arreglo del 
        archivo */

        
        String json="["+gson.toJson(p)+"]";
        
        
        
         /* El siguiente fragmento de código muestra la escritura sobre 
        un fichero desde Java, visto en cursos anteriores como técnicas de 
        programación, se escribirá lo concatenado en la cadena de caracteres 
        json en un archivo llamado e2.json*/
        
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("e2.json"))) {
            bw.write(json);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }   
        
        System.out.println("\n"+"Escritura sobre e2.json"+"\n"+json);
    
    }

}
