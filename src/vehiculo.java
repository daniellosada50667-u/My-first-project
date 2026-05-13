public class vehiculo {
    static String marca = "Pagani";
    static int velocidad = 370;
    static boolean encendido = false;

    static void apagar() {
        if (!encendido) {
            System.out.println("El vehiculo ya esta apagado");
        } else {
            if (velocidad != 0) {
                System.out.println("El vehiculo esta en movimiento");
            } else {
                if (velocidad < 0) {
                    System.out.println("Valor invalido");
                } else {
                    System.out.println("Vehiculo apagado correctamente");
                }

            }

        }
    }
    static void acelerar(){
        if (!encendido) {
            velocidad += 10;
        }else{
            velocidad = 0;
        }
    }

    static void encender() {
        if (!encendido) {
            System.out.println("Apagado");
        } else {
            System.out.println("Encendido");
        }
        System.out.println(velocidad + "KM/H");
    }

    public static void main(String[] args) {
        encender();
        acelerar();
        apagar();
    }

}
