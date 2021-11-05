package TE8;

import TE8.Comandos.Command;

public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}
}
