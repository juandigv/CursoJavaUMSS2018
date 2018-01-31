package bo.edu.umss.cs.ceis;

public class Main {

    public static void main(String[] args) {

        bo.edu.umss.cs.ceis.Fecha hoy = new bo.edu.umss.cs.ceis.Fecha(30, 1, 2018);
        //hoy.mostrarFechaCorta();
        hoy.mostrarFechaLarga();

        /*System.out.println(mayor(3, 7));
        System.out.println(mayor(113, 23));*/

        //mostrarN(5);
        //piraM(3);
        //mostrarTriangulo (10);
        //mostrarLinea (10);
        //mostrarinverso(9350);
        //ContarPares(12386);


    }

    public static void ContarPares(int par) {
        int cont = 0;
        int num;
        while (par != 0) {

            num = (par % 10) % 2;
            if (num == 0) {
                cont = cont + 1;
            }
            par = par / 10;
        }
        System.out.println(cont);
    }

    public static void mostrarinverso(int z) {

        while (z != 0) {

            System.out.print(z % 10);
            z = z / 10;
        }


    }

    public static void mostrarN(int n)

    {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void mostrarTriangulo(int numero) {
        for (int y = 1; y <= numero; y++) {
            mostrarLinea(y);
            System.out.println();


        }
    }

    public static void mostrarLinea(int num) {

        for (int x = 1; x <= num; x++) {
            System.out.print("*");
        }

    }


    public static void piraM(int p) {
        for (int x = 1; x <= p; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static int mayor(int a, int b) {
        int mayor = a;
        if (b > a) {
            mayor = b;
        }
        return mayor;
    }

    public static void primeraClase() {
        System.out.println("Bienvenidos UMSS!!!");

        int x = 3;

        System.out.println(x++);
        System.out.println(x);

        Object xx = "Holaaa";

        //xx = 3D;

        if (xx instanceof String) {
            System.out.println(xx + " Es una cadena");
        } else if (xx instanceof Integer) {
            System.out.println(xx + " Es un entero!");
        } else {
            System.out.println(xx + " No es nada!");
        }
    }

}