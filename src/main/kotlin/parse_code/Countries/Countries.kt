package parse_code.Countries

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import parse_code.TimeZone.Paging

fun main() {

    val countriesObject = Countries().parse()

    val list = countriesObject.response

    list.forEach { println(it.code) }


}

class Countries {

    fun parse(): CountriesObject {

        val moshi = Moshi.Builder().build()

        val adapter = moshi.adapter<CountriesObject>(CountriesObject::class.java)

        val countriesObject = adapter.fromJson(countries)

        return countriesObject!!

    }

}
@JsonClass(generateAdapter = true)
data class CountriesObject(
     val get: String,
     val parameters: Parameters,
     val errors: List<Any?>,
     val results: Int,
     val paging: Paging,
     val response: List<AnyObject>
)
@JsonClass(generateAdapter = true)
data class Parameters(
     val name: String
)
@JsonClass(generateAdapter = true)
data class AnyObject(
     val name: String,
     val code: String,
     val flag: String
)