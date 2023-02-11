package src;

public class Room {
    private String rCode;
   private String name;
   private String desc;

    public void setrCode(String rCode) {
        this.rCode = rCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getrCode() {
        return rCode;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Room(String name, String desc) {
        this.rCode = rCode;
        this.name = name;
        this.desc = desc;
    }
}
