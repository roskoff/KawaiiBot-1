package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.KawaiiBot
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import net.dv8tion.jda.core.Permission

@Command(description = "Wag the tail! :3", aliases = ["tails", "wagging"], botPermissions = [Permission.MESSAGE_EMBED_LINKS], guildOnly = true)
class Wag : ICommand {
    override fun run(ctx: CommandContext) {
        //TODO: Reimplement, maybe?
        ctx.send("Not re-implemented")
    }
}
