package aula1610;

public class principal {
    /*
     * "Criar a clase quadrado e circulo
     * com atributos: area e perimetro.
     * Método: calcular area e calcular perimetro. e imprimir."
     */
    public static void main(String[] args) {
        quadrado q1 = new quadrado(4);
        q1.calcularArea();
        q1.calcularPerimetro();
        q1.imprimir();
    }
}
