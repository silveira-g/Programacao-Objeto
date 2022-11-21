public class Carro extends Veiculo{
    int quantidadePortas;

    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque, int quantidadePortas){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.quantidadePortas = quantidadePortas;
    }
    void setQuantidadePortas(int quantidadePortas){
        this.quantidadePortas=quantidadePortas;
    }
    int getCapacidadePortas(){
        return quantidadePortas;
    }
}