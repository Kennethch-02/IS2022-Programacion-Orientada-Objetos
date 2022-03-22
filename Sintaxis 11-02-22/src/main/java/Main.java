public class Main {
    private int x;
    public int getX(){
        return x;
    }

    public static void main(String[] args) {
        /*
        Imprimir datos en consola, para ahorar tiempo utilizar sout
         */

        System.out.println("Hola Mundo");

        /*
        Para las variables
        DECLARACION
        int x;

        ASIGNACION
        x = 100;

        Nora: Los resultados de las opreaciones se guardan
        en el tipo de dato con mayor espacio en memoria
         */

        int b = 10/3; // No hay error debido a que esta devicion devuelve un entero
        int a = (int) (10/3.0); // Aca devuelve un double, por lo que es necesario realizar un Cast
        Main m = new Main();
        System.out.println(m.getX());

        // Clase 16/02/2022

        if (a>10){
            System.out.println("");
        }else if(a > 0){
            System.out.println("");
        }else{
            System.out.println("");
        }
        // & o | representan el and o or logicos
        // si solo queremos indagar la primera instrucion
        // && || utilizamos simboo doble, para && funciona con False
        // para || funciona con True
        // para --x ++x primero se opera y luego se usa la variable
        // caso contrario para x-- x++
    }
}