public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(300,200);
        boss.weaponType.setWeaponType("Paintball gun");
        boss.weaponType.setWeaponName("AK-47");
        System.out.println(boss.info());
        Skeleton skeleton = new Skeleton(300,200,33);
        skeleton.weaponType.setWeaponType("Paintball gun");
        skeleton.weaponType.setWeaponName("AWM");
        System.out.println(skeleton.info());
        Skeleton skeleton2 = new Skeleton(400, 300,44);
        skeleton2.weaponType.setWeaponType("Paintball gun");
        skeleton2.weaponType.setWeaponName("AK");
        System.out.println(skeleton2.info());
}
}