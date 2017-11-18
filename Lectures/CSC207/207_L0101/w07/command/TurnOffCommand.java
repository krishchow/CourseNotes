package command;

public class TurnOffCommand implements Command {

	Light light;
	
	public TurnOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.switchOff();
	}

	
}
