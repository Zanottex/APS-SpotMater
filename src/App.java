
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static Object[][] biblioteca = new Object[8][6];
    public static Object[][] Playlist = new Object[8][6];
    public static double tempo_ouvido = 0.0;
    public static int total_de_musicas_ouvidas = 0;

    public static void main(String[] args) throws Exception {

        //Musica 1
        biblioteca[0][0] = "banco";//Nome da Música
        biblioteca[0][1] = "matue";//Cantor
        biblioteca[0][2] = 1;      //Tipo 1 = Trap
        biblioteca[0][3] = 4.14;   //Duração
        biblioteca[0][4] = false;  //Favorito
        biblioteca[0][5] = 0;      //Quantidade de repetições
        //Musica 2
        biblioteca[1][0] = "v de vilao";
        biblioteca[1][1] = "matue";
        biblioteca[1][2] = 1;
        biblioteca[1][3] = 2.26;
        biblioteca[1][4] = false;
        biblioteca[1][5] = 0;      //Quantidade de repetições
        //Musica 3
        biblioteca[2][0] = "bonjour";
        biblioteca[2][1] = "kayblack";
        biblioteca[2][2] = 1;
        biblioteca[2][3] = 2.26;
        biblioteca[2][4] = false;
        biblioteca[2][5] = 0;      //Quantidade de repetições
        //Musica 4
        biblioteca[3][0] = "ransom";
        biblioteca[3][1] = "lil tecca";
        biblioteca[3][2] = 1;
        biblioteca[3][3] = 2.11;
        biblioteca[3][4] = false;
        biblioteca[3][5] = 0;      //Quantidade de repetições
        //Musica 5
        biblioteca[4][0] = "yes or no";
        biblioteca[4][1] = "teto";
        biblioteca[4][2] = 1;
        biblioteca[4][3] = 3.09;
        biblioteca[4][4] = false;
        biblioteca[4][5] = 0;      //Quantidade de repetições
        //Musica 6
        biblioteca[5][0] = "thunderstruck";
        biblioteca[5][1] = "ac/dc";
        biblioteca[5][2] = 2;      //Tipo 2 = Rock
        biblioteca[5][3] = 4.53;
        biblioteca[5][4] = false;
        biblioteca[5][5] = 0;      //Quantidade de repetições
        //Musica 7
        biblioteca[6][0] = "i was made for lovin'you";
        biblioteca[6][1] = "kiss";
        biblioteca[6][2] = 2;
        biblioteca[6][3] = 4.31;
        biblioteca[6][4] = false;
        biblioteca[6][5] = 0;      //Quantidade de repetições
        //Musica 8
        biblioteca[7][0] = "locked out of heaven";
        biblioteca[7][1] = "bruno mars";
        biblioteca[7][2] = 3;     //Tipo 3 = POP
        biblioteca[7][3] = 3.53;
        biblioteca[7][4] = false;
        biblioteca[7][5] = 0;      //Quantidade de repetições

        System.out.println("Olá! Seja muito bem vindo ao SpotMaster! Primeiramente escreva seu nome: ");
        String nome = scanner.next();

        do {

            Hello(nome);
            int escolha = Home();
            switch (escolha) {
                case 1:
                    PesquisarMusica();
                    break;
                case 2:
                    PesquisarArtista();
                    break;

            }
        } while (true);

    }

    //Saudações
    public static void Hello(String nome) {
        System.out.println("\nBem vindo! " + nome);
        System.out.println("Muito obrigado por utilizar o nosso serviço!");
    }

    //Menu
    public static int Home() {
        System.out.println("Selecione uma das seguintes opções:");
        System.out.println("1 - Pesquisar Musica    |    2 - Pesquisar Artista");
        System.out.println("3 - Tocar Música        |    4 - Estatísticas");
        System.out.println("5 - PlayList            |    6 - Favoritas");
        return scanner.nextInt();

    }

    //Pesquisar Música
    public static void PesquisarMusica() {
        System.out.println("Digite o nome da Musica (sem acentos): ");
        scanner.nextLine();
        String nome = scanner.nextLine().toLowerCase();
        boolean musica_existe = true;
        for (int i = 0; i <= 7; i++) {
            if (biblioteca[i][0].equals(nome)) {
                System.out.println("Nome: " + biblioteca[i][0]);
                System.out.println("Cantor: " + biblioteca[i][1]);
                if (biblioteca[i][2].equals(1)) {
                    System.out.println("Estilo: Trap");
                } else if (biblioteca[i][2].equals(2)) {
                    System.out.println("Estilo: Rock");
                } else if (biblioteca[i][2].equals(3)) {
                    System.out.println("Estilo: Pop");
                }
                System.out.println("Duração: " + biblioteca[i][3]);
                musica_existe = false;
            }
        }
        if (musica_existe) {
            System.out.println("A musica digitada não existe em nossa biblioteca!");
        }
        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();
    }

    public static void PesquisarArtista() {

        System.out.println("Digite o nome do(a) artista: (Ou digite Todos para listar todos)");
        scanner.nextLine();
        String nome = scanner.nextLine().toLowerCase();

        if (nome.equals("todos")) {
            System.out.println("------LISTA DE MÚSICOS------");
            System.out.println("------     Matuê      ------");
            System.out.println("------     Teto       ------");
            System.out.println("------     AC/DC      ------");
            System.out.println("------     KISS       ------");
            System.out.println("----------------------------");
            System.out.println("Esses são os músicos disponiveis em nosso catálogo!");
        } else {
            boolean musico_existe = false;
            for (int i = 0; i <= 7; i++) {
                if (biblioteca[i][1].equals(nome)) {
                    System.out.println("Cantor: " + biblioteca[i][1]);
                    musico_existe = true;
                    break;
                }
            }
            //Printa as musicas do cantor.
            if (musico_existe) {
                for (int i = 0; i <= 7; i++) {
                    if (biblioteca[i][1].equals(nome)) {
                        System.out.println("Música: " + biblioteca[i][0]);
                    }
                }
            } else {
                System.out.println("Escreva o nome de um cantor que tenhamos no catálogo!");
            }
        }
        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();

    }

}
