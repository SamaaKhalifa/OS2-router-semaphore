package OS2-router-semaphore;
class Device implements Runnable{
    private String name;
    private String type;

    public Device(String type,String name) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void connect(){}
    public void performOnlineActivity(){}
    public void logout(){}
}