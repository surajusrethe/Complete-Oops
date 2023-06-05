 class MyThread implements  Runnable {

     //We define task to perform by thread under the runnable method
     @Override
     public void run() {

         //task for thread..
         for (int i = 0; i < 10; i++) {
             System.out.println("Value is of i is " + i);
             try {
                 Thread.sleep(1000);
             } catch (Exception e) {
             }
         }
     }

     public static void main(String[] args) {
         MyThread t1 = new MyThread();
         Thread thr = new Thread(t1);
         thr.start();
     }
 }
