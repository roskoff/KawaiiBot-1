package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.extensions.clean
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.MessageBuilder
import net.dv8tion.jda.core.Permission

@Command(description = "Bite someone :3c", botPermissions = [Permission.MESSAGE_EMBED_LINKS, Permission.MESSAGE_ATTACH_FILES])
class Bite : ICommand {
    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("Are you trying to bite thin air...?")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("Don't b-bite me ;-;")
            m.user.idLong == ctx.author.idLong -> {
                ctx.send("W-Why would you want to bite yourself...?")
            }
            else -> {
                //TODO: implement bite
                ctx.send("**${m.effectiveName.clean()}**, you were bitten by **${ctx.author.name}**")
            }
        }
    }
}
