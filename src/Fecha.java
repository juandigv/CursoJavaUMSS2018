package bo.edu.umss.cs.ceis;

public class Fecha {

    int dia;
    int mes;
    int año;


    public Fecha(int a, int b, int c) {
        dia = a;
        mes = b;
        año = c;
    }

    public void mostrarFechaCorta() {
        String corta = dia + "/" + mes + "/" + año;
        System.out.println(corta);

    }

    public void mostrarFechaLarga() {
        System.out.print(dia + " de ");

        switch (mes) {
            case 1:
                System.out.print("Enero");
                break;

            case 2:
                System.out.print("Febrero");
                break;
            case 3:
                System.out.print("Marzo");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.print("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Septiempre");
                break;
            case 10:
                System.out.print("Octubre");
                break;
            case 11:
                System.out.print("Noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
        }

        System.out.println(" de " + año);
    }
}

