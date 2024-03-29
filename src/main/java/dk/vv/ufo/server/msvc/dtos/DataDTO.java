package dk.vv.ufo.server.msvc.dtos;

public class DataDTO {

    public String stringData;

    public int integerData;

    public float floatData;

    public boolean booleanData;


    public DataDTO() {
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public int getIntegerData() {
        return integerData;
    }

    public void setIntegerData(int integerData) {
        this.integerData = integerData;
    }

    public float getFloatData() {
        return floatData;
    }

    public void setFloatData(float floatData) {
        this.floatData = floatData;
    }

    public boolean isBooleanData() {
        return booleanData;
    }

    public void setBooleanData(boolean booleanData) {
        this.booleanData = booleanData;
    }
}
