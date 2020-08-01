package me.alexflipnote.kawaiibot.utils

import me.alexflipnote.kawaiibot.extensions.json
import me.alexflipnote.kawaiibot.extensions.thenException
import me.alexflipnote.kawaiibot.utils.RequestUtil
import org.json.JSONArray
import org.json.JSONObject

object NekosLife{

    private val END_URLS = resourceUtil.readJson<HashMap<String,String>>("Resources/nekosLifeEndpoints.json")

    fun retreiveImage(type: String, msg: String, failMsg: String){
        val end=END_URLS.get(type)
        RequestUtil.get("https://api.nekos.dev/api/v3/images/sfw/$end").thenAccept {
            val res = it.json()?.getString("url")
            return res
        }.thenException { return null }
    }
}