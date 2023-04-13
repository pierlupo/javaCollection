package org.example.stream.exoStream;

public class Transaction  {
    private final Trader trader;
    private final int year;
    private final Integer value;

    public Transaction(Trader trader, int year, Integer value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }


    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
