package me.alexflipnote.kawaiibot.utils

import me.alexflipnote.kawaiibot.extensions.json
import me.alexflipnote.kawaiibot.extensions.thenException
import org.json.JSONArray
import org.json.JSONObject

object NekosLife{

    private val END_URLS = ResourceUtil.readJson<HashMap<String?,String?>>("Resources/nekosLifeEndpoints.json")

    inline fun findImage(type: String) : String{
        val end=END_URLS.get(type)
        val res
        RequestUtil.get("https://api.nekos.dev/api/v3/images/sfw/$end").thenAccept {
            res = it.json()?.getString("url")

        }.thenException {  }
        return res ?: ""
    }
}