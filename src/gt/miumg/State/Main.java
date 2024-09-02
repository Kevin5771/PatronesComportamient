package gt.miumg.State;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gt.miumg.State.MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Bienvenido al reproductor de música.");
        System.out.println("Comandos disponibles: play, pause, stop, exit");

        do {
            System.out.print("Introduce un comando: ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "play":
                    player.play();
                    break;
                case "pause":
                    player.pause();
                    break;
                case "stop":
                    player.stop();
                    break;
                case "exit":
                    System.out.println("Saliendo del reproductor de música.");
                    break;
                default:
                    System.out.println("Comando no reconocido. Inténtalo de nuevo.");
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}