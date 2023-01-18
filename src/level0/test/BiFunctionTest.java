package level0.test;

import java.util.function.BiFunction;

public class BiFunctionTest<V> {
    V merge(V value,
            BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        V returnValue = remappingFunction.apply(value, value);
        return returnValue;
    }

    public static void main(String[] args) {
        BiFunctionTest<Integer> bifunc = new BiFunctionTest<>();
        Integer merged = bifunc.merge(5, IntegerTest::summm);
        System.out.println(merged);
    }
}

class IntegerTest{
    public static int summm(int a, int b){
        return a + b;
    }
}
