import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        //tipos de datos -> Las declaraciones de las variales tienen que ser llamadas con su tipo de dato. Ej int total;
        int total=0; //se puede inicializar en el momento de declaración o luego dentro de la ejecución del programa
        String nombreUsuario;
        String poblacion;
        int habitantes;
        //Luego tenemos las declaraciones de la clase Scanner que nos permite leer la información que solicitamos, siempre
        //relacionado con el tipo de dato que se va a escribir
        //Declación
        Scanner sn  =new Scanner(System.in);
        //Ej: Solicita el Nombre, la población y en número de habitantes y acumulalo hasta que sean las 5 capitales de provincias de CLM
        //Sumar el total de habitantes de las 5 capitales

        //bucles
        //Utilizamos un bucle desde 1 hasta 5 y lee los datos.
        for (int i=1;i<=5;i++) {

            System.out.println("Indica la Provincia->");
            poblacion=sn.nextLine();
            System.out.println("Indica el número de habitantes");
            habitantes=sn.nextInt();sn.nextLine();
            System.out.println( "Indica tu nombre->");
            nombreUsuario=sn.nextLine();
            //Condicional -> si el numero de habitantes es menor que 20000, indicar que hay un error y restar 1 a i para que vuelva a solicitar la inf.
            if (habitantes<20000){
                i--;
                System.out.println(nombreUsuario+ "- Los habitantes de " + poblacion + " son mas de " + habitantes + ". Vuelve a insertar la información." );

            }else {
                total += habitantes;
            }

        }
        System.out.println("El número de habitantes de las Provincias de CLM es " + total);

    }


}
