package e.harrison.engimamachine;

/*
 creates a setting object that stays constant through every usage, unless changed.
 */

public class RotorSetting {

    String setting;

    public RotorSetting(){
        String setting = this.setting;
    }

    public int getSetting(String setting){
        int Setting;
        Setting = Integer.parseInt(setting);

        return Setting;
    }

    public int incrementSetting(String setting){
        int updatedSetting;
        updatedSetting = Integer.parseInt(setting);
        return updatedSetting++;
    }
}
