package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Posts a crying picture when you're sad ;-;", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Cry : ICommand {

    private val cryURLs = arrayOf("https://cdn.weeb.sh/images/HkxLXIQvb.gif", "https://cdn.weeb.sh/images/HymMXUQPW.gif", "https://cdn.weeb.sh/images/BJf41e51z.gif",
                                    "https://cdn.weeb.sh/images/r1itBRFTZ.gif", "https://cdn.weeb.sh/images/SkbN7LQv-.gif", "https://cdn.weeb.sh/images/B1N87IQDZ.gif",
                                    "https://cdn.weeb.sh/images/Sy1EUa-Zz.gif", "https://cdn.weeb.sh/images/r1WMmLQvW.gif", "https://cdn.weeb.sh/images/ByuM1x5Jz.gif")

    override fun run(ctx: CommandContext) {
        ctx.send(Helpers.chooseRandom(cryURLs))
    }

}