import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio realizado por: SAMUEL DAVID OLARTE TENJO
        Empresa empresa = new Empresa();
        Map<String, String> empleados = new HashMap<>();
        Scanner can = new Scanner(System.in);
        int opc;

        do {

            System.out.println("""
                    Empresa
                    1) Cargar Saldo de la Empresa
                    2) Contratar Personal
                    3) Pagar Sueldo
                    4) Mostrar Informacion
                    5) Despedir
                    6) Salir
                    Ingrese la opcion deseada: """);
            opc = can.nextInt();
            switch (opc) {

                case 1:

                    System.out.println("Ingrese el saldo con el que contara la empresa");
                    double saldo = can.nextDouble();
                    empresa.setSaldo(saldo);
                    System.out.println("Su saldo ha sido establecido");
                    break;

                case 2:

                    empleados.put(empresa.usuario(), empresa.trabajo());
                    System.out.println("Empleado Contratado");
                    break;

                case 3:

                    System.out.println("Ingrese el nombre del empleado para pagar sueldo:");
                    String nombreEmpleado = can.next();
                    if (empleados.containsKey(nombreEmpleado)) {

                        String cargoEmpleado = empleados.get(nombreEmpleado);
                        empresa.pagarSueldo(cargoEmpleado);

                    } else {

                        System.out.println("Empleado no encontrado");

                    }
                    break;

                case 4:

                    System.out.println("Saldo de la empresa: " + empresa.getSaldo());
                    System.out.println("Empleados contratados:");
                    if (!empleados.isEmpty()) {

                        for (HashMap.Entry<String, String> entry : empleados.entrySet()) {

                            System.out.println(entry.getKey() + ", " + entry.getValue());

                        }
                    }else {

                        System.out.println("No hay empleados contratados");

                    }
                    break;

                case 5:

                    System.out.println("Ingrese el nombre del empleado que desear despedir: ");
                    String eliminar = can.next();
                    if (empleados.containsKey(eliminar)){

                        empleados.remove(eliminar);
                        System.out.println("Despido exitoso");

                    }else {

                        System.out.println("Empleado no encontrado");

                    }
                    break;

                case 6:

                    System.out.println("Hasta Luego");
                    break;

                default:
                    System.out.println("El valor ingresado no es valido");
                    break;
            }
        }while(opc != 6);
    }
}