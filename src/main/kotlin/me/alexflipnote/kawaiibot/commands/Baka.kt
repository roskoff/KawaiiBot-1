package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.extensions.json
import me.alexflipnote.kawaiibot.utils.Helpers
import me.alexflipnote.kawaiibot.utils.RequestUtil
import me.alexflipnote.kawaiibot.extensions.thenException
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission


@Command(description = "Call someone a baka", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Baka : ICommand {
    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("Who are you calling a baka...?")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("**${ctx.author.name}** how could you :'(")
            m.user.idLong == ctx.author.idLong ->
                ctx.channel.sendFile(Helpers.getImageStream("images/selfbaka.jpg"), "selfbaka.jpg").queue()
            else -> {
                RequestUtil.get("https://api.nekos.dev/api/v3/images/sfw/gif/baka").thenAccept {
                    val res = it.json()?.getJSONObject("data")?.getJSONObject("response")?.getString("url") ?: ""
                    ctx.send("**${ctx.author.name}**, called **${m.effectiveName.clean()}** a baka\n$res")
                }.thenException { ctx.send("S-sorry, n-no bakas...") }
            }
        }
    }
}
