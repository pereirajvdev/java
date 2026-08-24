package com.pereirapvp.pvp;

import com.pereirapvp.pvp.freelook.FreeLook;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class ModMain implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientTickEvents.START_CLIENT_TICK.register(client -> {
           FreeLook.instance.onClientTickStart();
        });
        
        initializeBindManager();
    }
    private void initializeBindManager() {
        BindManager bindManager = new BindManager();
        bindManager.onInitialize();
    }
}