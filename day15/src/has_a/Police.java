package has_a;

public class Police {
    private Gun gun;
    private String name;
    private int height;

    public Police(Gun gun, String name, int height){
        this.gun = gun;
        this.name = name;
        this.height = height;
    }

    public void shoot(){
        gun.shoot();
    }

    public void reload(){
        gun.reload();
    }
    public void showStatus(){
        System.out.println("소유 총기 :"+gun);
        System.out.println("이름 : "+name);
        System.out.println("키 : "+height);
    }
}
