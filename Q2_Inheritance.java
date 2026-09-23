public class Q2_Inheritance {

    // ── PREDICT: What does main() print for lines 1-4? ──
    //1: Falcon spinning
    //2: Falcon go brrr
    //3: Falcon
    //4: true

    static class Motor {
        String name() { return "Motor"; }
        void run() { System.out.println(name() + " spinning"); }
    }

    static class Falcon extends Motor {
        String name() { return "Falcon"; }
    }

    static class Kraken extends Falcon {
        void run() { System.out.println(name() + " go brrr"); }
    }

    public static void main(String[] args) {
        Motor m1 = new Falcon();
        System.out.print("1: "); m1.run();

        Motor m2 = new Kraken();
        System.out.print("2: "); m2.run();

        Falcon m3 = new Kraken();
        System.out.println("3: " + m3.name());

        Motor m4 = new Kraken();
        System.out.println("4: " + (m4 instanceof Falcon));

        // ── WRITE ──
        // Create a class "Neo" that extends Motor such that:
        //   - neo.name() returns "Neo"
        //   - neo.run() prints "Neo spinning at {rpm} RPM"
        //     where rpm is set via a constructor argument
        //   - neo.run() must call super.name() (not hardcode "Neo")
        //
        // Uncomment the test below when done.

         Neo n = new Neo(6000);
         System.out.print("5: "); n.run();  // should print: Neo spinning at 6000 RPM
         assert n.name().equals("Neo");
         assert n instanceof Motor;
         System.out.println("Neo ok");
    }
    public static class Neo extends Kraken {
        private int RPM = 0;
        public Neo (int a) {
            RPM = a;
        }
        String name() { return "Neo"; }
        public void run() {
            System.out.println(name() + " is spinning at " + this.RPM + " RPM");
        }
        

    // TODO: write the Neo class here
}
