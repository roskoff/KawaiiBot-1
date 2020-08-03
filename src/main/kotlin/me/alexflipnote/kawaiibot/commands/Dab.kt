package me.alexflipnote.kawaiibot.commands


import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Dab on haters", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Dab : ICommand {
    private val comments = arrayOf("Dabs on haters", "Dabbing is so 2016", "#DabIsNotDead")
    private val dabURLs = arrayOf("https://cdn.weeb.sh/images/SyRvnx1q-.jpeg", "https://cdn.weeb.sh/images/HJxaUzSa-.jpeg", "https://cdn.weeb.sh/images/r13gL0tTb.png")

    override fun run(ctx: CommandContext) {
        val comment = Helpers.chooseRandom(comments)
        val img = Helpers.chooseRandom(dabURLs)
        ctx.send("**$comment**\n$img")
    }
}
