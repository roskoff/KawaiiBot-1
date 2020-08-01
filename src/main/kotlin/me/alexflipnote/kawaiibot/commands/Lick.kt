package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.extensions.clean
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission
import net.dv8tion.jda.core.MessageBuilder

@Command(description = "Lick someone o////o", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Lick : ICommand {

    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null -> {
                val msg = MessageBuilder().setContent("Are you trying to lick air ?").build()
                ctx.channel.sendFile(Helpers.getImageStream("images/airlick.gif"), "airlick.gif", msg).queue()
            }
                m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("${ctx.author.name}... w-why do you lick me ;-;")
            m.user.idLong == ctx.author.idLong ->
                ctx.channel.sendFile(Helpers.getImageStream("images/selflick.gif"), "selflick.gif").queue()
            else -> {
                //TODO: Implement lick
                ctx.send("**${m.effectiveName.clean()}**, was licked by **${ctx.author.name}**")
            }
        }
    }

}
