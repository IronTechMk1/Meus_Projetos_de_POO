package Contato;

public class Contato {
    private String _nome, _email, _telefone;

    public Contato(String _nome, String _email, String _telefone) {
        this._nome = _nome;
        this._email = _email;
        this._telefone = _telefone;
    }

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_telefone() {
        return _telefone;
    }

    public void set_telefone(String _telefone) {
        this._telefone = _telefone;
    }

    //Método próprio
    public void imprimeInformacoes(){
        System.out.println("_nome: "+ this._nome);
        System.out.println("_email: "+ this._email);
        System.out.println("_telefone: "+ this._telefone);

    }
    
}
