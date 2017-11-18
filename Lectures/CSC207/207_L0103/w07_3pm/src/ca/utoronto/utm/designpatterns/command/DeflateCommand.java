package ca.utoronto.utm.designpatterns.command;

public class DeflateCommand implements BalloonCommand {
	private int amount=0;
	public DeflateCommand(int amount){
		this.amount = amount;
	}
	@Override
	public void execute(Balloon balloon) {
		balloon.deflate(amount);		
	}
}
