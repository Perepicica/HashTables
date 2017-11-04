package hashTable1;

import java.util.ArrayList;

public class Table1 {
    ArrayList<Pair1> table[];

    Table1(int size) {
        table = new ArrayList[size];
    }

    public String put(String key, String value) {
        String oldValue = null;
        int hash = hashCoode(key);
        Pair1 pair1 = new Pair1(key, value);
        if (table[hash] == null) table[hash] = new ArrayList<>();
        else {
            for (Pair1 p : table[hash]) {
                if (p.getKey() == key) {
                    oldValue = p.getValue();
                    p.setValue(value);
                }
            }
        }
        if (oldValue == null) table[hash].add(pair1);
        return oldValue;
    }

    public String get(String key) {
        int hash = hashCoode(key);
        if (table[hash] != null) {
            for (Pair1 p : table[hash]) {
                if (p.getKey() == key) return p.getValue();
            }
        }
        return null;
    }

    public String remove(String key) {
        String val=null;
        int hash = hashCoode(key);
        if (table[hash] != null) {
            for (int i = 0; i < table[hash].size(); i++) {
                if (table[hash].get(i).getKey() == key) {
                    val=table[hash].get(i).getValue();
                    table[hash].remove(i);
                }
            }
        }return val;
    }

    public int hashCoode(String key) {
        int hash = key.length() % table.length;
        return hash;
    }

    public void prn() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                int hash = hashCoode(table[i].get(0).getKey());
                System.out.print(hash + " [" + i + "]");
                for (Pair1 p : table[hash]) {
                    System.out.print(p.getKey() + "->" + p.getValue() + "  ");
                }
            } else System.out.print(i + " [" + i + "]" + " null");
            System.out.println();
        }
        System.out.println("__________________________");
    }
}
