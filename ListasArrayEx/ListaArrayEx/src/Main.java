public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>("Root");
        System.out.println("Hello world!");

        list.add("tenho a 0 posição");
        list.add("tenho a 1 posição");
        list.add("tenho a 2 posição");
        //list.addValue("World", 1);
        list.getIndex(2);
        list.deleteIndex(3);
    }
}