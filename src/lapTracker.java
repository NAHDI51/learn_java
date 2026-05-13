public class LapTracker{
    int resetCount =0;
    int totalLaps =0;
    // Write constructor
    LapTracker(int laps) {
        this.totalLaps = laps;
    }
    public int addLaps(int laps) {
        if(laps>0){
            this.totalLaps+=laps;
            this.resetCount+=1;
        }if(this.resetCount>=3){
            this.resetCount=0;
            this.totalLaps =0;
        }
        return totalLaps;
    }
}