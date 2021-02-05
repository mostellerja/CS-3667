public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
        public void undo(){
            hottub.cool();
            hottub.off();
        }
	@Override
	public String display() {
		return this.getClass().getName();
	}

}
