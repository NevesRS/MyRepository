public class App {
    public static void main(String[] args) {
        ListArrayOfInteger lista = new ListArrayOfInteger(10);

        // System.out.println(lista.isEmpty());
        lista.add(12);
        lista.add(10);
        lista.add(11);
        lista.add(12);
        // System.out.println(lista.size());
        // System.out.println(lista.isEmpty());
        // System.out.println(lista.get(2));
        // lista.clear();
        // System.out.println(lista.isEmpty());
        System.out.println(lista.removeByIndex(1));
        // System.out.println(lista.get(1));
        // System.out.println(lista.contains(12));
        // System.out.println(("ANTES REVERSE"));
        System.out.println(lista.toString());
        // System.out.println(("DEPOIS REVERSE"));
        // lista.reverse();
        // System.out.println(lista.toString());
        // System.out.println(lista.indexOf(11));
        // System.out.println(lista.countOccurences(11));
    }
}
