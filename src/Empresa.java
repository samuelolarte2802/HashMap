import java.util.Scanner;

public class Empresa {

    private double saldo;
    Empleado emple = new Empleado();

    public Empresa() {
    }

    public Empresa(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String usuario(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el nombre del empleado: ");
        String nombre = scan.nextLine();
        emple.setNombre(nombre);
        return  nombre;
    }
    public String trabajo(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el cargo del empleado:");
        System.out.println("Tecnico, Programador o Ingeniero");
        String cargo = scan.nextLine();
        emple.setCargo(cargo);
        return cargo;
    }

    public void pagarSueldo(String cargo){
        double pago = 0;
        if (cargo.equalsIgnoreCase("Ingeniero")) {
            pago = 150000;
        } else if (cargo.equalsIgnoreCase("Tecnico")) {
            pago = 100000;
        } else if (cargo.equalsIgnoreCase("Programador")) {
            pago = 120000;
        } else {
            System.out.println("Cargo no encontrado");
            return;
        }

        if (saldo >= pago) {
            saldo -= pago;
;
        } else {
            System.out.println("Saldo insuficiente en la empresa para pagar el sueldo");
        }
    }
}
