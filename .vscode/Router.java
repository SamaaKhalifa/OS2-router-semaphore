import java.util.ArrayList;

public class Router {
    
    ArrayList<String> connections ;

    int NumOfConnections;
    semaphore spaces = new  semaphore();
    semaphore elements =new semaphore();

    public int getNumOfConnections() {
        return NumOfConnections;
    }
    public void setNumOfConnections(int numOfConnections) {
        NumOfConnections = numOfConnections;
    }


    public void occupy(){

        spaces.P();

        // occupy
        elements.V();


    }
    public void release(){
        spaces.P();
        //release
        elements.V();


        
    }

}
