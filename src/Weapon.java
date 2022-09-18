public class Weapon extends EnumWeaponType{
    protected Weapon() {
        super();
        this.setWeaponType(warWeapon);
    }
    private String weaponName;
    public String getWeaponType() {
        return warWeapon;
    }

    public void setWeaponType(String weaponType) {
        this.warWeapon = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }



}
