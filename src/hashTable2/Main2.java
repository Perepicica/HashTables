package hashTable2;

public class Main2 {
    public static void main(String[] args) {
        Table2 table2 = new Table2(4);
        table2.put("R","Р");
        table2.put("X11","икс");
        table2.prn();
        System.out.println(table2.put("X22","Рo"));
        System.out.println(table2.put("X33","Рo"));
        table2.prn();
        System.out.println(table2.put("l",""));

    }
}