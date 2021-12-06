package OS2-router-semaphore;
class Device implements Runnable{
    private String name;
    private String type;
    private Router router;
    public Device(String type,String name,Router router) {
        this.name = name;
        this.type = type;
        this.router = router;
    }

    public void setRouter(Router router) {this.router = router;}

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

    public Router getRouter() {return router;}

    public void connect(){router.occupy();}
    public void performOnlineActivity(){sleep(5000);}
    public void logout(){router.release();}
    @Override

}