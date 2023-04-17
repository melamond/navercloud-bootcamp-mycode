package has_a;

public class Gun {
    private int bullet;
    private String modelName;
    private String gunNumber;

    public Gun (String modelName, String gunNumber){
        this.bullet = 5;
        this.gunNumber = gunNumber;
        this.modelName = modelName;
    }

    public void shoot(){
        if(bullet > 0){
            bullet --;
            System.out.println("총을 쐈습니다.");
        }else {
            System.out.println("총알이 없어서 쏠 수 없습니다.");
        }
    }
    public void reload(){
        this.bullet = 5;
    }
}
