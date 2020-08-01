package me.alexflipnote.kawaiibot.commands

import com.github.natanbc.weeb4j.image.NsfwFilter
import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Posts a crying picture when you're sad ;-;", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Cry : ICommand {

    override fun run(ctx: CommandContext) {
        //TODO: Implement cry
        ctx.send("Not re-implemented")
    }

}