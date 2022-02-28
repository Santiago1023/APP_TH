package Vista;

import Modelo.ARL;
import Modelo.Contrato;
import Modelo.DBJson;
import Modelo.EPS;
import Modelo.Empleado;
import Modelo.Persona;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class MainApp {
    
    protected static GUIRegistro ventanaRegistro;
    protected static GUIDatosPersonales ventanaDatosPersonales;
    protected static GUIDatosLaborales ventanaDatosLaborales;
    
    public static void main(String[] args) {   
        /*DBJson DAO = new DBJson();
        System.out.println("BIENVENID@");
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese 1 para registrar un empleado, cualquier otro dato para finalizar la aplicaion");
            if(scanner.nextLine().equals("1")){
                Empleado empleado = pedirInformacion();
                DAO.guardar(empleado);
            }else{
                break;
            }
        }*/
        ventanaRegistro = new GUIRegistro();
        ventanaDatosLaborales = new GUIDatosLaborales();
        ventanaDatosPersonales = new GUIDatosPersonales();
        ventanaRegistro.setVisible(true);
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
        
        
        Empleado empleado = new Empleado(nombre, apellido, id, pais, contrato, eps, "activo", cargo, null, null);
        return empleado;
    }
    
}
