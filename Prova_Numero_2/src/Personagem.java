public class Personagem {

    private String nome;
    private   int vida;
    private int energia;
    private int poder;

    Personagem[] personagem = new Personagem[5];

    public void tiravida(){
        System.out.println("O ataque causou dano! ");
    }

    public Personagem(String nome, int vida, int energia, int poder) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }

    public void addpersonagem(Personagem  p){
        for (int i = 0 ; i < personagem.length ; i++){
            if(personagem[i]==null){
                personagem[i] = p;
                System.out.println("Personagem adicionado!");
                break;
            }
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    // Aqui estou criando um mostra info para todos os personagens, estou usando a herança para criar uma clase mãe e todos usarem


 // Aqui estou criando um usar habilidade para todos os personagens, estou usando a herança para criar uma clase mãe e todos usarem
   public void usarHabilidade(){
       System.out.println("Usando Habilidade!");
       System.out.println();
   }

    public void mostraInfo(){
        System.out.println("Informações Personagem: ");
        System.out.println("-------------------------------------");
       // System.out.println("Nome: " + this.nome);
       // System.out.println("Soldados: ");
        for(int i = 0 ; i < personagem.length ; i++){
            if(personagem[i]!=null){
                if(personagem[i] instanceof Guerreiro){
                    Guerreiro g = (Guerreiro) personagem[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Guerreiro: ");
                    g.mostraInfo();
                    g.usarHabilidade();
                    g.atacar(personagem[i+-1]);
                    g.tiravida();


                } else if(personagem[i] instanceof Assassino){
                    Assassino a = (Assassino) personagem[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Assassino: ");
                    a.mostraInfo();
                    a.usarHabilidade();
                    a.atacar(personagem[i+-1]);
                    a.tiravida();


                } else if(personagem[i] instanceof Mago){
                    Mago m = (Mago) personagem[i];
                    System.out.println("-------------------------------------");
                    System.out.println("Informações do Mago: ");
                    m.mostraInfo();
                    m.usarHabilidade();

                }
            }
        }
    }
}

