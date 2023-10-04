package bandeau;

import java.util.concurrent.locks.ReentrantLock;

public class BandeauThread extends Thread{
    private Thread monThread;
    private Bandeau monBandeau;
    private Scenario monScenario;
    private Lock verrou = new ReentrantLock();
    public BandeauThread(Bandeau bandeau, Scenario scenario){

        this.monThread = new Thread();
        this.monBandeau =  bandeau;
        this.monScenario = scenario;
    }

    public void run(){
        monScenario.playOn(monBandeau);
    }


    public void playOn(Bandeau b){

    }

  
    


}