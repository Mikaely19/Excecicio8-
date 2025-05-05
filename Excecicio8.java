public class App {
    public static void main(String[] args) throws Exception {
        // Vetores de entrada
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {4, 5, 6, 7, 8};

        // Criando um vetor para a união, com tamanho máximo possível
        int[] C = new int[A.length + B.length];
        int indexC = 0;

        // Adiciona elementos de A ao vetor C
        for (int i = 0; i < A.length; i++) {
            C[indexC++] = A[i];
        }

        // Adiciona elementos de B ao vetor C, evitando duplicatas
        for (int i = 0; i < B.length; i++) {
            boolean existe = false;
            for (int j = 0; j < A.length; j++) {
                if (B[i] == A[j]) {
                    existe = true;
                    break;
                }
            }
            // Se o elemento de B não estiver em A, adiciona ao C
            if (!existe) {
                C[indexC++] = B[i];
            }
        }

        // Cria um novo vetor apenas com os elementos válidos
        int[] resultado = Arrays.copyOf(C, indexC);

        // Exibe o vetor união
        System.out.println("Vetor C (união): " + Arrays.toString(resultado));
    }
}
