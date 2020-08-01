package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Posts a girl blushing o////o", botPermissions = [Permission.MESSAGE_EMBED_LINKS])
class Blush : ICommand {

    override fun run(ctx: CommandContext) {
        //TODO: Implement blush
        ctx.send("Not re-implemented")
    }

}