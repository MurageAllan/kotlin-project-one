import java.util.*

enum class SessionType {
    SQL, MONGODB, CASSANDRA, POSTGRE;

    fun getFormatedName() =
        name.lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

object SessionFactory {
    fun createSession(type: SessionType): Session {
    val id = UUID.randomUUID().toString()
    val name = when(type){
        SessionType.SQL -> type.getFormatedName()
        SessionType.MONGODB -> "Better"
        SessionType.POSTGRE -> "Best"
        SessionType.CASSANDRA -> "Average"
    }
        return Session(id, name)
    }
}

class Session(val id: String, val name: String) {
    override fun toString(): String {
        return "id : $id name : $name "
    }

}

fun main() {
    val session = SessionFactory.createSession(SessionType.SQL)
    println(session)
}