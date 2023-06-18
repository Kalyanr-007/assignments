
    public class StaticDemo {
        static int staticVariable = 10;
        int instanceVariable = 20;

        static {
            System.out.println("Static block executed");
        }

        {
            System.out.println("Instance block executed");
        }

        public static void staticMethod() {
            System.out.println("Static method called");
        }

        public void instanceMethod() {
            System.out.println("Instance method called");
        }

        public static void main(String[] args) {
            StaticDemo.staticMethod();

            StaticDemo obj1 = new StaticDemo();
            System.out.println("Static variable value: " + StaticDemo.staticVariable);
            System.out.println("Instance variable value: " + obj1.instanceVariable);

            obj1.instanceMethod();

            StaticDemo obj2 = new StaticDemo();
            obj2.instanceVariable = 30;
            System.out.println("Static variable value: " + StaticDemo.staticVariable);
            System.out.println("Instance variable value: " + obj2.instanceVariable);

            obj2.instanceMethod();
        }
    }


