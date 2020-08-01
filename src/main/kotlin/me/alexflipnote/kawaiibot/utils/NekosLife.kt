package me.alexflipnote.kawaiibot.utils

import me.alexflipnote.kawaiibot.extensions.json
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.CompletableFuture

object NekosLife{

    val END_URLS = ResourceUtil.readJson<HashMap<String?,String?>>("Resources/nekosLifeEndpoints.json")

    inline fun findImage(type: String) : CompletableFuture<Response>{
        val end=END_URLS.get(type)
        return RequestUtil.get("https://api.nekos.dev/api/v3/images/sfw/$end")
    }
}