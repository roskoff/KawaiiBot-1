package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.utils.Helpers
import me.alexflipnote.kawaiibot.extensions.clean
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import me.aurieh.ichigo.utils.StringUtil

@Command(description = "Press F to pay respects")
class F : ICommand {
    private val hearts = arrayOf("❤", "💛", "💚", "💙", "💜")

    override fun run(ctx: CommandContext) {
        val heart = Helpers.chooseRandom(hearts)
        val m = ctx.args.asMember
        val reason = ctx.args.collect()
        if (!reason.isEmpty()) {
            if(m!=null){
                ctx.send("**${ctx.author.name}** has paid their respects for **${m.effectiveName.clean()}** $heart")
            }else{
                ctx.send("**${ctx.author.name}** has paid their respects for **${StringUtil.cleanerContent(reason)}** $heart")
            }
        } else {
            ctx.send("**${ctx.author.name}** has paid their respects $heart")
        }

    }
}
