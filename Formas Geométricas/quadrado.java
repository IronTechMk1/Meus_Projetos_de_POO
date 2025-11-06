package aula1610;

public class quadrado {
    // Toda* classe terá atributos e métodos
    // Atributos são as caracteristicas (variaveis)
    // métodos são as ações (função)
    // as suas caracteristicas:
    // método construtor: Quando for instanciado um novo objeto, ele será
    // 'contrutuido' conforme o método construtor
    // definido no método construtor (fabrica da sua classe)
    // metodo get e set:
    // get: pegar o valor do atributo
    // set: definir o valor do atributo
    // metodos 'proprios': Métodos que criamis para dar mais ações para a nossa
    // classe.

    // Atributos da classe quadrado:
    double lado;
    double area;
    double perimetro;

    // metodos
    // método construtor
    public quadrado(double lado) {
        this.lado = lado;
        this.area = calcularArea2();
    }

    // metodo proprios
    // calcular separado
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    // calcular no contrudor
    public double calcularArea2() {
        return this.lado * this.lado;
    }

    public void calcularPerimetro() {
        this.perimetro = this.lado * 4;
    }

    public void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }

}
