public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(33);
        cliente.setNombre("Fernando");
        cliente.setTelefono("956000000");
        cliente.setCredito(2000);

        System.out.println("El cliente es " + cliente.getNombre() + " , con número de telefono " + cliente.getTelefono() + " con edad " + cliente.getEdad()+ " y su credito es " + cliente.getCredito());


        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Alberto");
        trabajador.setEdad(25);
        trabajador.setTelefono("956000000");
        trabajador.setSalario(1500);

        System.out.println("El trabajador es " + trabajador.getNombre() + " , con número de telefono " + trabajador.getTelefono() + " con edad " + trabajador.getEdad()+ " y su salario es " + trabajador.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario(){
        return this.salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

}