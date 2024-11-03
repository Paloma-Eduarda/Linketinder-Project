package Linketinder.com.acelerazg.classes

class Estado {
    int id
    String codigo
    String nome

    Estado(String codigo, int id, String nome) {
        this.codigo = codigo
        this.id = id
        this.nome = nome
    }

    @Override
    public String toString() {
        return "Estado: " +
                "codigo='" + codigo + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'';
    }
}
