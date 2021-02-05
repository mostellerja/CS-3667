
  
public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;
   
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
        	view.createView();
        	view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}
  
	public void start() {
		setBPM(90);
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	public void increaseBPM() {
		int bpm = model.getBPM();
        	model.setBPM(bpm + 1);
	}
    
	public void decreaseBPM() {
        int bpm = model.getBPM();
        if ((bpm - 1) <= 0) {
            model.setBPM(0);
            stop();
        } else {
            model.setBPM(bpm - 1);
        }
    }
    
    public void increaseBPM10() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 10);
    }
    
    public void decreaseBPM10() {
        int bpm = model.getBPM();
        if ((bpm - 10) <= 0) {
            model.setBPM(0);
            stop();
        } else {
            model.setBPM(bpm - 10);
        }
    }
    
    public void setBPM(int bpm) {
        if (bpm <= 0) {
            model.setBPM(0);
            stop();
        } else {
            model.setBPM(bpm);
        }
    }
}