import java.util.Random;


class observer{
    public  void update(int WaterLevel){
    }
}
class Alarm extends observer {
    String alarmId;

    public Alarm(String alarmId) {
        this.alarmId = alarmId;
    }

    public void update(int WaterLevel) {
        if (WaterLevel >= 50) {
            System.out.println("Alarm " + alarmId + " ON");
        } else {
            System.out.println("Alarm " + alarmId + " OFF");
        }
    }
}

class Display extends observer{
    public void update(int WaterLevel) {
        System.out.println("Water Level: " + WaterLevel);
    }
}

class SMSManager extends observer{
    public void update(int WaterLevel) {
        System.out.println("Send SMS :" + WaterLevel);
    }
}

class ControlPanel {
    private Alarm alarm;
    private Display display;
    private SMSManager smsManager;
    private int WaterLevel;

    public ControlPanel() {
    }

    public ControlPanel(Alarm alarm, Display display, SMSManager smsManager, int waterLevel) {
        this.alarm = alarm;
        this.display = display;
        this.smsManager = smsManager;
        WaterLevel = waterLevel;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public SMSManager getSmsManager() {
        return smsManager;
    }

    public void setSmsManager(SMSManager smsManager) {
        this.smsManager = smsManager;
    }

    public int getWaterLevel() {
        return WaterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        WaterLevel = waterLevel;
    }

    public void notifyObject() {
        this.alarm.update(WaterLevel);
        this.smsManager.update(WaterLevel);
        this.display.update(WaterLevel);
    }

    public void update(int waterLevel) {
        if (this.WaterLevel != waterLevel) {
            this.WaterLevel=waterLevel;
            notifyObject();
        }
    }
}

class java {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setAlarm(new Alarm("Alarm1"));
        controlPanel.setDisplay(new Display());
        controlPanel.setSmsManager(new SMSManager());
        while (true){
            Random random= new Random();
            int randomNumber= random.nextInt(101);//between 1 to 100 numbers
            controlPanel.update(randomNumber);
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("==============");
        }
    }
}
