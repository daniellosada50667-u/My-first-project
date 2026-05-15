public class parolo {
    // Revisar archivos y salir del ciclo una vez se encuentre el archivo malicioso
    public static void main(String[] args) {
        System.out.println("-----Iniciando escaneo de seguridad");
        for(int archivo = 1; archivo <=10; archivo++ ){
            System.out.println("Archivo #" + archivo);
            if (archivo == 4 ) {
                System.out.println("Alerta.\n El archivo #" + archivo + " esta corrupto" );
                break;
            }
        }
    }
}
