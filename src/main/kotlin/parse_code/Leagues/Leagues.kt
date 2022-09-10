package parse_code.Leagues

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import parse_code.TimeZone.Paging

fun main() {


    val leaguesObject = Leagues().parse()

    val list_seasons = leaguesObject.response.get(0).seasons

    list_seasons.sortedByDescending { it.year }

    list_seasons.forEach { println(it.year) }





}


class Leagues {

    fun parse(): LeaguesObject {

        val moshi = Moshi.Builder().build()

        val adapter = moshi.adapter<LeaguesObject>(LeaguesObject::class.java)

        val leaguesObject = adapter.fromJson(leagues)


        return leaguesObject!!


    }


}

@JsonClass(generateAdapter = true)
data class LeaguesObject(
    val get: String,
    val parameters: Parameters,
    val errors: List<Any?>,
    val results: Int,
    val paging: Paging,
    val response: List<ResponseObject>,
)
@JsonClass(generateAdapter = true)
data class Parameters(
    val id: Int
)
@JsonClass(generateAdapter = true)
data class ResponseObject(
    val league: League,
    val country: Country,
    val seasons: List<Season>
)
@JsonClass(generateAdapter = true)
data class League(
    val id: Int,
    val name: String,
    val type: String,
    val logo: String
)
@JsonClass(generateAdapter = true)
data class Country(
    val name: String,
    val code: String,
    val flag: String
)
@JsonClass(generateAdapter = true)
data class Season(
    val year: Int,
    val start: String,
    val end: String,
    val current: Boolean,
    val coverage: Coverage
)
@JsonClass(generateAdapter = true)
data class Coverage(
    val fixtures: Fixtures,
    val standings: Boolean,
    val players: Boolean,
    val top_scorers: Boolean,
    val top_assists: Boolean,
    val injuries: Boolean,
    val predictions: Boolean,
    val odds: Boolean
)
@JsonClass(generateAdapter = true)
data class Fixtures(
    val events: Boolean,
    val lineups: Boolean,
    val statistics_fixtures: Boolean,
    val statistics_players: Boolean
)