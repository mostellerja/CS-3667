public class NoCommand implements Command {
	public void execute() { }
	public void undo(){
            }

	@Override
	public String display() {
		return this.getClass().getName();
	}
}
