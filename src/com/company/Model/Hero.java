package com.company.Model;

public abstract class Hero {
    private String characterName;
    private String characterInfo;
    private String characterWeapon;
    private String eAbilityInfo;
    private String shiftAbilityInfo;
    private String rightClickAbilityInfo;
    private String qAbilityInfo;
    private String characterTips;

    public Hero(String characterName, String characterInfo, String characterWeapon, String eAbilityInfo, String shiftAbilityInfo, String rightClickAbilityInfo, String qAbilityInfo, String characterTips) {
        this.characterName = characterName;
        this.characterInfo = characterInfo;
        this.characterWeapon = characterWeapon;
        this.eAbilityInfo = eAbilityInfo;
        this.shiftAbilityInfo = shiftAbilityInfo;
        this.rightClickAbilityInfo = rightClickAbilityInfo;
        this.qAbilityInfo = qAbilityInfo;
        this.characterTips = characterTips;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterInfo() {
        return characterInfo;
    }

    public void setCharacterInfo(String characterInfo) {
        this.characterInfo = characterInfo;
    }

    public String getCharacterWeapon() {
        return characterWeapon;
    }

    public void setCharacterWeapon(String characterWeapon) {
        this.characterWeapon = characterWeapon;
    }

    public String geteAbilityInfo() {
        return eAbilityInfo;
    }

    public void seteAbilityInfo(String eAbilityInfo) {
        this.eAbilityInfo = eAbilityInfo;
    }

    public String getShiftAbilityInfo() {
        return shiftAbilityInfo;
    }

    public void setShiftAbilityInfo(String shiftAbilityInfo) {
        this.shiftAbilityInfo = shiftAbilityInfo;
    }

    public String getRightClickAbilityInfo() {
        return rightClickAbilityInfo;
    }

    public void setRightClickAbilityInfo(String rightClickAbilityInfo) {
        this.rightClickAbilityInfo = rightClickAbilityInfo;
    }

    public String getqAbilityInfo() {
        return qAbilityInfo;
    }

    public void setqAbilityInfo(String qAbilityInfo) {
        this.qAbilityInfo = qAbilityInfo;
    }

    public String getCharacterTips() {
        return characterTips;
    }

    public void setCharacterTips(String characterTips) {
        this.characterTips = characterTips;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "characterName='" + characterName + '\'' +
                ", characterInfo='" + characterInfo + '\'' +
                ", characterWeapon='" + characterWeapon + '\'' +
                ", eAbilityInfo='" + eAbilityInfo + '\'' +
                ", shiftAbilityInfo='" + shiftAbilityInfo + '\'' +
                ", rightClickAbilityInfo='" + rightClickAbilityInfo + '\'' +
                ", qAbilityInfo='" + qAbilityInfo + '\'' +
                ", characterTips='" + characterTips + '\'' +
                '}';
    }
}
