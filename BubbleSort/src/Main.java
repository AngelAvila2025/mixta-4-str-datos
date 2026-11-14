
public class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = {5, 2, 8, 1, 4};
        int n = arr.length; // Extraer el tamaño del arreglo

        // Paso 1: recorrer el arreglo n veces
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.println("/////////////////////////////");

        // Paso 2: encontrar las parejas por vuelta
        for (int i = 0; i < n - 1; i++) {

            System.out.println("Vuelta " + (i + 1));

            for (int j = 0; j < n - 1 - i; j++) {

                // Paso 3: Hacer la pregunta: ¿están al revés?
                if (arr[j] > arr[j + 1]) {

                    // Hacer el intercambio
                    int aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }

                System.out.println(arr[j] + " y " + arr[j + 1]);
            }

            System.out.println("/////////////////////////////");
        }

        // Paso 4: mostrar el arreglo ordenado
        System.out.println("Numeros acomodados:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
