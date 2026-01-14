
public class Painter {

    int xLocation;
    int yLocation;
    String direction;
    int remainingPaint;

    public Painter() {
        this.xLocation = 0;
        this.yLocation = 0;
        this.remainingPaint = 0;
        this.direction = "East";
    }

    /*
        OVERLOADS
     */
    public Painter(int xLocation, int yLocation, String direction, int remainingPaint) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
        this.remainingPaint = remainingPaint;
    }
    // declare
    public void move() {
        /*
            right: East, left: West
            Top: north, bottom: south
         */
        if(this.direction.equals("East")) {
            this.xLocation++;
        } else if(this.direction.equals("West")) {
            this.xLocation--;
        } else if(this.direction.equals("South")) {
            this.yLocation++;
        } else if(this.direction.equals("North")){
            this.yLocation--;
        }
    }

}
