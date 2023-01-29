package src;

public class Room {
    private int rCode;
   private String name;
   private String desc;

    public void setrCode(int rCode) {
        this.rCode = rCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getrCode() {
        return rCode;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Room(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
