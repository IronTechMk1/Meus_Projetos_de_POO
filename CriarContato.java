package Contato;

public class CriarContato {

    public static void main(String[] args) {

    Contato contato1 = new Contato(
     "Neymar",
     "ney@gmail.com",
     "(11) 91234-4321"
    );

    Contato contato2 = new Contato(
         "FrontMan",
         "round6@gmail.com",
         "(69) 94453-09321"
    );

    Contato contato3 = new Contato(
         "Spider-Man",
         "spiderman@gmail.com",
         "(17) 67432-05963");

    Contato contato4 = new Contato(
         "Iron Man",
         "ironman@gmail.com",
         "(17) 65634-21242");

         //contato1.imprimeInformacoes();

         agenda agenda = new agenda();
         agenda.armazenarContato(contato1);
         agenda.armazenarContato(contato2);
         agenda.armazenarContato(contato3);
         agenda.armazenarContato(contato4);

         agenda.imprimirContatos();

         agenda.removerContato(contato3);
}
}

