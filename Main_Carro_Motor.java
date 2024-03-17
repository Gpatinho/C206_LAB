public class Main_Carro_Motor {
    public static void main(String[] args){
        Carro p1 = new Carro();
        Carro p2 = new Carro();

        p1.cor =  "Preto";
        p1.marca = "Bmw";
        p1.modelo = "x1";
        p1.velocidadeMAX = 280;
        p1.velocidadeAtual = 120;
        p1.motor.potencia = 180;
        p1.motor.tipo = "v8";

        p2.cor =  "Vermelho";
        p2.marca = "porsche";
        p2.modelo = "911";
        p2.velocidadeMAX = 340;
        p2.velocidadeAtual = 200;
        p2.motor.potencia = 300;
        p2.motor.tipo = "v12";

        p1.ligar();
        p1.acelerar();
        p1.mostraInfo();
        p2.ligar();
        p2.acelerar();
        p2.mostraInfo();
    }
}
