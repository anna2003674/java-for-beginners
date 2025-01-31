package org.example.lambda_expressions;

@FunctionalInterface
interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImplementation implements Executable {
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation()); // 1 способ

        runner.run(new Executable() { // 2 способ
            @Override
            public void execute() {
                System.out.println("Hello");
            }
        });

        runner.run(() -> System.out.println("Hello")); // 3 способ
    }
}
