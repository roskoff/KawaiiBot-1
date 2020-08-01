package me.alexflipnote.kawaiibot.commands

import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command

@Command(description = "Get a link to build your own bot")
class Source : ICommand {
    override fun run(ctx: CommandContext) {
        ctx.send("Build your own bot using this source code:\nhttps://github.com/nanami-hitomi/KawaiiBot")
    }
}
