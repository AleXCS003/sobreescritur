public class Desarrollador extends Empleado {
    Double horasExtras;

    public Desarrollador(String nombre, double salarioBase, double horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public void calcularSalario() {
        System.out.println("El salario del desarrolador es :" + (salarioBase + horasExtras));
    }
}
