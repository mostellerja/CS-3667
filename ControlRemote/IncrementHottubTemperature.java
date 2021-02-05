
public class IncrementHottubTemperature implements  Command{
	Hottub hottub;
	
	public IncrementHottubTemperature(Hottub hottub) {
		this.hottub = hottub;
	}
	
	public void execute() {
        hottub.IncrementHottubTemperature();    
        System.out.println("Hottub temperature has been raised by one degree.");
    }
	public void undo(){
        hottub.DecrementHottubTemperature();      
        System.out.println("Hottub temperature has been lowered by one degree.");
    }
	@Override
	public String display() {
		return this.getClass().getName();
	}
}
