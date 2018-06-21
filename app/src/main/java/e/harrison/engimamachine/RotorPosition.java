package e.harrison.engimamachine;

/**
 * Created by Harrison on 6/19/2018.
 */

public class RotorPosition {
    int position = 0, setting;


    public int initialPosition(int setting){
        int total;
        total = setting + this.position;
        return total;
    }


    public int updatePosition(int position){
        position = this.position;
        return position++;
    }
}
