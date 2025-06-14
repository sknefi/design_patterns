package command;

// one of the most common DP used in programming, that is basicly
// "click something and something happens", we can also undo it
// or queue it in queue data structure (Q)
public class TestCommand {
	public static void	test()
	{
		Light			l1 = new Light();
		Light			l2 = new Light();

		LightOnCommand 	lightOnCmd  = new LightOnCommand(l1);
		LightOffCommand	lightOffCmd = new LightOffCommand(l2);

		RemoteControllerCommand remoteController = new RemoteControllerCommand();
		remoteController.addCmd(lightOffCmd);
		remoteController.addCmd(lightOnCmd);
		
		System.out.println("Executing commands");
		remoteController.execCmds();

		System.out.println("\nUndoing commands");
		remoteController.undoCmds();
	}
}
