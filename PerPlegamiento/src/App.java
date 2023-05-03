public class App {
    public static void main(String[] args) throws Exception {
        Persona per1= new Persona("Candela", "245643");
        Persona per2= new Persona("Nahir", "245981");
        Persona per3= new Persona("Pedernera", "257135");
        Tabla tHash= new Tabla(); 
        tHash.insertar(per1);
        tHash.insertar(per2);
        tHash.insertar(per3);
        System.out.println("MUESTRA LUGAR ");
        tHash.muestraArr();
    }
}
