package commandPattern2;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		// TODO Auto-generated constructor stub
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for(int i=0; i<7; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		// TODO Auto-generated method stub
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	public void offButtonWasPushed(int slot) {
		// TODO Auto-generated method stub
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n-----Remote Control-----\n");
		for(int i=0; i<onCommands.length; i++){
			stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName());
		}
		return stringBuffer.toString();
	}
	public void undoButtonWasPushed() {
		// TODO Auto-generated method stub
		undoCommand.undo();
	}
}
