package com.soulderspace.souldercontent.item;

import com.soulderspace.souldercontent.RegistryProvider;
import com.soulderspace.souldercontent.block.SoulderBlocks;
import com.soulderspace.souldercontent.item.custom.PokeHatItem;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class SoulderItems extends RegistryProvider<Registry<Item>, RegistryKey<Registry<Item>>, Item> {
    private static final SoulderItems INSTANCE = new SoulderItems();

    public final Item FALLEN_DEFENDER = item("fdefender_sword", new SwordItem(ToolMaterials.DIAMOND, 1000, 100, new Item.Settings().maxCount(1)));
//    public final Item POKE_COIN_BRONZE = genericItem("poke_coin_bronze");
//    public final Item POKE_COIN_SILVER = genericItem("poke_coin_silver");
//    public final Item POKE_COIN_GOLD = genericItem("poke_coin_gold")
    public final Item ENVELOPE = genericItem("envelope");
    public final Item SUSPICIOUS_CLOTH = genericItem("suspicious_cloth");
    public final Item SUSPICIOUS_RUBBER = genericItem("suspicious_rubber");
    public final Item SUSPICIOUS_STRING = genericItem("suspicious_string");
    public final Item BULBA_COIN = genericItem("bulba_coin");
    public final Item G_COIN = genericItem("g.coin");
    public final Item C_COIN = genericItem("c.coin_1");
    public final Item COPPER_COINCABU = genericItem("copper_coincabu");
    public final Item DITTO_COIN = genericItem("ditto_coin");
    public final Item FULLMETAL_COINCABU = genericItem("fullmetal_coincabu");
    public final Item GOLDEN_COINCABU = genericItem("golden_coincabu");
    public final Item SHINY = genericItem("shiny");
    public final Item SUPERCOIN = genericItem("supercoin");
    public final Item TICKET = genericItem("ticket");

    public final Item BRENDAN_HAT = hat("brendanhat");
    public final Item CALEM_HAT = hat("calemhat");
    public final Item CALEM_HAT_NH = hat("calemhatnh");
    public final Item DAWN_HAT = hat("dawnhat");
    public final Item DAWN_HAT_NH = hat("dawnhatnh");
    public final Item NELIO_HAT = hat("eliohat");
    public final Item NELIO_HAT_NH = hat("eliohatnh");
    public final Item GLORIA_HAT = hat("gloriahat");
    public final Item GLORIA_HAT_NH = hat("gloriahatnh");
    public final Item GOLD_HAT = hat("goldhat");
    public final Item GOLD_HAT_NH = hat("goldhatnh");
    public final Item HILBERT_HAT = hat("hilberthat");
    public final Item HILBERT_HAT_NH = hat("hilberthatnh");
    public final Item HILDA_HAT = hat("hildahat");
    public final Item HILDA_HAT_NH = hat("hildahatnh");
    public final Item KRIS_HAT = hat("krishat");
    public final Item LEAF_HAT = hat("leafhat");
    public final Item LEAF_HAT_NH = hat("leafhatnh");
    public final Item LUCAS_HAT = hat("lucashat");
    public final Item LUCAS_HAT_NH = hat("lucashatnh");
    public final Item MAY_HAT = hat("mayhat");
    public final Item MAY_HAT_NH = hat("mayhatnh");
    public final Item NATE_HAT = hat("natehat");
    public final Item NATE_HAT_NH = hat("natehatnh");
    public final Item RED_HAT = hat("redhat");
    public final Item RED_HAT_NH = hat("redhatnh");
    public final Item ROSA_HAT = hat("rosahat");
    public final Item ROSA_HAT_NH = hat("rosahatnh");
    public final Item SELENE_HAT = hat("selenehat");
    public final Item SELENE_HAT_NH = hat("selenehatnh");
    public final Item SERENA_HAT = hat("serenahat");
    public final Item SERENA_HAT_NH = hat("serenahatnh");
    public final Item VICTOR_HAT = hat("victorhat");
    public final Item VICTOR_HAT_NH = hat("victorhatnh");

    public final Item AEGIS_BADGE = genericItem("aegis_badge");
    public final Item APHID_BADGE = genericItem("aphid_badge");
    public final Item BLIGHT_BADGE = genericItem("blight_badge");
    public final Item CREST_BADGE = genericItem("crest_badge");
    public final Item DEWDROP_BADGE = genericItem("dewdrop_badge");
    public final Item DUSK_BADGE = genericItem("dusk_badge");
    public final Item ESPER_BADGE = genericItem("esper_badge");
    public final Item FABLE_BADGE = genericItem("fable_badge");
    public final Item GARDEN_BADGE = genericItem("garden_badge");
    public final Item GLACIER_BADGE = genericItem("glacier_badge");
    public final Item HARMONY_BADGE = genericItem("harmony_badge");
    public final Item INFERNO_BADGE = genericItem("inferno_badge");
    public final Item MASTER_BADGE = genericItem("master_badge");
    public final Item MELEE_BADGE = genericItem("melee_badge");
    public final Item MYTHOS_BADGE = genericItem("mythos_badge");
    public final Item PHANTOM_BADGE = genericItem("phantom_badge");
    public final Item QUARRY_BADGE = genericItem("quarry_badge");
    public final Item SAND_BADGE = genericItem("sand_badge");
    public final Item TESLA_BADGE = genericItem("tesla_badge");

    public final Item NORMAL_KEY = genericItem("normal_key");
    public final Item MEDIUM_KEY = genericItem("medium_key");
    public final Item PREMIUM_KEY = genericItem("premium_key");
    public final Item BLACK_SILVER_KEY = genericItem("black_silver_key");
    public final Item BLUE_LIGHT_BLUE_KEY = genericItem("blue_light_blue_key");
    public final Item BROWN_SILVER_KEY = genericItem("brown_silver_key");
    public final Item PINK_GREEN_KEY = genericItem("pink_green_key");
    public final Item PURPLE_LIGHT_PURPLE_KEY = genericItem("purple_light_purple_key");
    public final Item RED_GOLDEN_KEY = genericItem("red_golden_key");

    public final Item NORMAL_CHEST = blockItem("normal_chest", SoulderBlocks.getInstance().NORMAL_CHEST);
    public final Item MEDIUM_CHEST = blockItem("medium_chest", SoulderBlocks.getInstance().MEDIUM_CHEST);
    public final Item PREMIUM_CHEST = blockItem("premium_chest", SoulderBlocks.getInstance().PREMIUM_CHEST);
    public final Item BLACK_SILVER_CRATE = blockItem("black_silver_crate", SoulderBlocks.getInstance().BLACK_SILVER_CRATE);
    public final Item BLUE_LIGHT_BLUE_CRATE = blockItem("blue_light_blue_crate", SoulderBlocks.getInstance().BLUE_LIGHT_BLUE_CRATE);
    public final Item BROWN_SILVER_CRATE = blockItem("brown_silver_crate", SoulderBlocks.getInstance().BROWN_SILVER_CRATE);
    public final Item PINK_GREEN_CRATE = blockItem("pink_green_crate", SoulderBlocks.getInstance().PINK_GREEN_CRATE);
    public final Item PURPLE_LIGHT_PURPLE_CRATE = blockItem("purple_light_purple_crate", SoulderBlocks.getInstance().PURPLE_LIGHT_PURPLE_CRATE);
    public final Item RED_GOLDEN_CRATE = blockItem("red_golden_crate", SoulderBlocks.getInstance().RED_GOLDEN_CRATE);

    public static SoulderItems getInstance() {
        return INSTANCE;
    }

    private SoulderItems() {}

    private Item hat(String name) {
        return item( "pokehats/pkmn" + name, new PokeHatItem(new Item.Settings().maxCount(1)));
    }

    private Item blockItem(String name, Block block) {
        return add(name, new BlockItem(block, new Item.Settings()));
    }

    private Item genericItem(String name) {
        return item(name, new Item(new Item.Settings()));
    }

    private Item item(String name, Item item) {
        return this.add(name, item);
    }

    @Override
    public Registry<Item> getRegistry() {
        return Registries.ITEM;
    }

    @Override
    public RegistryKey<Registry<Item>> getRegistryKey() {
        return RegistryKeys.ITEM;
    }
}