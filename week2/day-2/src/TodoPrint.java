public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        String b = todoText.replace(" - Buy milk\n", "My todo\n - Buy milk\n - Download games\n     - Diablo");

        System.out.println(todoText);
        System.out.println(b);
    }

}
