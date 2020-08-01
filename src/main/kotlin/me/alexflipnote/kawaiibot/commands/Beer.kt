package me.alexflipnote.kawaiibot.commands

import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import me.aurieh.ichigo.utils.StringUtil
import net.dv8tion.jda.core.Permission


@Command(description = "Give someone a beer!", botPermissions = [Permission.MESSAGE_EXT_EMOJI], guildOnly = true)
class Beer : ICommand {
    
    override fun run(ctx: CommandContext) {
        val m = ctx.args.nextMemberOrNull()

        if (m == null || m.user.idLong == ctx.author.idLong) {
            ctx.send("Alone? Aww ;-; I'll share a beer with you")
        } else if (m.user.idLong == ctx.jda.selfUser.idLong) {
            ctx.send("Thanks for the beer, **${ctx.author.name}**")
        } else {
            val r = StringUtil.cleanContent(ctx.args.collect())
            if (r.isEmpty())
                ctx.send("**${m.user.name}**, you got a \uD83C\uDF7A from " +
                        "**${ctx.author.name}**\n\n")
            else
                ctx.send("**${m.user.name}**, you got a \uD83C\uDF7A from " +
                        "**${ctx.author.name}**\n\n**Reason:** $r\n")
        }
    }
}
