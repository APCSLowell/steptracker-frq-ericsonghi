import java.util.ArrayList;
public class StepTracker{
  private int minSteps;
  private int numActiveDays;
  private int numDays, totalSteps;
  
  
  public StepTracker(int minSteps){
    this.minSteps = minSteps;
    minSteps = 0;
    numActiveDays = 0;
    numDays = 0;
    totalSteps = 0;
  }
  
  public int activeDays(){
    return numActiveDays;
  }
  
  public double averageSteps(){
    if(numDays != 0){
    	return (double)(totalSteps)/(numDays);
    }else{
      return 0.0;
    } 
  }
  
  public void addDailySteps(int y){
    totalSteps += y;
    if(y >= minSteps){
      numActiveDays++;
    }
    numDays++;  
  }
} 
