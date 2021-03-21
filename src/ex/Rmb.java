package ex;

/**
 * @author zhuhe
 */
public class Rmb extends Number {
    private int value;

    @Override
    public int intValue() {
        return value / 100;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return value * 1.0f / 100;
    }

    @Override
    public double doubleValue() {
        return floatValue();
    }


    @Override
    public String toString() {
        return "¥ " + value / 100 + "." + value % 100;
    }
}
