public class Main {
    public static void main(String[] args) {
        SettingsManager settingsManager = SettingsManager.getInstance();
        
        System.out.println("SettingValue: " + settingsManager.getSettingValue());
        
        settingsManager.setSettingValue("Custom Value");
        
        System.out.println("SettingValue: " + settingsManager.getSettingValue());
    }
}
