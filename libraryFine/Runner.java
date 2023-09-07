package LibraryFine;

import domain.enums.Option;

import java.util.Scanner;

public class Runner {
    private static Scanner sc = new Scanner(System.in);

    public static void runProgram() {

        Option option = null;

        looping:
        while (true) {

            printMenu();
            System.out.println("Sua escolha: ");

            try {
                option = readOption();

                switch (option) {
                    case CREATE:
                        //Cria cliente
                        break;
                    case READ:
                        //Busca cliente ou clientes no DB
                        break;
                    case UPDATE:
                        //Atualiza cliente
                        break;
                    case DELETE:
                        //Deleta cliente do DB
                        break;
                    case SAIR:
                        break looping;
                    default:
                        throw new RuntimeException("Opção inválida!");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    private static void printMenu() {
        for (Option option : Option.getOptions()) {
            int id = option.getId();
            System.out.println(id + " - " + option);
        }
    }


    private static Option readOption() {
        return Option.getOption(Integer.parseInt(sc.next()));
    }

}
