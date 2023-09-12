public class App {
    public static void main(String[] args) throws Exception {
        Data data = new Data("31", "01", "2000");

        data.validaData(data.getDia(), data.getMes(), data.getAno());

        System.out.println(data.toString(data.getDia(), data.getMes(), data.getAno())); 
    }
}
