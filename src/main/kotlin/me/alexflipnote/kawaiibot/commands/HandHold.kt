package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission


@Command(description = "Hold the hand of someone :3 ", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class HandHold : ICommand {
    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("Are you trying to hold the hand of the ghost...?")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("*Holds **${ctx.author.name}**'s hand back*")
            m.user.idLong == ctx.author.idLong ->
                ctx.send("Sorry to see you alone ;-;")
            else -> {
                //TODO: Implement handholding (oh no how lewd)
                ctx.send("**${m.effectiveName.clean()}**, **${ctx.author.name}** is holding your hand")
            }
        }
    }
}
