package me.alexflipnote.kawaiibot.commands

import me.alexflipnote.kawaiibot.extensions.clean
import me.aurieh.ichigo.core.CommandContext
import me.aurieh.ichigo.core.ICommand
import me.aurieh.ichigo.core.annotations.Command
import me.aurieh.ichigo.utils.StringUtil
import java.util.*

@Command(description = "Rates your waifu~", aliases = ["rate"])
class RateWaifu : ICommand {
    var r = Random()

    override fun run(ctx: CommandContext) {
        if (ctx.argString.isEmpty()) {
            ctx.send("You have to rate something..?")
            return
        }

        val m = ctx.args.asMember

        when {
            m == null ->
                ctx.send("I'd rate `${StringUtil.cleanerContent(ctx.argString)}` a **${r.nextInt(100 - 1) + 1} / 100**")
            m.user.idLong == ctx.jda.selfUser.idLong ->
                ctx.send("I'd rate me a 110/100!")
            m.user.idLong == ctx.author.idLong ->
                ctx.send("I'd rate you a **${r.nextInt(90 - 1) + 11} / 100**")
            else -> {
                    ctx.send("I'd rate `${m.effectiveName.clean()}` a **${r.nextInt(100 - 1) + 1} / 100**")
                }
            }
        }
        
    }

