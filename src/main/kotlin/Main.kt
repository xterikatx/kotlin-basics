/**
 * Tipos de dados
 *
 * Type
 * Double
 * Float
 * Long
 * Int
 * Shot
 * Byte
 * Boolean
 * String
 * Char
 */


fun main() {
    var nome = "Erika Lopes"
    var numero = 10
    numero += 2
    numero -= 1
    numero /= 3
    numero *= 12
    nome = "Calu da Silva"
    val idade = 22
    // não pode sobreescrever idade, pois é uma constante idade = 22

    println("hello world " + nome)
    println("Olá, $nome $idade")
    println(
        "Double Max ${Double.MAX_VALUE}"
    )

    println(
        "Double Max ${Float.MAX_VALUE}"
    )

    println(
        "Double Max ${Char.MAX_VALUE}"
    )

    /**
     *
     * Operadores aritmeticos
     */

    println("$numero")
}
// comentário de uma linha

/*
* comentário de várias linhas
* */

/**
 * comentários de várias linhas
 * ideal para documentação de função
 * */
