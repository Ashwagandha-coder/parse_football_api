package parse_code.Leagues

const val leagues = "{\n" +
        "  \"get\": \"leagues\",\n" +
        "  \"parameters\": {\n" +
        "    \"id\": \"39\"\n" +
        "  },\n" +
        "  \"errors\": [],\n" +
        "  \"results\": 1,\n" +
        "  \"paging\": {\n" +
        "    \"current\": 1,\n" +
        "    \"total\": 1\n" +
        "  },\n" +
        "  \"response\": [\n" +
        "    {\n" +
        "      \"league\": {\n" +
        "        \"id\": 39,\n" +
        "        \"name\": \"Premier League\",\n" +
        "        \"type\": \"League\",\n" +
        "        \"logo\": \"https://media.api-sports.io/football/leagues/2.png\"\n" +
        "      },\n" +
        "      \"country\": {\n" +
        "        \"name\": \"England\",\n" +
        "        \"code\": \"GB\",\n" +
        "        \"flag\": \"https://media.api-sports.io/flags/gb.svg\"\n" +
        "      },\n" +
        "      \"seasons\": [\n" +
        "        {\n" +
        "          \"year\": 2010,\n" +
        "          \"start\": \"2010-08-14\",\n" +
        "          \"end\": \"2011-05-17\",\n" +
        "          \"current\": false,\n" +
        "          \"coverage\": {\n" +
        "            \"fixtures\": {\n" +
        "              \"events\": true,\n" +
        "              \"lineups\": true,\n" +
        "              \"statistics_fixtures\": false,\n" +
        "              \"statistics_players\": false\n" +
        "            },\n" +
        "            \"standings\": true,\n" +
        "            \"players\": true,\n" +
        "            \"top_scorers\": true,\n" +
        "            \"top_assists\": true,\n" +
        "            \"top_cards\": true,\n" +
        "            \"injuries\": true,\n" +
        "            \"predictions\": true,\n" +
        "            \"odds\": false\n" +
        "          }\n" +
        "        },\n" +
        "        {\n" +
        "          \"year\": 2011,\n" +
        "          \"start\": \"2011-08-13\",\n" +
        "          \"end\": \"2012-05-13\",\n" +
        "          \"current\": false,\n" +
        "          \"coverage\": {\n" +
        "            \"fixtures\": {\n" +
        "              \"events\": true,\n" +
        "              \"lineups\": true,\n" +
        "              \"statistics_fixtures\": false,\n" +
        "              \"statistics_players\": false\n" +
        "            },\n" +
        "            \"standings\": true,\n" +
        "            \"players\": true,\n" +
        "            \"top_scorers\": true,\n" +
        "            \"top_assists\": true,\n" +
        "            \"top_cards\": true,\n" +
        "            \"injuries\": true,\n" +
        "            \"predictions\": true,\n" +
        "            \"odds\": false\n" +
        "          }\n" +
        "        }\n" +
        "      ]\n" +
        "    }\n" +
        "  ]\n" +
        "}"







const val seasons = "{\n" +
        "  \"get\": \"leagues/seasons\",\n" +
        "  \"parameters\": [],\n" +
        "  \"errors\": [],\n" +
        "  \"results\": 12,\n" +
        "  \"paging\": {\n" +
        "    \"current\": 1,\n" +
        "    \"total\": 1\n" +
        "  },\n" +
        "  \"response\": [\n" +
        "    2008,\n" +
        "    2010,\n" +
        "    2011,\n" +
        "    2012,\n" +
        "    2013,\n" +
        "    2014,\n" +
        "    2015,\n" +
        "    2016,\n" +
        "    2017,\n" +
        "    2018,\n" +
        "    2019,\n" +
        "    2020\n" +
        "  ]\n" +
        "}"