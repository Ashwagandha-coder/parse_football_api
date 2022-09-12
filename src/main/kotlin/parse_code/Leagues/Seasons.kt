package parse_code.Leagues

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import parse_code.TimeZone.Paging

fun main() {

    val seasonsObject = Seasons().parse()

    Seasons().action(seasonsObject)


}

class Seasons {


    fun action(seasonsObject: SeasonsObject) {

        val list_response: List<Int> = seasonsObject.response



    }

    fun parse(): SeasonsObject {

        val moshi = Moshi.Builder().build()

        val adapter = moshi.adapter<SeasonsObject>(SeasonsObject::class.java)

        val seasonsObject = adapter.fromJson(seasons)

        return seasonsObject!!

    }



}

@JsonClass(generateAdapter = true)
data class SeasonsObject(
    val get: String,
    val parameters: List<Any?>,
    val errors: List<Any?>,
    val results: Int,
    val paging: Paging,
    val response: List<Int>
)