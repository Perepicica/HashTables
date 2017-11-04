package hashTable2;

public class Table2 {
    Pair2 table2[];
    int count = 0;

    Table2() {
        table2 = new Pair2[3];
    }

    Table2(int size) {
        table2 = new Pair2[size];
    }

    public String put(String key, String value) {
        if (count == table2.length) return "таблица заполненна";
            String oldValue = null;
        int hash = hashCoode(key);
        for (int i = hash; i < table2.length; i = (i + 1) % table2.length) {
            if (table2[i] == null) {
                Pair2 pair2 = new Pair2(key, value);
                table2[i] = pair2;
                count++;
                break;
            } else if (!table2[i].isFree()) {
                table2[i].setKey(key);
                table2[i].setValue(value);
                break;
            } else {
                if (table2[i].getKey() == key) {
                    oldValue = table2[i].getValue();
                    table2[i].setValue(value);
                    break;
                }
            }

        }
        return oldValue;
    }


    public String get(String key) {
        String val = null;
        int hash = hashCoode(key);
        if (table2[hash] == null) return null;
        for (int i = hash; i < table2.length; i = (i + 1) % table2.length) {
            if (table2[i] != null && table2[i].getKey() == key) {
                val = table2[i].getValue();
                break;
            }
        }

        return val;
    }

    public String remove(String key) {
        String val = null;
        int hash = hashCoode(key);
        for (int i = 0; i < table2.length; i = (i + 1) % table2.length) {
            if (table2[i] != null && table2[i].getKey() == key) {
                val = table2[i].getValue();
                table2[i].setFree(false);
                break;
            }
        }
        return val;
    }

    public int hashCoode(String key) {
        int hash = Math.abs(key.length()) % table2.length;
        return hash;
    }

    public void prn() {
        for (int i = 0; i < table2.length; i++) {
            if (table2[i] != null) {
                int hash = hashCoode(table2[i].getKey());
                System.out.print(hash + " [" + i + "]" + table2[i].getKey() + "->" + table2[i].getValue() + "  ");
            } else System.out.print(i + " [" + i + "]" + " null");
            System.out.println();
        }
        System.out.println("_________________");
    }
}
