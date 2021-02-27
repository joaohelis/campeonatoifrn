package jobs;

import models.Time;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job{
	
	@Override
	public void doJob() throws Exception {
		
		if(Time.count() == 0) {
			
			Time time1 = new Time("Cortinthians");
			time1.save();
			
			Time time2 = new Time("São Paulo");
			time2.save();
			
			Time time3 = new Time("Flamengo");
			time3.save();
			
		}						
	}
}