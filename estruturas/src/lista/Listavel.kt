package lista

interface Listavel {

    fun inserir(dado: Any)
    fun remover(indice:Int)
    fun listarTodos()
    fun sobrescrever(indice: Int, dado: Any)
    fun tamanho(): Int
    fun estaCheio():Boolean
    fun estaVazia():Boolean
}