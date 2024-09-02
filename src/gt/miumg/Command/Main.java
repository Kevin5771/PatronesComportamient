package gt.miumg.Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Luz LucesHabitaciones = new Luz();
        Radio radio = new Radio();


        Scanner recolect = new Scanner(System.in);

        // Creación de comandos
        Comando LuzOn = new LuzOnComando(LucesHabitaciones);
        Comando LuzOff = new LuzOffComando(LucesHabitaciones);
        Comando RadioOn = new RadioOnComando(radio);
        Comando RadioOff = new RadioOffComando(radio);

        // Invoker
        ControlRemoto remoto = new ControlRemoto();


        System.out.println("Selecciona la Opcion");
        System.out.println("1. Apagar luz");
        System.out.println("2. Encender luz");
        String opcion = recolect.next();

        if (opcion.equals("1")) {
            // Encender la luz
            remoto.setCommand(LuzOn);
            remoto.pressButton();
        } else if (opcion.equals("2")){
            // Apagar la luz
            remoto.setCommand(LuzOff);
        remoto.pressButton();
    } else
            if(opcion.equals("3")){
            // Apagar la luz
            remoto.setCommand(RadioOn);
            remoto.pressButton();
}else
            if(opcion.equals("4")){
                // Apagar la luz
                remoto.setCommand(RadioOff);
                remoto.pressButton();
            }


    }
            }
