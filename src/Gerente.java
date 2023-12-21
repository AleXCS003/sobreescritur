public class Gerente extends Empleado {
    int bonoGerente;

    public Gerente(String nombre, double salarioBase, int bonoGerente) {
        super(nombre, salarioBase);
        this.bonoGerente = bonoGerente;
    }

    @Override
    public void calcularSalario() {
        System.out.println("El salario del gerente es :" + (salarioBase + bonoGerente));
    }
}