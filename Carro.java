public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMAX;
    double velocidadeAtual;

    Motor motor;
    public Carro(){
        this.motor =  new Motor();
    }

    void ligar(){
        System.out.println("Aquecendo motor");
    }
    void acelerar(){
        System.out.println("Passando mais uma marcha");
    }
    void mostraInfo(){
        System.out.println("Cor do meu carro: " + cor);
        System.out.println("Marca do meu carro: " + marca);
        System.out.println("Modelo do meu carro: " + modelo);
        System.out.println("Velocidade max: " + velocidadeMAX);
        System.out.println("Velocidade atual: " + velocidadeAtual);
        System.out.println("Potencia do meu motor: " + motor.potencia);
        System.out.println("Tipo do meu motor: " + motor.tipo);
    }
}
