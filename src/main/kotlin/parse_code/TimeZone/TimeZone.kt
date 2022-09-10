package parse_code.TimeZone

import com.squareup.moshi.Json
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi


fun main() {

    TimeZone().parse()

}

class TimeZone {

    fun parse() {

        val moshi = Moshi.Builder().build()

        val adapter: JsonAdapter<TimeZoneObject> = moshi.adapter<TimeZoneObject>(TimeZoneObject::class.java)

        val timeZoneObject = adapter.fromJson(timeZone)

        println(timeZoneObject?.get?: "hueta")

    }

}
@JsonClass(generateAdapter = true)
data class TimeZoneObject(
    @Json(name = "get") val get: String,
    @Json(name = "parameters") val parameters: Array<Any?>,
    @Json(name = "errors") val errors: Array<Any?>,
    @Json(name = "results") val results: Int,
    @Json(name = "paging") val paging: Paging,
    @Json(name = "response") val response: Array<String>
)
@JsonClass(generateAdapter = true)
data class Paging(
    @Json(name = "current") val current: Int,
    @Json(name = "total") val total: Int
)