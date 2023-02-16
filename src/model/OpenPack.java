package model;

public class OpenPack {
    public static Pack openPack(int tokenRequired){
        if(tokenRequired == 1)
            return new PackSilver();
        return new PackGold();
    }
}
