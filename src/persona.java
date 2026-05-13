public class persona {
    static String nombrePersona = "";
    static String apellidosPersona = "";
    static int edad = 0;
    static char gender = 'M';
    static float promedioPersona = 3.9f;
    static boolean viveManizales = true;
    static void imprimirManizales(){
        if (viveManizales == true) {
            System.out.println("Vive en manizales");
        } else {
            System.out.println("No vive en manizales");
        }
    }
    static void imprimirGender(){
        if (gender == 'M') {
            System.out.println("Genero masculino");
        } else {
            if (gender == 'F') {
                System.out.println("Genero femenino");
            } else {
                System.out.println("Es cacorro");
            }
        }
    }
    static void imprimirPromedio(){
        System.out.println("Promedio: " + promedioPersona);
    }
    static void imprimirEdad(){
        System.out.println("Edad: " + edad);
    }
    static void imprimirInformacion(){
        System.out.println("Informacion del estudiante: \nNombre completo" + nombrePersona);
    }
    public static void main(String[] args) {
        imprimirInformacion();
        imprimirManizales();
        imprimirEdad();
        imprimirPromedio();
        imprimirGender();
    }
}
