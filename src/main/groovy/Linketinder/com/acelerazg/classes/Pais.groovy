package Linketinder.com.acelerazg.classes

class Pais {
    int id
    String codigo
    String nome

    Pais(int id, String codigo, String nome) {
        this.codigo = codigo
        this.id = id
        this.nome = nome
    }

    @Override
    public String toString() {
        return "\nPais = " +
                "codigo='" + codigo + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'';
    }
}
