package parse_code.TimeZone

import com.squareup.moshi.Json
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import java.nio.charset.Charset


fun main() {

    val timeZoneObject = TimeZone().parse()

    val list: List<String> = timeZoneObject.response


    list.forEach { e -> println("$e ") }

}

class TimeZone {

    fun parse(): TimeZoneObject {

        val moshi = Moshi.Builder().build()

        val adapter: JsonAdapter<TimeZoneObject> = moshi.adapter<TimeZoneObject>(TimeZoneObject::class.java)

        val timeZoneObject = adapter.fromJson(timeZone)

        return timeZoneObject!!

    }

}
@JsonClass(generateAdapter = true)
data class TimeZoneObject(
    @Json(name = "get") val get: String,
    @Json(name = "parameters") val parameters: List<Any?>,
    @Json(name = "errors") val errors: List<Any?>,
    @Json(name = "results") val results: Int,
    @Json(name = "paging") val paging: Paging,
    @Json(name = "response") val response: List<String>
)
@JsonClass(generateAdapter = true)
data class Paging(
    @Json(name = "current") val current: Int,
    @Json(name = "total") val total: Int
)