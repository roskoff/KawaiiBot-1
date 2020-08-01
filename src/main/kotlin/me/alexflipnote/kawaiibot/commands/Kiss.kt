package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.utils.RequestUtil
import me.alexflipnote.kawaiibot.extensions.json
import me.alexflipnote.kawaiibot.extensions.thenException
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Kiss someone :3 ", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Kiss : ICommand {
    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("Are you trying to kiss the void...?")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("*Kisses **${ctx.author.name}** back* ❤")
            m.user.idLong == ctx.author.idLong ->
                ctx.send("Sorry to see you alone ;-;")
            else -> {
                //TODO: Implement kiss
                RequestUtil.get("https://api.nekos.dev/api/v3/images/sfw/gif/kiss").thenAccept {
                    val res = it.json()?.getString("url")
                    ctx.send("**${m.user.name}**,you got a kiss from **${ctx.author.name}**\n$res")
                }.thenException { ctx.send("S-sorry, no kisses...") }
                
            }
        }
    }
}
