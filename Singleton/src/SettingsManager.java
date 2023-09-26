public class SettingsManager {
    private static SettingsManager instance;
    
    private String settingValue;
    
    private SettingsManager() {
        // Asetetaan oletusarvo
        settingValue = "Default";
    }
    
    public static SettingsManager getInstance() {
        if (instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }
    
    public String getSettingValue() {
        return settingValue;
    }
    
    public void setSettingValue(String value) {
        this.settingValue = value;
    }
}
