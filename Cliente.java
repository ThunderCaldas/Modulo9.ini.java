public class Cliente {
    private String nome;
    private int compras;


    public Cliente(String nome, int compras) {
        this.nome = nome;
        this.compras = compras;
    }

        public String getNome() {
            return nome;
        }

        public int getCompras() {
            return compras;
        }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", compras=" + compras +
                '}';
    }
}
