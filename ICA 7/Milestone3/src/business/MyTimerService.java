package business;

import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import java.util.logging.Logger;

@Stateless
public class MyTimerService {
	@Resource
	TimerService timerService;
	
	private static final Logger logger =  Logger.getLogger("business.MyTimerService");

	public void setTimer(long interval) {
		timerService.createTimer(interval,"My Timer");
	}
	
	@Timeout
	public void programmicTimer(Timer timer) {
		logger.info("Programmic Message");
	}
	
    public MyTimerService() {
        // TODO Auto-generated constructor stub
    }
	
	@SuppressWarnings("unused")
	@Schedule(second="*/10", minute="*", hour="0-23", dayOfWeek="Mon-Sun",
      dayOfMonth="*", month="*", year="*", info="MyTimer")
    private void scheduledTimeout(final Timer t) {
		logger.info("@Schedule called at: " + new java.util.Date());
        //System.out.println("@Schedule called at: " + new java.util.Date());
    }
}