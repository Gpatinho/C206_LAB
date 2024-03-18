import java.util.Scanner;

public class main_empresa {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Empresa ep1 = new Empresa();
        Empresa ep2 = new Empresa();


        p1.nome = "Guilherme"; //Scanner.nextLine();
        p1.cpf = "111.111.111-11"; // Scaner.nextLine();
        p1.idade = 18; //Scaner.nextInt();
        System.out.print("Pessoa Criada");
        System.out.println();

        f1.matricula = 0001; // Scanner.nextInt();
        System.out.print("Funcionario criado");
        System.out.println();

        ep1.nome = "Adidas";
        ep1.cnpj = "123456789";
        ep1.endereco = "EUA";
       // ep1.funcionariosDisponiveis = ; ///


        p2.nome = "Felipe"; //Scanner.nextLine();
        p2.cpf = "111.111.111-11"; // Scaner.nextLine();
        p2.idade = 19; //Scaner.nextInt();
        System.out.print("Pessoa Criada");
        System.out.println();

        f2.matricula = 0002; // Scanner.nextInt();
        System.out.print("Funcionario criado");
        System.out.println();

        ep2.nome = "Adidas";
        ep2.cnpj = "123456789";
        ep2.endereco = "EUA";
       // ep2.funcionariosDisponiveis = ; ///

        p1.mostraInfo();
        p2.mostraInfo();
        f1.mostraInfo();
        f2.mostraInfo();
        ep1.mostrarInfo();
        ep1.adicionarFuncionario();
        ep1.alocarFuncionario();
        ep1.contarFuncionariosDisponiveis();
        ep2.mostrarInfo();
        ep2.adicionarFuncionario();
        ep2.alocarFuncionario();
        ep2.contarFuncionariosDisponiveis();



        Scanner pedido = new Scanner(System.in);
        int escolha = pedido.nextInt();

        if (escolha == 1){
            System.out.println("Voce escolheu a primeira opção");
        }










    }
}
