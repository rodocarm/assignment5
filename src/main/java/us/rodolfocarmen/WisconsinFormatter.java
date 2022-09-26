package us.rodolfocarmen;

public class WisconsinFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense.getSoundCodex();
        int FFFY = driversLicense.getFFF();
        int YYY = driversLicense.getYY()%100;
        int Y1 = YYY;
        int Y2 = YYY;
        int DDD = driversLicense.getDDD();
        int NN = driversLicense.getNN();

        return String.format("%s-%d%d-%d%03d-%02d", SSSS, FFFY, Y1, Y2, DDD,NN);
    }
}