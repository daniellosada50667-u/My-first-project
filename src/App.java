public class App {
  static String nombreEstudiante = "Bobo Hp";
    static int edad = 21;
    static float peso = 40.9f;
    static boolean estudianteActivo = true;
    static String texto_estudiante_activo = "";

    public static void main(String[] args) {
        if (estudianteActivo) {
            texto_estudiante_activo = "si";
        } else {
            texto_estudiante_activo = "no";
        }
        System.out.println(nombreEstudiante + "" + edad + "" + peso);
        System.out.println(nombreEstudiante + "  " + edad + "  " + peso);
        System.out.println(nombreEstudiante + "  - " + edad + " - " + peso);
        System.out.println("Estudiante activo " + texto_estudiante_activo);

    }
}
