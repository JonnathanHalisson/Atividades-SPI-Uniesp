public class contadorPares {

    public static void main(String[] args) {

        //Escreva dois programas para imprimir os números pares de 2 a 20. O primeiro deve usar o comando while e o segundo, o comando for. Utilize os controles de fluxos, se necessário.

        System.out.println("Primeiro impressor de números pares de 2 a 20:");

        int cont = 0;
        while (cont <= 20) {
            if (cont % 2 == 0) {
                if (cont < 20) {
                    System.out.print(cont + ", ");
                } else {
                    System.out.println(cont);
                }
            }
            cont++;
        }

        System.out.println();

        System.out.println("Segundo impressor de números em pares de 2 a 20:");
        for (int i = 0; i <= 20; i++) {
            if (i < 20) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            } else {
                System.out.println(i);
            }
        }
    }
}
