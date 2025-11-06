package FormasGeométricas;

public class retangulo {
    double lado;
    double area;
    double perimetro;
    double altura;

    public retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
        this.area = calcularArea2();

    }

    public void calcularArea() {
        this.area = this.lado * this.altura;
    }

    public double calcularArea2() {
        return this.lado * this.altura;
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * (this.lado + this.altura);
    }

    public void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
