package org.geek_brains.ru;

public class Master {
    private static String nameM;
    private static int ageM;

    public static String getNameM() {
        return nameM;
    }

    public void setNameM(String nameM) {
        this.nameM = nameM;
    }

    public static int getAgeM() {
        return ageM;
    }

    public void setAgeM(int ageM) {
        this.ageM = ageM;
    }

    public Master(String nameM, int ageM){
        this.nameM = nameM;
        this.ageM = ageM;
    }




}
