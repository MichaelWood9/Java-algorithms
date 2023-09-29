package Question6a;

import java.util.concurrent.Semaphore;

class Rope implements Runnable{

    Semaphore semaphore = new Semaphore(1);//these are the semaphore permits


    public void run(){//the threads run this
        long random = (long)(Math.random()*10000);//comes up with a random number
        try {// this is the critical section
            semaphore.acquire();//trys to get permit
            System.out.println(Thread.currentThread().getName() + " is on the rope");//prints out which baboon is on the rope
            Thread.sleep(random);//sleeps random amount of time
            System.out.println(Thread.currentThread().getName()+" has crossed the rope");//prints out which baboon has crossed the rope
            semaphore.release();//releases a permit
        } catch (Exception e){//catches exception
            e.printStackTrace();
        }

    }

}

public class semaphore {//this is the semaphore
    public static void main(String[] args) {
        Rope rope = new Rope();//create new rope
        Thread baboon1 = new Thread(rope);//creates the thread
        Thread baboon2 = new Thread(rope);//creates the thread
        baboon1.setName("Westward moving baboon");//sets the thread name
        baboon2.setName("Eastwards moving baboon");//sets the thread name
        baboon1.start();//starts the thread
        baboon2.start();//starts the thread

    }
}
