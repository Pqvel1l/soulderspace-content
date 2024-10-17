package com.soulderspace.souldercontent.forge;

import com.soulderspace.souldercontent.block.SoulderBlocks;
import com.soulderspace.souldercontent.item.SoulderItems;
import com.soulderspace.souldercontent.SoulderContent;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(SoulderContent.ID)
public class SoulderContentForge {
    public SoulderContentForge() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerBlocks);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerItems);
        SoulderContent.init();
    }

    @SubscribeEvent
    public void registerItems(RegisterEvent event) {
        SoulderItems items = SoulderItems.getInstance();
        event.register(items.getRegistryKey(), helper -> items.register(helper::register));
        event.register(
                Registries.ITEM_GROUP.getKey(), helper -> helper.register(new Identifier(SoulderContent.ID, "soulder_content"),
                ItemGroup.builder()
                        .displayName(Text.translatable("itemGroup.souldercontent"))
                        .icon(items.ENVELOPE::getDefaultStack)
                        .entries((displayContext, entries) -> items.all().forEach(item -> entries.add(item.getDefaultStack())))
                        .build())
        );
    }

    @SubscribeEvent
    public void registerBlocks(RegisterEvent event) {
        SoulderBlocks blocks = SoulderBlocks.getInstance();
        event.register(blocks.getRegistryKey(), helper -> blocks.register(helper::register));
    }
}