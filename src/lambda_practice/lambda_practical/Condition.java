package lambda_practice.lambda_practical;

@FunctionalInterface
public interface Condition<T> {
    public boolean test(T c);
}
