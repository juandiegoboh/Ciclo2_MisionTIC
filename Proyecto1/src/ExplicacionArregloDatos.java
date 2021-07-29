public class ExplicacionArregloDatos {

    public static void main(String[] args) {
        // Declarar arreglo
        String[] arreglo;
        int vector[];

        // Instanciar => crear, reservar el espacio en memoria
        vector = new int[10];        // 10 espacios en memoria para el arreglo
        arreglo = new String[10];   // 10 espacios en memoria para el arreglo
        arreglo[0] = "Algo...";
        arreglo[1] = "Algo... a";
        arreglo[2] = "Algo... b";


        String arreg[] = {"hola", "tripulantes", "mision tic"};
        System.out.println("-------------------------------");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
            System.out.println("Vector[" + i + "] = " + vector[i]);
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);

            if (i < arreg.length){
                System.out.println("-------------------------------");
                System.out.println("arreg[" + i + "] = " + arreg[i]);
                System.out.println("-------------------------------");
            }
        }
        System.out.println("-----------------------------");

        // Arreglos bidimensionales
        // 1raCol => Nombre
        // 2daCol => Apellido
        // 3raCol => Teléfono
        // 4taCol => E-mail

        String[][] tripulantes = new String[10][4];
        tripulantes[0][0] = "Daniel";
        tripulantes[0][1] = "López";
        tripulantes[0][2] = "3212345678";
        tripulantes[0][3] = "daniel@mail.com";
        tripulantes[1][0] = "Carolina";
        tripulantes[1][1] = "Gutierrez";
        tripulantes[1][2] = "3153772530";
        tripulantes[1][3] = "carolina@mail.com";

        System.out.println("|\t" + "Nombre" + "\t|\t" + "Apellido" + "\t|\t" + "Teléfono" + "\t|\t" + "Email" + "\t|");

        System.out.println("|\t" + tripulantes[0][0] + "\t|\t" + tripulantes[0][1] + "\t|\t" + tripulantes[0][2] +
                "\t|\t" + tripulantes[0][3] + "\t|");
        System.out.println("|\t" + tripulantes[1][0] + "\t|\t" + tripulantes[1][1] + "\t|\t" + tripulantes[1][2] +
                "\t|\t" + tripulantes[1][3] + "\t|");
        System.out.println("------------------------------------------");

        double[][] retos = new double[10][6];
        System.out.println(retos.length);
        System.out.println("------------------------------------------");

        for (int i = 0; i < retos.length; i++) {    // Este for recorre las filas
            System.out.print("|\t");
            for (int j = 0; j < retos[0].length - 1; j++) {     // Este for recorre las columnas
                if(j != 5){
                    retos[i][j] = Math.round(Math.random() * 5);
                } else{
                    retos[i][j] = (retos[i][0]+retos[i][1]+retos[i][2]+retos[i][3]+retos[i][4]) / 5.0;
                }
                System.out.print(retos[i][j] + "\t|\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");

        int x = 10, y = 10, z = 3;
        int[][][] imagen = new int[x][y][z];
        System.out.println("Obra de Arte Digital");
        System.out.println("Tamaño o longitud de la 1ra dimensión: " + imagen.length);
        System.out.println("Tamaño o longitud de la 2ra dimensión: " + imagen[0].length);
        System.out.println("Tamaño o longitud de la 3ra dimensión: " + imagen[0][0].length);
        System.out.println("------------------------------------------");

        for (int i = 0; i < imagen[0][0].length; i++) {    // Recorre las capas hasta el tamaño de la tercera dimensión
            for (int j = 0; j < imagen.length; j++) {    // Este for recorre las filas, primera dimensión
                System.out.print("|\t");
                for (int k = 0; k < imagen[0].length; k++) {    // Este for recorre las columnas, segunda dimensión
                    imagen[j][k][i] = (int) (Math.random() * 256);
                    System.out.print(imagen[j][k][i] + "\t|\t");
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------------------");
        }
    }


}







