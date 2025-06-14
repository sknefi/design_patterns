package command;

import java.util.*;

public class RemoteControllerCommand {
	List<Command> cmdQ = new ArrayList<>();

	public void	addCmd(Command cmd)
	{
		cmdQ.add(cmd);
	}

	public void	execCmds()
	{
		for (Command cmd : cmdQ) {
			cmd.execute();
			cmd.show();
		}
	}

	public void	undoCmds()
	{
		for (Command cmd : cmdQ) {
			cmd.undo();
			cmd.show();
		}
	}



}
