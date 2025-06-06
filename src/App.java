
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Object[][] biblioteca = new Object[8][6];
        Object[][] Playlist = new Object[8][6];

        double tempo_ouvido = 0.0;
        int total_de_musicas_ouvidas = 0;

        //Musica 1
        biblioteca[0][0] = "Banco";//Nome da Música
        biblioteca[0][1] = "Matuê";//Cantor
        biblioteca[0][2] = 1;      //Tipo 1 = Trap
        biblioteca[0][3] = 4.14;   //Duração
        biblioteca[0][4] = false;  //Favorito
        biblioteca[0][5] = 0;      //Quantidade de repetições
        //Musica 2
        biblioteca[1][0] = "V de Vilão";
        biblioteca[1][1] = "Matuê";
        biblioteca[1][2] = 1;
        biblioteca[1][3] = 2.26;
        biblioteca[1][4] = false;
        biblioteca[1][5] = 0;      //Quantidade de repetições
        //Musica 3
        biblioteca[2][0] = "Bonjour";
        biblioteca[2][1] = "KayBlack";
        biblioteca[2][2] = 1;
        biblioteca[2][3] = 2.26;
        biblioteca[2][4] = false;
        biblioteca[2][5] = 0;      //Quantidade de repetições
        //Musica 4
        biblioteca[3][0] = "Ransom";
        biblioteca[3][1] = "Liol Tecca";
        biblioteca[3][2] = 1;
        biblioteca[3][3] = 2.11;
        biblioteca[3][4] = false;
        biblioteca[3][5] = 0;      //Quantidade de repetições
        //Musica 5
        biblioteca[4][0] = "YES OR NO";
        biblioteca[4][1] = "Teto";
        biblioteca[4][2] = 1;
        biblioteca[4][3] = 3.09;
        biblioteca[4][4] = false;
        biblioteca[4][5] = 0;      //Quantidade de repetições
        //Musica 6
        biblioteca[5][0] = "Thunderstruck";
        biblioteca[5][1] = "AC/DC";
        biblioteca[5][2] = 2;      //Tipo 2 = Rock
        biblioteca[5][3] = 4.53;
        biblioteca[5][4] = false;
        biblioteca[5][5] = 0;      //Quantidade de repetições
        //Musica 7
        biblioteca[6][0] = "I Was Made For Lovin'You";
        biblioteca[6][1] = "KISS";
        biblioteca[6][2] = 2;
        biblioteca[6][3] = 4.31;
        biblioteca[6][4] = false;
        biblioteca[6][5] = 0;      //Quantidade de repetições
        //Musica 8
        biblioteca[7][0] = "Locked out of Heaven";
        biblioteca[7][1] = "Bruno Mars";
        biblioteca[7][2] = 3;     //Tipo 3 = POP
        biblioteca[7][3] = 3.53;
        biblioteca[7][4] = false;
        biblioteca[7][5] = 0;      //Quantidade de repetições

        System.out.println("Olá! Seja muito bem vindo ao SpotMaster! Primeiramente escreva seu nome: ");
        String nome = scanner.next();

        do {

            Hello(nome);
            int escolha = Home();

        } while (true);

    }

    //Saudações
    public static void Hello(String nome) {
        System.out.println("Bem vindo! " + nome);
        System.out.println("Muito obrigado por utilizar o nosso serviço!");
    }

    //Menu
    public static int Home() {
        System.out.println("Selecione uma das seguintes opções:");
        System.out.println("1 - Pesquisar Musica    |    2 - PlayList");
        System.out.println("3 - Tocar Música        |    4 - Estatísticas");
        System.out.println("6 - Favoritos");
        return scanner.nextInt();

    }

}
