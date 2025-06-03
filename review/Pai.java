public class Pai {
    private String paiName;
    private Integer key;

    public Pai(String paiName, Integer key) {
        this.paiName = paiName;
        this.key = key;
    }

    @Override
    public String toString() {
        return paiName;
    }

    public Integer getKey() {
        return key;
    }

    public String getPaiName() {
        return paiName;
    }

}
