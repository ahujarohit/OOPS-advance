import java.lang.ref.Cleaner;
class GCTarget {
        private String name;            
        private Cleaner.Cleanable cleanable;
        private static final Cleaner cleaner = Cleaner.create();

        GCTarget(String name) {
            this.name = name;
            cleanable = cleaner.register(this, new CleanupTask(name));
        }

        static class CleanupTask implements Runnable {
            private final String name;

            CleanupTask(String name) {
                this.name = name;
            }

            @Override
            public void run() {
                System.out.println("Garbage Collector cleaned up object: " + name);
            }
        }

        public static void check() {
            GCTarget target3 = new GCTarget("Object-3");
            GCTarget target4 = new GCTarget("Object-4");
        }

        public static void makeNull(GCTarget obj) {
            obj = null;
        }

    }

class GCDemo {

    public static void main(String[] args) {
        // Create objects and register them with the cleaner
        GCTarget target1 = new GCTarget("Object-1");
        GCTarget target2 = new GCTarget("Object-2");

        // Dereference the objects to make them eligible for GC
        target1 = null;
        target2 = null;

        GCTarget.check();

        GCTarget target5 = new GCTarget("Object-5");
        GCTarget.makeNull(target5);

        GCTarget target6 = new GCTarget("Object-6");
        GCTarget target7 = new GCTarget("Object-7");
        GCTarget target8 = new GCTarget("Object-8");
        target6 = target7;
        target7 = target8;
        target8 = target6;
        target6 = null;
        
        // Suggest the JVM to run garbage collection
        System.gc();

        // Give the JVM some time to run GC
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
