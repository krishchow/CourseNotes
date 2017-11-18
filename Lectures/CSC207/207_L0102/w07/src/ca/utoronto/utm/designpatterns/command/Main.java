package ca.utoronto.utm.designpatterns.command;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		Balloon b1 = new Balloon("red", 100);
		Balloon b2 = new Balloon("green", 200);

		
		ArrayList<BalloonCommand> commands = new ArrayList<BalloonCommand>();
		commands.add(new InflateCommand(20));
		commands.add(new DeflateCommand(10));
		commands.add(new InflateCommand(20));
		commands.add(new InflateCommand(20));
		commands.add(new InflateCommand(20));
		commands.add(new InflateCommand(20));
		commands.add(new InflateCommand(20));
		commands.add(new InflateCommand(20));
		commands.add(new DeflateCommand(50));
		commands.add(new InflateCommand(20));
		
		// Now we can execute the sequence
		// Note: we have changed the CommandPattern so that the command sequence
		// can be executed on any balloon vs each command holds onto
		// the balloon it will execute on.
		
		System.out.println("Running commands on red balloon");
		executeCommands(commands, b1);
		System.out.println("Running commands on green balloon");
		executeCommands(commands, b2);
		System.out.println("Running commands again on green balloon");
		executeCommands(commands, b2);
	}
	public static void executeCommands(ArrayList<BalloonCommand> commands, Balloon balloon){
		for(BalloonCommand command:commands){
			command.execute(balloon);
			System.out.println(balloon); // added so you can see whats happening
		}
	}
}
