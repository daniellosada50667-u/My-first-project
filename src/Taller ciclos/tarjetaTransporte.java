import java.util.Scanner;

public class tarjetaTransporte {
    static Scanner sc = new Scanner(System.in);
    static int saldo;
    static int codigo;
    static int ultimoViaje = 0;
    static int bloqueada = 0;
    public static void main(String[] args) {
        

        System.out.print("Saldo inicial: ");
        saldo = sc.nextInt();

        while (true) {
            System.out.print("Ingrese código de viaje (1=Autobús, 2=Metro, 3=Transbordo, 4=Recargar, 0=Salir): ");
            codigo = sc.nextInt();

            if (codigo == 0) {
                break;
            }

            if (bloqueada == 1) {
                if (codigo == 4) {
                    System.out.print("Ingrese monto a recargar: ");
                    int recarga = sc.nextInt();
                    saldo += recarga;
                    if (saldo > -4000) {
                        bloqueada = 0;
                        System.out.println("Tarjeta desbloqueada. Saldo actual: " + saldo);
                    } else {
                        System.out.println("Saldo sigue negativo: " + saldo + ". Debe ser mayor a -4000 para desbloquear.");
                    }
                } else {
                    System.out.println("Tarjeta bloqueada. Solo puede recargar con código 4.");
                }
                continue;
            }

            if (codigo == 1) {
                saldo -= 2500;
                ultimoViaje = 1;
            } else if (codigo == 2) {
                if (ultimoViaje == 2) {
                    saldo -= 1600;
                } else {
                    saldo -= 3200;
                }
                ultimoViaje = 2;
            } else if (codigo == 3) {
                saldo -= 1000;
                ultimoViaje = 3;
            } else if (codigo == 4) {
                System.out.print("Ingrese monto a recargar: ");
                int recarga = sc.nextInt();
                saldo += recarga;
                ultimoViaje = 0;
            } else {
                System.out.println("Código inválido.");
                continue;
            }

            if (saldo < -4000) {
                bloqueada = 1;
                System.out.println("Saldo negativo mayor a -4000. Tarjeta bloqueada.");
            } else if (saldo < 0) {
                System.out.println("Saldo negativo: " + saldo);
            } else {
                System.out.println("Saldo actual: " + saldo);
            }
        }

        System.out.println("Fin del programa. Saldo final: " + saldo);
    }
}
