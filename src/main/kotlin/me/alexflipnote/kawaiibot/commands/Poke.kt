package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.utils.RequestUtil
import me.alexflipnote.kawaiibot.extensions.json
import me.alexflipnote.kawaiibot.extensions.thenException
import me.alexflipnote.kawaiibot.extensions.clean
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission


@Command(description = "Poke someone :3", botPermissions = [Permission.MESSAGE_EMBED_LINKS], guildOnly = true)
class Poke : ICommand {
    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("Are you trying to poke thin air...?")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("Don't poke me ;-;")
            m.user.idLong == ctx.author.idLong ->
                ctx.send("You can't poke yourself... baka ;-;")
            else -> {
                RequestUtil.get("https://api.nekos.dev/api/v3/images/sfw/gif/poke").thenAccept {
                    val res = it.json()?.getString("url")
                    ctx.send("**${m.user.name}**,you got a poke from **${ctx.author.name}**\n$res")
                }.thenException { ctx.send("No poking!") }
            }
        }
    }
}
