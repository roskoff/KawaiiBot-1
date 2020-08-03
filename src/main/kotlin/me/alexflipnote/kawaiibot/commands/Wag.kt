package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Wag the tail! :3", aliases = ["tails", "wagging"], botPermissions = [Permission.MESSAGE_EMBED_LINKS], guildOnly = true)
class Wag : ICommand {

    private val wagURLs = arrayOf("https://cdn.weeb.sh/images/S1g1Hq1tvb.jpeg", "https://cdn.weeb.sh/images/SkgjHcyYDZ.gif", "https://cdn.weeb.sh/images/rynHqkKD-.gif",
                                    "https://cdn.weeb.sh/images/Byef8cJtwb.gif", "https://cdn.weeb.sh/images/ByCBqytPb.gif")

    override fun run(ctx: CommandContext) {
        ctx.send(Helpers.chooseRandom(wagURLs))
    }
}
