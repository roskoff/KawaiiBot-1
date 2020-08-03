package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.extensions.clean
import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission


@Command(description = "Nom someone :3 ", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Nom : ICommand {

    private val nomURLs = arrayOf("https://cdn.weeb.sh/images/rynfK0DTW.gif", "https://cdn.weeb.sh/images/SkeUEAvTW.gif", "https://cdn.weeb.sh/images/SyI7yJKw-.gif",
                                    "https://cdn.weeb.sh/images/BJSf1JFDZ.gif", "https://cdn.weeb.sh/images/SyLfyJtvb.gif", "https://cdn.weeb.sh/images/HJ_RAAuvb.gif",
                                    )

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
                val nom = Helpers.chooseRandom(nomURLs)
                ctx.send("**${m.effectiveName.clean()}**, you got a nom from **${ctx.author.name}**\n$nom")
            }
        }
    }
}
