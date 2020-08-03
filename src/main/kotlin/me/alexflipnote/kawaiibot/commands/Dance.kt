package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Posts a dancing image, get down and boogie", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Dance : ICommand {

    private val danceURLs = arrayOf("https://cdn.weeb.sh/images/ByFHOIXvW.gif", "https://cdn.weeb.sh/images/Hk0duIXPb.gif", "https://cdn.weeb.sh/images/ByOruIQPb.gif",
                                    "https://cdn.weeb.sh/images/BJoRuLXPW.gif", "https://cdn.weeb.sh/images/SyeunuUmv-.gif", "https://cdn.weeb.sh/images/SyNCd8mPb.gif",
                                    "https://cdn.weeb.sh/images/B1UeKUmP-.gif", "https://cdn.weeb.sh/images/H1wxtLXwb.gif", "https://cdn.weeb.sh/images/SkpOHJh5M.gif",
                                    "https://cdn.weeb.sh/images/ByBetLXP-.gif")

    override fun run(ctx: CommandContext) {
        ctx.send(Helpers.chooseRandom(danceURLs))
    }

}