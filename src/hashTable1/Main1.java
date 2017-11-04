package hashTable1;

public class Main1 {
    public static void main(String[] args){
        Table1 table = new Table1(2);
        table.prn();
        System.out.println(table.put("Cat","Кошка"));
        table.prn();
        System.out.println(table.put("Cow","Корова"));
        table.prn();
        System.out.println(table.put("Cat","Кошeчка"));
        table.prn();
        System.out.println(table.get("Cap"));
        System.out.println(table.get("Cat"));
        table.prn();
        System.out.println();
        System.out.println(table.remove("Cap"));
        System.out.println();
        table.prn();
        System.out.println(table.remove("Cow"));
        table.prn();


    }
}
