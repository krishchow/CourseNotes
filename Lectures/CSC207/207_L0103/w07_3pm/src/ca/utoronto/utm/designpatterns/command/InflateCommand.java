package ca.utoronto.utm.designpatterns.command;

public class InflateCommand implements BalloonCommand {
	private int amount=0;
	public InflateCommand(int amount){
		this.amount = amount;
	}
	@Override
	public void execute(Balloon balloon) {
		balloon.inflate(amount);		
	}
}
