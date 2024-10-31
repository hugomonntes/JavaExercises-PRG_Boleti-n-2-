public class Ex12_b3 {
    public static char generarQuinielaNormal(){
        double numeroAleatorio = Math.ceil(Math.random()*3);
        return numeroAleatorio == 1 ? '1' : numeroAleatorio == 2 ? '2' : 'X';
    }

    public static char generarQuinielaPonderada(){
        double numeroAleatorio = Math.ceil(Math.random()*3);
        return numeroAleatorio == 1 ? '1' : numeroAleatorio == 2 ? '2' : 'X';
    }
    public static void main(String[] args) {
        int contador = 1;
        for (int i = 1; i <= 14; i++) {
            System.out.println("Partido " + contador + ": " + generarQuinielaNormal());
            contador++;
        }
    }
}

/*
12. a) Codificar un programa que genere una quiniela aleatoria. Es decir, se deben
dar 14 resultados aleatorios como 1, X ó 2 indicando delante el número de partido
y los resultados alineados en una columna (no uses \t, si no ajuste con printf ). Se
debe realizar al menos una función que devuelva un 1 una X o un 2 (char o String)
aleatorio.

b) Realizar la quiniela ponderada, es decir, haz otra función que devuelva 1, X o 2
pero que la probabilidad de sacar 1 sea del 60%, la de sacar X sea 25% y la de
sacar un 2 sea un 15%.
Enel main debes dar a elegir quiniela normal o ponderada.
Pista: Sacar un numero aleatorio entre 1 y 100. Si el resultado es menor o igual
que 60, se asigna un 1 al resultado, si es entre 61 y 85 (60+25) se le asigna una X
y si es entre 86 y 100 se le asigna un 2.
*/