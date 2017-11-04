package hashTable2;

public class Pair2 {

    private String key;
    private String value;
    private boolean Free=true;

    public boolean isFree() {
        return Free;
    }

    public void setFree(boolean free) {
        Free = free;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Pair2(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
