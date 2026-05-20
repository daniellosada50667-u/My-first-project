import java.util.Scanner;
public class fabricaDeDulces {    
    static Scanner sc = new Scanner(System.in);
    static int conDeneg=0;
    static int conAcept=0;
    static int peso=0;
    public static void main(String[] args) {
        while (true) {
            System.out.println("Indique el peso del dulce: ");
            peso = sc.nextInt();
            if (peso>12 && peso<8) {
                System.out.println("Dulce defectuoso");
                conDeneg++;   
            }
                else {
                    System.out.println("Dulce aceptado");
                    conAcept++;
                }
                if (conDeneg==3) {
                    System.out.println("Se han rechazado 3 dulces, se detiene la maquina");
                    break;
                }

        }
        System.out.println("Cantidad de dulces aceptados: " + conAcept);
        System.out.println("Cantidad de dulces rechazados: " + conDeneg);
    }
     
    
    
}
