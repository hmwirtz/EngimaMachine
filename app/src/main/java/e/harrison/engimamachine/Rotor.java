package e.harrison.engimamachine;

/*
creates a rotor object that gets incremented by 1 with each letter hit, and by the setting value of the rotor.

 */

public class Rotor {
    private int rotorPosition = 0, total;


    public int initialPosition(int rotorSetting){

        this.total = rotorSetting + this.rotorPosition;
        return this.total;
    }

    public int updatePosition(int stringLength){
        int update;
        update = stringLength + this.total;
        return update;
    }



    }


