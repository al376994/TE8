package TE8.Comandos;

import TE8.Receiver;

public class TurnRight implements Command {

	private Receiver reciver;
	private String param;

	public TurnRight(Receiver reciver, String param) {
		this.reciver = reciver;
		this.param = param;
	}

	@Override
	public void execute() {
		reciver.operation("girar", "derecha", param);
	}
}
