class Program {
    public static void main(String[] args) {
        Client client = null;

        client = new Client(new CocaColaFactory());
        client.Run();

        client = new Client(new PepsiFactory());
        client.Run();
    }
}