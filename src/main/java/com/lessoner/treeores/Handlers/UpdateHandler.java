package com.lessoner.treeores.Handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

import java.io.IOException;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class UpdateHandler {
    private String _downloadUrl = "http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2242983-treeores-5-5-available-modalicious-update";

    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent e) {
        try {
            CheckUpdates.checkUpdate();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        String str = "Download ASAP!!";
        if (CheckUpdates.newversion) {
            e.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "<" + "TreeOres Mod" + ">").appendText(EnumChatFormatting.WHITE + " New version out!"));

            IChatComponent localIChatComponent = IChatComponent.Serializer.func_150699_a("[{\"text\":\"" + str + "\",\"color\":\"aqua\"}," + "{\"text\":\" " + EnumChatFormatting.WHITE + "[" + EnumChatFormatting.GREEN + "Forum Link" + EnumChatFormatting.WHITE + "]\"," + "\"color\":\"green\",\"hoverEvent\":{\"action\":\"show_text\",\"value\":" + "{\"text\":\"Click this to go to forum thread\",\"color\":\"yellow\"}}," + "\"clickEvent\":{\"action\":\"open_url\",\"value\":\"" + this._downloadUrl + "\"}}]");
            e.player.addChatMessage(localIChatComponent);
        }
    }
}
