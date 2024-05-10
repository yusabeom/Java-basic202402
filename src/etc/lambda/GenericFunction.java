package etc.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    // x에서 y를 추출해 줄게
    Y apply(X x);

}
