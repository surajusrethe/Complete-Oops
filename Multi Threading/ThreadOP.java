

class UserThread extends Thread{

    public  void run()
    {

        //task for thread..
        System.out.println("This thread is defined by user");
    }
}

public class ThreadOP {

    public static void main(String[] args) {
        System.out.println("Program started..");
        int x = 56 + 34;
        System.out.println("Sum is " + x);
/// Getting Current Thread name
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current Thread is "+ tname);

        //Setting thread name

        t.setName("MyMain");
        System.out.println( "The New Name of the thread is" + t.getName());

        //this method throws interpretition error so we use try catch
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){};

        //Get ID of the thread
        System.out.println(t.getId());

        //Going to start USer Defined Thread
        UserThread thread = new UserThread();
        thread.start();

        System.out.println("Program Ended");
    }
}
