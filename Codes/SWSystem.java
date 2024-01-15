class SWSystem {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getConfiguration();
        configurationManager.addConfiguration();
        configurationManager.addSettings();
    }
}

class ConfigurationManager {
    private static ConfigurationManager configuration = new ConfigurationManager();
    private ConfigurationManager(){}
    public static ConfigurationManager getConfiguration(){
        return configuration;
    }

    public void addConfiguration(){
        System.out.println("Application Configured");
    }

    public void addSettings(){
        System.out.println("Settings added");
    }
}
