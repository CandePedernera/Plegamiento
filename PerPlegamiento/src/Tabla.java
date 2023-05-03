public class Tabla {
    Persona arr[]; 
    public Tabla(){
        this.arr= new Persona[1000];
    }
    static int cambioInt(String key){
        return Integer.parseInt(key);
    }
    static int dispPleg(int key){
        int p1=key/1000; 
        int p2= key%1000; 
        int suma= p1+p2; 
        int clave= suma%1000; 
        return clave; 
    }
    public void insertar(Persona per){
        int val; 
        int key, posicion; 
        val=cambioInt(per.key); 
        key=dispPleg(val); 
        posicion=key; 
        arr[posicion]=per; 
    }
    public void muestraArr(){
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=null){
                System.out.println("El lugar que ocupa es: " + i +" nombre: " + arr[i].getName() + "La clave era: " + arr[i].getKey());
            }
        }
    }
}
