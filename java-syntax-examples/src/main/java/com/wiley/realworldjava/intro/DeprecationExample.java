package com.wiley.realworldjava.intro;

public class DeprecationExample {
    /**
     * Returns a number
     *
     * @param num number
     * @return number based on num
     * @deprecated Use {@link #getNumber()} instead
     */
    @Deprecated(forRemoval = true)
    public int getNumber(int num) {
        return num % 2;
    }

    public int getNumber() {
        return 42;
    }
}
