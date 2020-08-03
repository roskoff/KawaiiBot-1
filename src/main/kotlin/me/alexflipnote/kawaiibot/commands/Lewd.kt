package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.alexflipnote.kawaiibot.utils.Helpers
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Posts a girl saying lewd", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Lewd : ICommand {

    private val lewdURLs = arrayOf("https://cdn.weeb.sh/images/rJxVpp_wb.gif", "https://cdn.weeb.sh/images/rkJBa6dwZ.gif", "https://cdn.weeb.sh/images/SJWLva6_Db.jpeg", 
                                    "https://cdn.weeb.sh/images/H1JrfnPLM.gif", "https://cdn.weeb.sh/images/SJcrppdPb.gif", "https://cdn.weeb.sh/images/B1um6aOD-.png",
                                    "https://cdn.weeb.sh/images/rynf6aOPb.png", "https://cdn.weeb.sh/images/H18uap_vb.gif", "https://cdn.weeb.sh/images/H1UQaT_w-.png",
                                    "https://cdn.weeb.sh/images/S1EHap_w-.gif" )

    override fun run(ctx: CommandContext) {
        ctx.send(Helpers.chooseRandom(lewdURLs))
    }

}