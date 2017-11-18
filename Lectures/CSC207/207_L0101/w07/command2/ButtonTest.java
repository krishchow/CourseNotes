package command2;

public class ButtonTest {
	  public static void main(String[] args) {
	    SoundSystem soundSystem = new SoundSystem();
	    Button button = new Button();

	    // Create some commands
	    Command turnOnCommand = new TurnOnCommand(soundSystem);
	    Command turnOffCommand = new TurnOffCommand(soundSystem);
	    Command volumeUpCommand = new VolumeUpCommand(soundSystem);
	    Command volumeDownCommand = new VolumeDownCommand(soundSystem);

	    // Assign an action to the button
	    button.setCommand(turnOnCommand);
	    button.press();

	    // Change the button's action
	    button.setCommand(volumeUpCommand);
	    button.press();
	    button.press();
	    button.press();

	    button.setCommand(volumeDownCommand);
	    button.press();

	    // Turn off after usage to save electric energy!
	    button.setCommand(turnOffCommand);
	    button.press();
	  }
	}