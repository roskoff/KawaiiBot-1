package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Posts a girl blushing o////o", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Blush : ICommand {

    private val blushURLs = arrayOf("https://cdn.weeb.sh/images/rkXur1ncz.gif", "https://cdn.weeb.sh/images/S1X7GIXw-.gif",
                                    "https://cdn.weeb.sh/images/r1U7G87vZ.gif", "https://cdn.weeb.sh/images/B14JM8Qw-.gif", "https://cdn.weeb.sh/images/BJH4f8mP-.gif",
                                    "https://cdn.weeb.sh/images/HkrQM8mwZ.gif", "https://cdn.weeb.sh/images/HklJGIXPW.gif")
    override fun run(ctx: CommandContext) {
        val res = Helpers.chooseRandom(blushURLs)
        ctx.send(res)
    }

}