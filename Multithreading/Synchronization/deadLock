public class deadLock {
    public static void main(String[] args) {
        String One = "String1";
        String Two = "String2";
        String three = "String3";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (One) {
                    System.out.println("Thread 1: locked One");

                    try { Thread.sleep(400);} catch (Exception e) {}

                    synchronized (Two) {
                        System.out.println("Thread 1: locked Two");
                    }
                    synchronized (three) {
                        System.out.println("Thread 1: locked Three");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (Two) {
                    System.out.println("Thread 2: locked Two");

                    try { Thread.sleep(400);} catch (Exception e) {}

                    synchronized (three) {
                        System.out.println("Thread 2: locked three");
                    }
                    synchronized (One) {
                        System.out.println("Thread 2: locked One");
                    }

                }
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                synchronized (three) {
                    System.out.println("Thread 3: locked Three");

                    try { Thread.sleep(400);} catch (Exception e) {}

                    synchronized (Two) {
                        System.out.println("Thread 3: locked two");
                    }
                    synchronized (One) {
                        System.out.println("Thread 3: locked One");
                    }
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}
