import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner readerScanner = new Scanner(System.in);

        char answerTvOn;

        int answerWhichChannel = 0;

        int channelMention4 = 0;
        int channelMention5 = 0;
        int channelMention7 = 0;
        int channelMention12 = 0;

        int numberpeopleWatchingChannel4 = 0;
        int numberpeopleWatchingChannel5 = 0;
        int numberpeopleWatchingChannel7 = 0;
        int numberpeopleWatchingChannel12 = 0;

        int finalTotalNumberPeopleWatchedChannel4 = 0;
        int finalTotalNumberPeopleWatchedChannel5 = 0;
        int finalTotalNumberPeopleWatchedChannel7 = 0;
        int finalTotalNumberPeopleWatchedChannel12 = 0;

        double averageAudienceCchannel4 = 0.0;
        double averageAudienceCchannel5 = 0.0;
        double averageAudienceCchannel7 = 0.0;
        double averageAudienceCchannel12 = 0.0;

        System.out.println("\nPesquisa sobre audiência de canal de TV realizada dia (tal)");

        do {
            do {
                System.out.print("A TV está ligada? [S / N]: ");
                answerTvOn = readerScanner.next().toUpperCase().charAt(0);

                while ((answerTvOn != 'S') && (answerTvOn != 'N')) {
                    System.out.print("--> Entrada inválida, informe somente [S / N]: ");
                    answerTvOn = readerScanner.next().toUpperCase().charAt(0);
                }

                switch (answerTvOn) {
                    case 'S':
                        do {
                            System.out.println("Informe em qual canal a TV está.");
                            System.out.println("\t[0]  - Para encerrar a pesquisa");
                            System.out.println("\t[4]  - Canal 4");
                            System.out.println("\t[5]  - Canal 5");
                            System.out.println("\t[7]  - Canal 7");
                            System.out.println("\t[12] - Canal 12");

                            System.out.print("Digite a sua opção: ");
                            answerWhichChannel = readerScanner.nextInt();

                            if ((answerWhichChannel != 0) && (answerWhichChannel != 4) && (answerWhichChannel != 5)
                                    && (answerWhichChannel != 7) && (answerWhichChannel != 12)) {
                                System.out.println("--> Opção invalida.");
                            }

                        } while ((answerWhichChannel != 0) && (answerWhichChannel != 4) && (answerWhichChannel != 5)
                                && (answerWhichChannel != 7) && (answerWhichChannel != 12));

                        switch (answerWhichChannel) {
                            case 0:
                                System.out.println("--> Pesquisa encerrada.");
                                break;

                            case 4:
                                System.out.printf(
                                        "Informe o número de pessoas que estão assistindo o canal [%d]: ",
                                        answerWhichChannel);
                                numberpeopleWatchingChannel4 = readerScanner.nextInt();
                                channelMention4 += 1;
                                finalTotalNumberPeopleWatchedChannel4 += numberpeopleWatchingChannel4;
                                System.out.println("--> Informação computada.");
                                break;

                            case 5:
                                System.out.printf(
                                        "Informe o número de pessoas que estão assistindo o canal [%d]: ",
                                        answerWhichChannel);
                                numberpeopleWatchingChannel5 = readerScanner.nextInt();
                                channelMention5 += 1;
                                finalTotalNumberPeopleWatchedChannel5 += numberpeopleWatchingChannel5;
                                System.out.println("--> Informação computada.");
                                break;

                            case 7:
                                System.out.printf(
                                        "Informe o número de pessoas que estão assistindo o canal [%d]: ",
                                        answerWhichChannel);
                                numberpeopleWatchingChannel7 = readerScanner.nextInt();
                                channelMention7 += 1;
                                finalTotalNumberPeopleWatchedChannel7 += numberpeopleWatchingChannel7;
                                System.out.println("--> Informação computada.");
                                break;

                            case 12:
                                System.out.printf(
                                        "Informe o número de pessoas que estão assistindo o canal [%d]: ",
                                        answerWhichChannel);
                                numberpeopleWatchingChannel12 = readerScanner.nextInt();
                                channelMention12 += 1;
                                finalTotalNumberPeopleWatchedChannel12 += numberpeopleWatchingChannel12;
                                System.out.println("--> Informação computada.");
                                break;

                            default:
                                break;
                        }
                        break;

                    default:
                        System.out.println("--> TV desligada não entra na pesquisa, verificar próxima TV.");
                        break;
                }

            } while (answerTvOn == 'N');
        } while (answerWhichChannel != 0);

        System.out.println("\nEXIBINDO DADOS");

        System.out.println("Canal: 4");
        if (channelMention4 == 0) {
            System.out.println("Este canal não foi mencionado.");
        } else {
            averageAudienceCchannel4 = finalTotalNumberPeopleWatchedChannel4 / channelMention4;
            System.out.printf("Média de audiência: %.2f%n", averageAudienceCchannel4);
        }

        System.out.println("\nCanal: 5");
        if (channelMention5 == 0) {
            System.out.println("Este canal não foi mencionado.");
        } else {
            averageAudienceCchannel5 = finalTotalNumberPeopleWatchedChannel5 / channelMention5;
            System.out.printf("Média de audiência: %.2f%n", averageAudienceCchannel5);
        }

        System.out.println("\nCanal: 7");
        if (channelMention7 == 0) {
            System.out.println("Este canal não foi mencionado.");
        } else {
            averageAudienceCchannel7 = finalTotalNumberPeopleWatchedChannel7 / channelMention7;
            System.out.printf("Média de audiência: %.2f%n", averageAudienceCchannel7);
        }

        System.out.println("\nCanal: 12");
        if (channelMention12 == 0) {
            System.out.println("Este canal não foi mencionado.");
        } else {
            averageAudienceCchannel12 = finalTotalNumberPeopleWatchedChannel12 / channelMention12;
            System.out.printf("Média de audiência: %.2f%n", averageAudienceCchannel12);
        }

        readerScanner.close();
    }
}
