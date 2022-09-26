package us.rodolfocarmen;

public class FloridaFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSoundCodex();
        int FFF = driversLicense.getFFF();
        int YY = driversLicense.getYY();
        int DDD = driversLicense.getDDD();
        int NN = driversLicense.getNN();
        return SSSS + "-" + FFF + "-" + YY + "-" + DDD + "-" + NN;
    }
}