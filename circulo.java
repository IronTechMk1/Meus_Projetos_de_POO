package aula1610;

public class circulo {
    double raio;
    double area;
    double perimetro;
    final double PI = 3.14;

    public circulo(double raio) {
        this.raio = raio;
        this.area = calcularArea2();
    }

    public void calcularArea() {
        this.area = PI * (this.raio * this.raio);
    }

    public double calcularArea2() {
        return PI * (this.raio * this.raio);
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * PI * this.raio;
    }

    public void imprimir() {
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }

}
