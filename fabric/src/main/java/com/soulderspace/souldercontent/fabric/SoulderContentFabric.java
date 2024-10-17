package com.soulderspace.souldercontent.fabric;

import com.soulderspace.souldercontent.SoulderContent;
import com.soulderspace.souldercontent.block.SoulderBlocks;
import com.soulderspace.souldercontent.item.SoulderItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SoulderContentFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        registerBlocks();
        registerItems();
        SoulderContent.init();
    }

    private static void registerItems() {
        SoulderItems items = SoulderItems.getInstance();
        items.register((id, item) -> Registry.register(items.getRegistry(), id, item));
        Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(SoulderContent.ID, "soulder_content"),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemGroup.souldercontent"))
                        .icon(items.POKE_COIN_GOLD::getDefaultStack)
                        .entries((displayContext, entries) -> items.all().forEach(item -> entries.add(item.getDefaultStack())))
                        .build()
        );
    }

    private static void registerBlocks() {
        SoulderBlocks blocks = SoulderBlocks.getInstance();
        blocks.register((id, block) -> Registry.register(blocks.getRegistry(), id, block));
    }
}