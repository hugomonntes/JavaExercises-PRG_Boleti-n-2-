public class Ex14_b3 {
    public static double tirarDados(String jugador) {
        double dado1 = Ex13_b3.tirarDado(6);
        double dado2 = Ex13_b3.tirarDado(6);
        double resultadoDados = dado1 + dado2;
        System.out.printf("%s tira los dados...\n", jugador);
        System.out.printf("Dado 1: %.0f \n", dado1);
        System.out.printf("Dado 2: %.0f \n", dado2);
        System.out.printf("Suma: %.0f \n", resultadoDados);
        return resultadoDados;
    }

    public static int comprobacion(double resultado) {
        if (resultado == 7 || resultado == 11) {
            return 0; 
        } else if (resultado == 2 || resultado == 3 || resultado == 12) {
            return -1;
        } else {
            return (int) resultado;
        }
    }

    public static void main(String[] args) {
        double resultadoJugador = tirarDados("Jugador");
        int puntuacionJugador = comprobacion(resultadoJugador);

        if (puntuacionJugador == 0) {
            System.out.println("¡El jugador gana en la primera tirada!");
            return;
        } else if (puntuacionJugador == -1) {
            System.out.println("Craps. El jugador pierde. Gana la CPU.");
            return;
        }

        double resultadoCPU = tirarDados("CPU");
        int puntuacionCPU = comprobacion(resultadoCPU);

        if (puntuacionCPU == 0) {
            System.out.println("¡La CPU gana en la primera tirada!");
        } else if (puntuacionCPU == -1) {
            System.out.println("Craps. La CPU pierde. Gana el Jugador.");
        } else {
            if (puntuacionJugador > puntuacionCPU) {
                System.out.println("¡El Jugador gana con mayor puntuación!");
            } else if (puntuacionJugador < puntuacionCPU) {
                System.out.println("¡La CPU gana con mayor puntuación!");
            } else {
                System.out.println("Empate en puntuaciones.");
            }
        }
    }
}