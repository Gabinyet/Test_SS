// LEE NÚMERO Y DETERMINA SI ES PAR O IMPAR 

public class LeerNumero {

    public static void main(String[] args) {

        int NUMERO = 14; // leo el número

        //para saber si es par 
        if (NUMERO % 2 == 0) {
            System.out.println("Numero Par");
            int i = NUMERO;
            while (i >= 0) {
                // al ser par, imprimo todos los pares desde el input hasta 0
                System.out.println(i);
                i = i - 2; // le resto dos para quedarme con el número par 
            }
        } else {
            System.out.println("Numero Impar");
            // hacemos lo mismo que antes, solo que esta vez con los impares y el último será el 1 
            int i = NUMERO;
            while (i >= 1) {
                System.out.println(i);
                i = i - 2; // le resto dos para quedarme con el número impar
            }
        }
    }
}
