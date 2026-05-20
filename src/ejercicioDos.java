public class ejercicioDos {
    static int sTres=0;
    static int sCinco=0;
    static int sAmbos=0;

    public static void main(String[] args) {
        for (int nN=1; nN<=50;nN++) {
            if (nN %3==0 && nN%5==0) {
                sAmbos+=nN;
            }
            else{
                if (nN %5==0) {
                    sCinco+=nN;
                }
                else{
                    if (nN%3==0) {
                        sTres+=nN;
                    }
                }
            }
            System.out.println(nN);
            System.out.println("suma de divisibles por 3 = " + sTres);
            System.out.println("suma de divisibles por 5 = " + sCinco);
            System.out.println("suma de divisibles por 3 y por 5 =" + sAmbos);
        }
    }

}
