package HuffmanArchiever;

public enum Bit {
    ZERO("0"),
    ONE("1");

    private String bit;

    Bit(String bit) {
        this.bit = bit;
    }

    public String getBit() {
        return bit;
    }
}
