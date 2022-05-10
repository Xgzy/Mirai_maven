package com.example;


import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.GlobalEventChannel;

/**
 * @author 17909
 */
public final class Plugin extends JavaPlugin {
    public static final Plugin INSTANCE = new Plugin();

    private Plugin() {
        super(new JvmPluginDescriptionBuilder("org.example.plugin", "1.0-SNAPSHOT")
                .name("MiraiBot")
                .info("群管机器人和常用功能其他功能会陆续开发")
                .author("Xgzy")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
        GlobalEventChannel.INSTANCE.registerListenerHost(new MyEvent());
    }

}