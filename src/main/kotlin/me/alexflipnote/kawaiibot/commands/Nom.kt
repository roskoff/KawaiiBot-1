package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission


@Command(description = "Nom someone :3 ", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Nom : ICommand {
    override fun run(ctx: CommandContext) {
        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("Are you trying to nom the void...?")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("*Noms **${ctx.author.name}** back* ❤")
            m.user.idLong == ctx.author.idLong ->
                ctx.send("Sorry to see you alone ;-;")
            else -> {
                //TODO: Implement nom
                ctx.send("**${m.effectiveName.clean()}**, you got a nom from **${ctx.author.name}**")
            }
        }
    }
}
