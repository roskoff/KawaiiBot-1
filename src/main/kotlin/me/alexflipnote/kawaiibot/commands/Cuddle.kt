package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.extensions.json
import me.alexflipnote.kawaiibot.extensions.clean
import me.alexflipnote.kawaiibot.utils.RequestUtil
import me.alexflipnote.kawaiibot.extensions.thenException
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Cuddle someone :3 ", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Cuddle : ICommand {
    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("Are you trying to cuddle the void...?")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("*Cuddles **${ctx.author.name}** back*")
            m.user.idLong == ctx.author.idLong ->
                ctx.send("Sorry to see you alone ;-;")
            else -> {
                RequestUtil.get("https://api.nekos.dev/api/v3/images/sfw/gif/cuddle").thenAccept {
                    val res = it.json()?.getJSONObject("data")?.getJSONObject("response")?.getString("url") ?: ""
                    ctx.send("**${m.effectiveName.clean()}**, you got a cuddle from **${ctx.author.name}**\n$res")
                }.thenException { ctx.send("S-sorry, n-no cuddles...") }
            }
        }
    }
}
