class LegacySystem {
    public void processData(String data) {
        System.out.println("Processing data in a specific format: " + data);
    }
}

class ThirdPartyLibrary {
    public void processDataInNewFormat(String data) {
        System.out.println("Processing data in a different format: " + data);
    }
}

class DataAdapter extends LegacySystem {
    private ThirdPartyLibrary thirdPartyLibrary;

    public DataAdapter(ThirdPartyLibrary thirdPartyLibrary) {
        this.thirdPartyLibrary = thirdPartyLibrary;
    }

    @Override
    public void processData(String data) {
        String adaptedData = adaptData(data);
        thirdPartyLibrary.processDataInNewFormat(adaptedData);
    }

    private String adaptData(String data) {
        System.out.println("Adapting data from old format to new format.");
        return data;
    }
}

class OneTest 
{
    public static void main(String[] args) {
        LegacySystem legacySystem = new LegacySystem();
        ThirdPartyLibrary thirdPartyLibrary = new ThirdPartyLibrary();
        DataAdapter adapter = new DataAdapter(thirdPartyLibrary);

        legacySystem.processData("Legacy Data");
        adapter.processData("New Data");
    }
}
