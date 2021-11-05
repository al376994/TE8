package TE8.Comandos;

import TE8.Receiver;

public class MoveBack implements Command{

	private Receiver reciver;
	private String param;

	public MoveBack(Receiver reciver, String param) {
		this.reciver = reciver;
		this.param = param;
	}

	@Override
	public void execute() {
		reciver.operation("mover", "atras", param);
	}
}
