package aula.sobre.tv;

public class controle {
    private tv ControleRemoto;

    public controle(tv ControleRemoto) {
        this.ControleRemoto = ControleRemoto;
    }
    public void LigaDesliga(){
        if(this.tv.isLigada()){
            this.tv.desligar();
        }else{
            this.tv.ligar();
        }
    }
    public void aumentarVolume() {
        this.tv.aumentarVolume();
    }
    public void diminuirVolume() {
        this.tv.diminuirVolume();
    }
    public void escolherCanal(int canal) {
        this.tv.escolherCanal(canal);
    }
    public void exibirInfo() {
        this.tv.exibirInfo();
    }
      
}