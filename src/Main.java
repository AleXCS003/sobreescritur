public class Main {
    public static void main (String[] args){
        Empleado person1=new Empleado("Luis",460);
        Gerente person2= new Gerente("Oscar",460,100);
        Desarrollador person3 = new Desarrollador("Hector",460,150);
        person1.calcularSalario();
        person2.calcularSalario();
        person3.calcularSalario();

    }
}
