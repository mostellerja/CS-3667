
public class DecrementHottubTemperature implements  Command{
	Hottub hottub;
	
	public DecrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}
	
	public void execute() {
        hottub.DecrementHottubTemperature();    
        System.out.println("Hottub temperature has been lowered by one degree.");
    }
	public void undo(){
        hottub.IncrementHottubTemperature();
        System.out.println("Hottub temperature has been raised by one degree.");
    }
	@Override
	public String display() {
		return this.getClass().getName();
	}


}
