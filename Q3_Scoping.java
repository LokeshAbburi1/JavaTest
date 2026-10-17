public class Q3_Scoping {

    // ── PREDICT: What does main() print for lines 1-4? ──

    static int count = 0;
    int id;

    Q3_Scoping() { id = ++count; }
    static void reset() { count = 0; }

    public static void main(String[] args) {
        Q3_Scoping a = new Q3_Scoping();
        Q3_Scoping b = new Q3_Scoping();
        System.out.println("1: " + a.id + " " + b.id);

        reset();
        Q3_Scoping c = new Q3_Scoping();
        System.out.println("2: " + c.id + " " + count);

        int x = 10;
        for (int i = 0; i < 3; i++) {
            int x2 = x + i;
            x = x2;
        }
        System.out.println("3: " + x);
        // Q: does "x2" exist here? (yes/no, and why)
        no, x2's scope is limited to the for loop
        int val = 5;
        System.out.println("4: " + val + " " + a.count);
        // Q: why does a.count compile? is this good practice?
        /* a.count compiles because the count variable's scope is within the class. This is not good practice because 
             you would want to create a getter method */
        // ── WRITE ──
        // Create a class Counter with:
        //   - a static int "total" tracking how many Counters have been created
        //   - an instance String "label"
        //   - a constructor Counter(String label)
        //   - a method String toString() that returns "label (#id)" where id
        //     is the 1-based creation order (first Counter is #1, second is #2, etc.)
        //
        // Uncomment when done:
        

                    
        // Counter c1 = new Counter("left");
        // Counter c2 = new Counter("right");
        // System.out.println("5: " + c1);   // left (#1)
        // System.out.println("6: " + c2);   // right (#2)
        // assert Counter.total == 2;
        // System.out.println("Counter ok");
    }

    // TODO: write Counter here
    public static class Counter
            {
                private static total = 0;
                private label;
                private id;
                public Counter(String label)
                    {
                        total +=1;
                        id = total;
                        this.label = label;
                }
                public String toString()
                    {
                        return label + " #" + id;
                    }
}
}
