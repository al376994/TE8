package TE8.Comandos;

import TE8.Receiver;

public class TurnLeft implements Command{

	private Receiver reciver;
	private String param;

	public TurnLeft(Receiver reciver, String param) {
		this.reciver = reciver;
		this.param = param;
	}

	@Override
	public void execute() {
		reciver.operation("girar", "izquierda", param);
	}
}
