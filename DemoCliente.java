package TE8;

import TE8.Comandos.*;

public class DemoCliente {

	public static void main (String [ ] args) {
		Invoker botones = new Invoker();
		Receiver robot = new Receiver();
		Command adelante = new MoveForward(robot, "15");
		Command atras = new MoveBack(robot, "15");
		Command derecha = new TurnRight(robot, "90");
		Command izquierda = new TurnLeft(robot, "90");

		pulsarBoton(botones, adelante);
		pulsarBoton(botones, izquierda);
		pulsarBoton(botones, adelante);
		pulsarBoton(botones, adelante);
		pulsarBoton(botones, derecha);
	}

	private static void pulsarBoton(Invoker invoker, Command command) {
		invoker.setCommand(command);
		invoker.executeCommand();
	}
}
