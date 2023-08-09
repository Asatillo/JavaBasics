public class Main2 {
    public static void main(String[] args) {
        IntList list1 = new IntList(20);
        list1.add(1);
        list1.add(24);
        list1.add(42);
        list1.add(54);
        list1.add(92);
        list1.add(193);
        list1.add(55);
        System.out.println(list1);

        list1.removeItemsGreaterThan(100);
        System.out.println(list1);

        IntList list2 = new IntList(5);
        list2.add(20);
        list2.add(92);
        list2.add(73);
        list2.add(46);
        list2.add(82);
        System.out.println(list2);
        list1.concat(list2);
        System.out.println(list1);

        NamedIntList listNamed1  = new NamedIntList(20, "asasadasd");
        listNamed1.add(12);
        listNamed1.add(23);
        System.out.println(listNamed1);

        listNamed1.removeItemsGreaterThan(15);
        System.out.println(listNamed1);
    }
}