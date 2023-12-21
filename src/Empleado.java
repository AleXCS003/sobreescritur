public class Empleado {
    /*artributos*/
    String nombre;
    Double salarioBase;

    /*Metodo constructor*/
    public Empleado(String nombre,double salarioBase){
        this.nombre= nombre;
        this.salarioBase=salarioBase;

    }
    public void calcularSalario(){
        System.out.println("El salario es:"+salarioBase);
    }
}
    
