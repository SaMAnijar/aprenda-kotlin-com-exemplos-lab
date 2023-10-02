// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome")
    }

    fun listarConteudos() {
        println("Conteúdos da formação $nome:")
        for (conteudo in conteudos) {
            println("- ${conteudo.nome} (${conteudo.duracao} minutos)")
        }
    }
}

fun main() {
    // Criar alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 120)
    val conteudo2 = ConteudoEducacional("Desenvolvilmento Mobile com Kotlin", 90)

    // Criar uma formação
    val formacao = Formacao("Desenvolvedor Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))

    // Criar alguns usuários
    val usuario1 = Usuario("Samuel")
    val usuario2 = Usuario("Ana")

    // Matricular os usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Verificar os inscritos na formação
    println("Inscritos na formação ${formacao.nome}:")
    for (inscrito in formacao.inscritos) {
        println("- ${inscrito.nome}")
    }

    // Listar os conteúdos da formação
    formacao.listarConteudos()
}