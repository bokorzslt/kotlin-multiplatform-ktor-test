package ktortest

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import kotlin.js.Promise

@ExperimentalJsExport
@JsExport
class JsGreeting {

    private val client = HttpClient()

    @OptIn(DelicateCoroutinesApi::class)
    fun greeting(): Promise<String> =
        GlobalScope.promise {
            val response = client.get("https://jsonplaceholder.typicode.com/todos/")
            response.bodyAsText()
        }
}