import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import javax.sql.DataSource

object DatabaseFactory {
    fun createDataSource(): DataSource {
        val config = HikariConfig("hikari.properties")
        return HikariDataSource(config)
    }
}