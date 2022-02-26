import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class MainApp {
    
    public static void main(String[] args) {   
        
        /*Los ficheros utilizados se encuentran en la carpeta
        raíz del proyecto*/
        System.out.println("BIENVENID@");
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese 1 para registrar un empleado, cualquier otro dato para finalizar la aplicaion");
            if(scanner.nextLine().equals("1")){
                Empleado empleado = pedirInformacion();
                writeJson(empleado);
            }else{
                break;
            }
        }
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
        
        Empleado[] empleados = gson.fromJson(json, Empleado[].class);

        System.out.println("Lectura de e1.json");
        
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
        
        /*Se recorre el arreglo de objetos Person, donde se llamará al método 
        toString() de cada objeto, el cual devuelve un String con todos los 
        valores de los atributos de cada persona, y se imprimen en pantalla .*/        
    }
    
    public static Empleado pedirInformacion(){
        System.out.println("DATOS PERSONALES");
        Scanner scanner = new Scanner(System.in);
        
        Persona persona;
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el número de identificación:");
        String id = scanner.nextLine();
        System.out.println("Ingrese el país:");
        String pais = scanner.nextLine();
        persona = new Persona(nombre, apellido, id, pais);
        System.out.println("\n");
        
        System.out.println("DATOS DEL CONTRATO");
        Contrato contrato;
        System.out.println("Ingrese el cargo del empleado:");
        String cargo = scanner.nextLine();
        LocalDate fechaInicio = LocalDate.now();
        System.out.println("Ingrese el salario: (en números)");
        float salario = Float.parseFloat(scanner.nextLine());
        System.out.println("DATOS DE LA ARL");
        System.out.println("Ingrese el nombre del ARL:");
        String nombreARL = scanner.nextLine();
        System.out.println("Ingrese el tipo de afiliacion del ARL:");
        String afiliacionARL = scanner.nextLine();
        contrato = new Contrato(0, null, 0, fechaInicio, new ARL(nombreARL, afiliacionARL), salario);
        System.out.println("\n");
        
        System.out.println("DATOS DE LA EPS");
        System.out.println("Ingrese el nombre de la EPS:");
        String nombreEPS = scanner.nextLine();
        System.out.println("Ingrese el tipo de afiliacion de la EPS:");
        String afiliacionEPS = scanner.nextLine();
        EPS eps = new EPS(nombreEPS, afiliacionEPS);
        
        
        Empleado empleado = new Empleado(persona, contrato, eps, "activo", cargo, null, null);
        return empleado;
    }
    
    public static void writeJson(Empleado empleado){
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
            System.out.println("\n");
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

}
