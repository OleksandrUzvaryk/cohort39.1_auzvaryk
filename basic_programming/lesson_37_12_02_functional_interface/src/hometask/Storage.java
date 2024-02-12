package hometask;

public class Storage <T>{
  private T name;
    private T price;
   private T isExclusive;

    public Storage(T name, T price, T isExclusive) {
        this.name = name;
        this.price = price;
        this.isExclusive = isExclusive;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "name=" + name +
                ", price=" + price +
                ", isExclusive=" + isExclusive +
                '}';
    }
}
