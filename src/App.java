public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*************************************************" );

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("test 1");
        minhaListaEncadeada.add("test 2");
        minhaListaEncadeada.add("test 3");
        minhaListaEncadeada.add("test 4"); 

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);


        System.out.println(minhaListaEncadeada.remove(3));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));

        

    }
}
