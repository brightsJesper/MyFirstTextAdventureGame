package src;

public class Main {

    public static void main(String[] args) {
        Vault.setHere();
        System.out.println(Vault.getRooms().toString());
        System.out.println(Vault.getRooms().size());
        //Game.game();
        Vault.roomArchive();
        Vault.getRooms();
    }
/*
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(Parser.strDivider((input)));

    */



        }
