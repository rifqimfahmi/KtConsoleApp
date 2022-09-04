import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.int

class ConsoleApp: CliktCommand(name="consoleapp") {
    val projectId by option(help="Target Project Id").int().required()


    override fun run() {
        println("hellow world $projectId")
    }
}

fun main(args: Array<String>) = ConsoleApp().main(args)