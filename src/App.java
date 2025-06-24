
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static double tempo_ouvido = 0.0;
    public static int total_de_musicas_ouvidas = 0;
    public static String[] nome_musica = new String[8];
    public static String[] nome_cantor = new String[8];
    public static Double[] duracao = new Double[8];
    public static Boolean[] favorito = new Boolean[8];
    public static Integer[] qtd_repetições = new Integer[8];
    public static Integer[] tipo = new Integer[8];
    public static Integer[] playlist = new Integer[8];
    public static int genero_trap = 0;
    public static int genero_rock = 0;
    public static int genero_pop = 0;
    public static int matue = 0;
    public static int teto = 0;
    public static int kayblack = 0;
    public static int liltecca = 0;
    public static int brunomars = 0;
    public static int acdc = 0;
    public static int kiss = 0;

    public static void main(String[] args) throws Exception {

        //Musicas
        nome_musica[0] = "banco";
        nome_cantor[0] = "matue";
        duracao[0] = 4.14;
        favorito[0] = false;
        qtd_repetições[0] = 0;
        tipo[0] = 1;

        nome_musica[1] = "v de vilao";
        nome_cantor[1] = "matue";
        duracao[1] = 2.26;
        favorito[1] = false;
        qtd_repetições[1] = 0;
        tipo[1] = 1;

        nome_musica[2] = "bonjour";
        nome_cantor[2] = "kayblack";
        duracao[2] = 2.26;
        favorito[2] = false;
        qtd_repetições[2] = 0;
        tipo[2] = 1;

        nome_musica[3] = "ransom";
        nome_cantor[3] = "lil tecca";
        duracao[3] = 2.26;
        favorito[3] = false;
        qtd_repetições[3] = 0;
        tipo[3] = 1;

        nome_musica[4] = "yes or no";
        nome_cantor[4] = "teto";
        duracao[4] = 3.09;
        favorito[4] = false;
        qtd_repetições[4] = 0;
        tipo[4] = 1;

        nome_musica[5] = "thunderstruck";
        nome_cantor[5] = "ac/dc";
        duracao[5] = 3.09;
        favorito[5] = false;
        qtd_repetições[5] = 0;
        tipo[5] = 2;

        nome_musica[6] = "i was made for lovin'you";
        nome_cantor[6] = "kiss";
        duracao[6] = 4.31;
        favorito[6] = false;
        qtd_repetições[6] = 0;
        tipo[6] = 2;

        nome_musica[7] = "locked out of heaven";
        nome_cantor[7] = "bruno mars";
        duracao[7] = 3.53;
        favorito[7] = false;
        qtd_repetições[7] = 0;
        tipo[7] = 3;
        //Musicas

        System.out.println("Olá! Seja muito bem vindo ao SpotMaster! Primeiramente escreva seu nome: ");
        String nome = scanner.next();
        boolean terminar = true;
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
                case 3:
                    TocarMusica();
                    break;
                case 4:
                    Estatísticas();
                    break;
                case 5:
                    PlayList();
                    break;
                case 6:
                    Favoritas();
                    break;
                case 7:
                    PesquisarGenero();
                    break;
                case 8:
                    terminar = false;
                    break;
            }
        } while (terminar);

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
        System.out.println("7 - Pesquisar Gênero    |    8 - Sair");
        return scanner.nextInt();

    }

    //Pesquisar Música
    public static void PesquisarMusica() {
        System.out.println("Digite o nome da Musica (sem acentos): (digite todas para listar a biblioteca completa)");
        scanner.nextLine();
        String nome = scanner.nextLine().toLowerCase();
        boolean musica_existe = true;
        if (nome.equals("todas")) {
            for (int i = 0; i < nome_musica.length; i++) {
                System.out.println("Nome da música: " + nome_musica[i]);
                System.out.println("Nome do cantor: " + nome_cantor[i]);
                System.out.println("Duração: " + duracao[i]);
                if (favorito[i]) {
                    System.out.println("Favorita: [<3]");
                } else {
                    System.out.println("Favorita: []");
                }
            }
        } else {
            for (int i = 0; i < nome_musica.length; i++) {

                if (nome_musica[i].contains(nome)) {
                    System.out.println("\nNome da música: " + nome_musica[i]);
                    System.out.println("Nome do cantor: " + nome_cantor[i]);
                    System.out.println("Duração: " + duracao[i]);
                    musica_existe = false;
                    if (favorito[i]) {
                        System.out.println("Favorita: [<3]");
                    } else {
                        System.out.println("Favorita: []");
                    }
                    if (tipo[i] == 1) {
                        System.out.println("Tipo: Trap");
                    } else if (tipo[i] == 2) {
                        System.out.println("Tipo: Rock");
                    } else if (tipo[i] == 3) {
                        System.out.println("Tipo: Pop");
                    } else {

                    }
                }

            }
            if (musica_existe) {
                System.out.println("A musica que está procurando não existe ou não está em nosso catálogo!");
            }
        }

        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();
    }

    public static void PesquisarArtista() {
        System.out.println("Digite o nome do(a) artista: (Ou digite Todos para listar todos)");
        scanner.nextLine();
        String nome = scanner.nextLine().toLowerCase();
        boolean cantor_existe = true;

        if (nome.equals("todos")) {
            System.out.println("Esses são todos os artistas em nosso catálogo: ");
            for (int i = 0; i <= nome_musica.length; i++) {
                System.out.println("Nome do cantor: " + nome_cantor[i]);
                if (favorito[i]) {
                    System.out.println("Favorita: [<3]");
                } else {
                    System.out.println("Favorita: []");
                }
            }
        } else {
            System.out.println("Procurando musicas do cantor: " + nome);
            for (int i = 0; i < nome_cantor.length; i++) {
                if (nome_cantor[i].contains(nome)) {
                    System.out.println("\nNome da música: " + nome_musica[i]);
                    System.out.println("Duração: " + duracao[i]);
                    cantor_existe = false;
                    if (favorito[i]) {
                        System.out.println("Favorita: [<3]");
                    } else {
                        System.out.println("Favorita: []");
                    }
                    if (tipo[i] == 1) {
                        System.out.println("Tipo: Trap");
                    } else if (tipo[i] == 2) {
                        System.out.println("Tipo: Rock");
                    } else if (tipo[i] == 3) {
                        System.out.println("Tipo: Pop");
                    } else {

                    }

                }

            }
            if (cantor_existe) {
                System.out.println("O musico/cantor procurado está incorreto ou não está na nossa lista de artistas ;(");
            }
        }
        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();

    }

    public static void Estatísticas() {
        int indice = 10;
        System.out.println("Essas são as suas estatisticas até o momento: ");
        System.out.println("\nTempo ouvido: " + tempo_ouvido);
        System.out.println("Total de musicas ouvidas: " + total_de_musicas_ouvidas);
        for (int i = 0; i < qtd_repetições.length; i++) {
            int maior = 0;

            if (maior < qtd_repetições[i]) {
                maior = qtd_repetições[i];
                indice = i;
            }
        }
        if (indice != 10) {
            System.out.println("Musica mais ouvida: " + nome_musica[indice]);
        } else {
            System.out.println("Ainda não sabemos qual a sua musica favorita ;(");
        }

        if (genero_pop > genero_rock && genero_pop > genero_trap) {
            System.out.println("Gênero Favorito: Pop");
        } else if (genero_trap > genero_rock && genero_trap > genero_pop) {
            System.out.println("Gênero Favorito: Trap");
        } else if (genero_rock > genero_trap && genero_rock > genero_pop) {
            System.out.println("Gênero Favorito: Rock");
        } else {
            System.out.println("Desculpe ainda não conseguimos definir um gênero especifico para você.");
            System.out.println("Ouça mais músicas para termos mais informações sobre seus gostos!");
        }
        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void PlayList() {
        do {
            System.out.println("Esta é sua playlist!");
            int qtd_musicas_playlist = 0;
            double duracao_total = 0.00;
            for (int i = 0; i < playlist.length; i++) {
                if (playlist[i] != null) {
                    qtd_musicas_playlist++;
                    System.out.println("\nNome da musica: " + nome_musica[playlist[i]]);
                    System.out.println("Nome do autor: " + nome_cantor[playlist[i]]);
                    System.out.println("Duração da musica: " + duracao[playlist[i]]);
                    duracao_total = duracao_total + duracao[playlist[i]];
                    if (favorito[playlist[i]]) {
                        System.out.println("Favoritada: [<3]");
                    } else {
                        System.out.println("Favoritada: []");
                    }
                    System.out.println("Quantidade de vezes escutada: " + qtd_repetições[playlist[i]]);
                    if (tipo[playlist[i]] == 1) {
                        System.out.println("Tipo: Trap");
                    } else if (tipo[playlist[i]] == 2) {
                        System.out.println("Tipo: Rock");
                    } else if (tipo[playlist[i]] == 3) {
                        System.out.println("Tipo: Pop");
                    } else {

                    }
                }
            }
            System.out.println("Você tem o total de " + qtd_musicas_playlist + " músicas na playlist!");
            System.out.printf("\nEsse é o total de tempo da sua playlist: %.2f", duracao_total);
            System.out.println("\nSua playlist atualmente é está, deseja adicionar (1) ou retirar (2) alguma musica? (caso não queira alterar nada digite 3)");
            int escolha = scanner.nextInt();
            if (escolha == 1) {

                System.out.println("Escreva o nome da musica que você queira adicionar: ");
                scanner.nextLine();
                String musica = scanner.nextLine();

                boolean existe_na_playlist = false;
                boolean existe_na_biblioteca = false;
                int indice = 10;

                //Valida se a musica existe
                for (int i = 0; i < nome_musica.length; i++) {
                    if (nome_musica[i].contains(musica)) {
                        existe_na_biblioteca = true;
                        indice = i;
                    }
                }

                if (existe_na_biblioteca) {
                    //Valida se ja está na playlist
                    for (int i = 0; i < playlist.length; i++) {
                        if (playlist[i] != null) {
                            if (playlist[i] == indice) {
                                System.out.println("\nEssa musica ja está na sua playlist!");
                                existe_na_playlist = true;
                                break;
                            }
                        }
                    }

                    if (existe_na_playlist == false) {
                        //adicionar na playlist
                        for (int i = 0; i < playlist.length; i++) {
                            if (playlist[i] == null) {
                                playlist[i] = indice;
                                System.out.println("\nMúsica adicionada com sucesso!");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("A musica não existe ou não está em nossa biblioteca!");
                    System.out.println("Acesse a aba de pesquisa de musicas e selecione a opção todos para ver nossas opções.");
                }

            } else if (escolha == 2) {

                System.out.println("Escreva o nome da musica que você queira retirar: ");
                scanner.nextLine();
                String musica = scanner.nextLine();
                boolean existe_na_playlist = false;
                for (int i = 0; i < playlist.length; i++) {
                    if (playlist[i] != null) {
                        if (nome_musica[playlist[i]].contains(musica)) {
                            existe_na_playlist = true;
                            playlist[i] = null;
                            System.out.println("Musica retirada com sucesso!");
                            break;
                        }
                    }

                }
                if (!existe_na_playlist) {
                    System.out.println("O nome da música está incorreto ou a música não está em sua playlist!");
                }

            } else {
                break;
            }

            System.out.println("\nDeseja alterar algo mais na playlist? Sim(1) Não(2)");
            int resposta = scanner.nextInt();
            if (resposta == 1) {

            } else {
                break;
            }
        } while (true);
    }

    public static void Favoritas() {
        for (int i = 0; i < nome_musica.length; i++) {
            if (favorito[i]) {
                System.out.println("Nome da musica: " + nome_musica[i]);
                System.out.println("Nome do autor: " + nome_cantor[i]);
                System.out.println("Favoritada: [<3]");
            }
        }
        System.out.println("\nEssas são suas musicas favoritadas!");
        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();
    }

    public static void PesquisarGenero() {

        System.out.println("Escreva o nome do gênero musical (digite todos para ver todos os gêneros disponiveis)");
        scanner.nextLine();
        String nome = scanner.nextLine().toLowerCase();

        if (nome.equals("todos")) {
            System.out.println("Estes são todos os gêneros disponiveis:");
            System.out.println("1 - Trap");
            System.out.println("2 - Rock");
            System.out.println("3 - PoP");
        } else if (nome.equals("trap") || nome.equals("rock") || nome.equals("pop")) {
            System.out.println("Musicas do gênero: " + nome);
            for (int i = 0; i < nome_musica.length; i++) {
                if (tipo[i] == 1 && nome.equals("trap")) {
                    System.out.println("\nMusica: " + nome_musica[i]);
                    System.out.println("Cantor: " + nome_cantor[i]);
                } else if (tipo[i] == 2 && nome.equals("rock")) {
                    System.out.println("\nMusica: " + nome_musica[i]);
                    System.out.println("Cantor: " + nome_cantor[i]);
                } else if (tipo[i] == 3 && nome.equals("pop")) {
                    System.out.println("\nMusica: " + nome_musica[i]);
                    System.out.println("Cantor: " + nome_cantor[i]);
                }
            }
        } else {
            System.out.println("\nEste gênero musical não existe ou não está em nosso catálogo!");
        }

        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();
    }

    //tocar musica
    public static void TocarMusica() {
        System.out.println("Escolha a musica para tocar: ");
        String nome = scanner.nextLine();

        System.out.println("\nPressione enter para prosseguir ->");
        scanner.nextLine();
    }

}
