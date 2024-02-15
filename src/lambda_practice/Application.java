package lambda_practice;

import java.util.SortedMap;

public class Application {
    public static void main(String[] args) {
        Human human = new Human();
        walker(human);

        Robot robot = new Robot();
        walker(robot);

        //before java 8
//        walker(new Walkable() {
//            @Override
//            public void walk() {
//                System.out.println("custom object walking");
//            }
//        });

        //after java 8 using lambda
        //annonymus
        walker(() -> System.out.println("Custom object walking.."));

        Walkable aBlockofCode = () -> {
            System.out.println("something");
            System.out.println("here");
        };
        walker(aBlockofCode);

        LambdaInterface helloVar = () -> System.out.println("Hello");
        helloVar.someMethod();

        Calculate sumVar = (a, b) -> a + b;
        System.out.println(sumVar.compute(4, 6));

        Calculate nonZeroVar = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(nonZeroVar.compute(7, 3));

        MyGenericInterface<String> reverseVar = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result = result + str.charAt(i);
            }
            return result;
        };
        System.out.println(reverseVar.work("Ioana"));

        NumberWorker factorialVar = (num) -> {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result = 1 * result;
            }
            return result;
        };
        System.out.println(factorialVar.compute(10));

        MyGenericInterface<Integer> factorialVar2 = (num) -> {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(factorialVar2.work(10));


    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = i * result;
        }
        return result;
    }

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public int nonZeroDevide(int a, int b) {
        if (a == 0) {
            return 0;
        }
        return a / b;
    }

    public static void walker(Walkable walkable) {
        walkable.walk();
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    interface Calculate {
        public int compute(int a, int b);
    }

    interface StringWorker {
        public String execute(String str);
    }

    interface NumberWorker {
        public int compute(int i);
    }

    interface MyGenericInterface<T> {
        public T work(T t);
    }
}
