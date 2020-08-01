package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Posts a dancing image, get down and boogie", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Dance : ICommand {

    override fun run(ctx: CommandContext) {
        //TODO: Implement dance
        ctx.send("Not re-implemented")
    }

}