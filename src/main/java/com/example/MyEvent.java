package com.example;

import kotlin.coroutines.CoroutineContext;
import net.mamoe.mirai.Bot;
import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import net.mamoe.mirai.event.events.MessageEvent;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * @author XGZ
 */
public class MyEvent extends SimpleListenerHost {
    @EventHandler
    public ListeningStatus friendListener(@NotNull FriendMessageEvent event) throws IOException {
        if (event.getMessage().contentToString().contains("?")){
            event.getSender().sendMessage("你好，我是小程序，我可以帮你记录你的聊天记录，请输入“记录”开始记录");
            event.getSubject().sendMessage("@"+event.getSender().getNick());
        }
        return ListeningStatus.LISTENING;
    }
    // 自动回复
    @EventHandler
    public ListeningStatus groupListen(GroupMessageEvent event) throws IOException {
        if (event.getMessage().contentToString().contains("?")) {
            event.getSender().sendMessage("你好，我是小程序，我可以帮你记录你的聊天记录，请输入“记录”开始记录");
            event.getSubject().sendMessage("@" + event.getSender().getNick());
        }

        return ListeningStatus.LISTENING;
    }

}
