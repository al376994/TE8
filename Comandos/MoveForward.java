package TE8.Comandos;

import TE8.Receiver;

public class MoveForward implements Command{

	private Receiver reciver;
	private String param;

	public MoveForward(Receiver reciver, String param) {
		this.reciver = reciver;
		this.param = param;
	}

	@Override
	public void execute() {
		reciver.operation("mover", "delante", param);
	}
}
