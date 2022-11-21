public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        carro.setCor("branco");
        carro.setModelo("Honda Fit");
        carro.setCapacidadeTanque(51);

        System.out.println("O modelo do carro é: " + carro.modelo);
        System.out.println("A cor do carro é: " + carro.cor);
        System.out.println("A capacidade do tanque do carro é: " + carro.capacidadeTanque + "L");
        System.out.println("Com a gasolina a R$5.00, você gastará  " + carro.calcularTotal(5) + " reais para encher o tanque.");
    }
}
