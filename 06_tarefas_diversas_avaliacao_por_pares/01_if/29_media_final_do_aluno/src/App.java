import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner readerScanner = new Scanner(System.in);

        double percentageOfClassesTaught = 0.0;
        double numberOfAbsences = 0.0;
        double averageFinal = 0.0;
        double firstGrade = 0.0;
        double secondGrade = 0.0;
        double thirdGrade = 0.0;

        int numberOfClassesTaught = 0;
        int totalGrades = 3;

        boolean rejectedForAbsences = false;

        String situation = "";

        System.out.println("\nEntre com os dados abaixo solicitados");

        do {
            System.out.print("Digite a primeira nota: ");
            firstGrade = readerScanner.nextDouble();

            while (firstGrade < 0) {
                System.out.print("Digite um valor positivo para a primeira nota: ");
                firstGrade = readerScanner.nextDouble();
            }
        } while (firstGrade < 0);

        do {
            System.out.print("Digite a segunda  nota: ");
            secondGrade = readerScanner.nextDouble();

            while (secondGrade < 0) {
                System.out.print("Digite um valor positivo para a segunda nota: ");
                secondGrade = readerScanner.nextDouble();
            }
        } while (secondGrade < 0);

        do {
            System.out.print("Digite a terceira nota: ");
            thirdGrade = readerScanner.nextDouble();

            while (thirdGrade < 0) {
                System.out.print("Digite um valor positivo para a terceira nota: ");
                thirdGrade = readerScanner.nextDouble();
            }
        } while (thirdGrade < 0);

        do {
            System.out.print("Digite o número de aulas ministradas: ");
            numberOfClassesTaught = readerScanner.nextInt();

            while (numberOfClassesTaught < 0) {
                System.out.print("Digite um valor positivo para as aulas ministradas: ");
                numberOfClassesTaught = readerScanner.nextInt();
            }
        } while (numberOfClassesTaught < 0);

        do {
            System.out.print("Digite o número de faltas do aluno: ");
            numberOfAbsences = readerScanner.nextDouble();

            while ((numberOfAbsences < 0) || (numberOfAbsences > numberOfClassesTaught)) {
                System.out.print(
                        "Número de faltas do aluno não pode ser negativa e nem poder ser maior que o número de aulas ministras: ");
                numberOfAbsences = readerScanner.nextDouble();
            }
        } while ((numberOfAbsences < 0) || (numberOfAbsences > numberOfClassesTaught));

        averageFinal = (firstGrade + secondGrade + thirdGrade) / totalGrades;
        percentageOfClassesTaught = (double) numberOfClassesTaught / 100 * 25;

        if (numberOfAbsences > percentageOfClassesTaught) {
            rejectedForAbsences = true;
        }

        if (rejectedForAbsences) {
            situation = "Reprovado por falta";

        } else {
            if (averageFinal < 3.0) {
                situation = "Reprovado por média baixa";

            } else if (averageFinal < 7.0) {
                situation = "Exame";

            } else {
                situation = "Aprovado";
            }
        }

        System.out.println("\nExibindo dados");
        System.out.printf("Primeira nota: %.2f%n", firstGrade);
        System.out.printf("Segunda nota: %.2f%n", secondGrade);
        System.out.printf("Terceira nota: %.2f%n", thirdGrade);
        System.out.printf("Porcentagem de aulas ministradas: %.2f%n", percentageOfClassesTaught);
        System.out.printf("Número de faltas: %d%n", (int)numberOfAbsences);
        System.out.printf("Reprovado por falta: %b%n", rejectedForAbsences);
        System.out.printf("Situação do aluno: %s%n", situation);

        readerScanner.close();
    }
}