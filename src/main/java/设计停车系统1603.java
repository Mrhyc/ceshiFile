/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 17:19
 */
public class 设计停车系统1603 {
    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        obj.addCar(1);
    }


}
class ParkingSystem{
    private int big;

    private int medium;

    private int small;

    public int getBig() {
        return big;
    }

    public void setBig(int big) {
        this.big = big;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        switch (carType){
            case 1:
                if(big>0){
                    big--;
                    return true;
                }
            case 2:
                if(medium>0){
                    medium--;
                    return true;
                }
            case 3:
                if(small>0){
                    small--;
                    return true;
                }
        }
        return false;
    }
}
