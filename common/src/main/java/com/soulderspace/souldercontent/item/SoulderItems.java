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
import net.minecraft.util.Rarity;

public class SoulderItems extends RegistryProvider<Registry<Item>, RegistryKey<Registry<Item>>, Item> {
    private static final SoulderItems INSTANCE = new SoulderItems();

    public final Item FALLEN_DEFENDER = item("fdefender_sword", new SwordItem(ToolMaterials.NETHERITE, 11, 1.6f, new Item.Settings().maxCount(1).maxDamage(16)));
    public final Item WILT_SWORD = item("wilt_sword", new SwordItem(ToolMaterials.NETHERITE, 9, 1.2f, new Item.Settings().maxCount(1).maxDamage(31)));
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
    public final Item GOOMYHAT= hat("goomyhat");
    public final Item HOPPIPHAT = hat("hoppiphat");
    public final Item PSYCAP = hat("psycap");
    public final Item SYLVEONEARS = hat("sylveonears");
    public final Item UMBREONCAP = hat("umbreoncap");
    public final Item WITCH_HAT = hat("witch_hat");


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
    public final Item HALLOWEEN_KEY = genericItem("halloween_key");
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

    public final Item HALLOWEEN_CRATE = blockItem("halloween_crate", SoulderBlocks.getInstance().HALLOWEEN_CRATE);

    public final Item BLUE_LIGHT_BLUE_CRATE = blockItem("blue_light_blue_crate", SoulderBlocks.getInstance().BLUE_LIGHT_BLUE_CRATE);
    public final Item BROWN_SILVER_CRATE = blockItem("brown_silver_crate", SoulderBlocks.getInstance().BROWN_SILVER_CRATE);
    public final Item PINK_GREEN_CRATE = blockItem("pink_green_crate", SoulderBlocks.getInstance().PINK_GREEN_CRATE);
    public final Item PURPLE_LIGHT_PURPLE_CRATE = blockItem("purple_light_purple_crate", SoulderBlocks.getInstance().PURPLE_LIGHT_PURPLE_CRATE);
    public final Item RED_GOLDEN_CRATE = blockItem("red_golden_crate", SoulderBlocks.getInstance().RED_GOLDEN_CRATE);

    public final Item ZOMBIEFIED_PIGLIN_PLUSHIE = blockItem("zombified_piglin_plushie", SoulderBlocks.getInstance().ZOMBIEFIED_PIGLIN_PLUSHIE);
    public final Item POKEDOLL_ZUBAT = blockItem("pokedoll_zubat", SoulderBlocks.getInstance().POKEDOLL_ZUBAT);
    public final Item POKEDOLL_MEWTWO_GILDED = blockItem("pokedoll_mewtwo_gilded", SoulderBlocks.getInstance().POKEDOLL_MEWTWO_GILDED);
    public final Item POKEDOLL_MELOETTA = blockItem("pokedoll_meloetta", SoulderBlocks.getInstance().POKEDOLL_MELOETTA);

    public final Item POKEDOLL_ZUBAT_SHINY = blockItem("pokedoll_zubat_shiny", SoulderBlocks.getInstance().POKEDOLL_ZUBAT_SHINY);
    public final Item POKEDOLL_MEWTWO_GILDED_SHINY = blockItem("pokedoll_mewtwo_gilded_shiny", SoulderBlocks.getInstance().POKEDOLL_MEWTWO_GILDED_SHINY);
    public final Item POKEDOLL_MELOETTA_SHINY = blockItem("pokedoll_meloetta_shiny", SoulderBlocks.getInstance().POKEDOLL_MELOETTA_SHINY);

    public final Item POKEDOLL_BIG_GIRATINA = blockItem("pokedoll_big_giratina", SoulderBlocks.getInstance().POKEDOLL_BIG_GIRATINA);
    public final Item POKEDOLL_CUBONE = blockItem("pokedoll_cubone", SoulderBlocks.getInstance().POKEDOLL_CUBONE);
    public final Item POKEDOLL_ESPEON = blockItem("pokedoll_espeon", SoulderBlocks.getInstance().POKEDOLL_ESPEON);
    public final Item POKEDOLL_GENGAR = blockItem("pokedoll_gengar", SoulderBlocks.getInstance().POKEDOLL_GENGAR);
    public final Item POKEDOLL_GOLBAT = blockItem("pokedoll_golbat", SoulderBlocks.getInstance().POKEDOLL_GOLBAT);
    public final Item POKEDOLL_HOUNDOOM = blockItem("pokedoll_houndoom", SoulderBlocks.getInstance().POKEDOLL_HOUNDOOM);
    public final Item POKEDOLL_HOUNDOUR = blockItem("pokedoll_houndour", SoulderBlocks.getInstance().POKEDOLL_HOUNDOUR);
    public final Item POKEDOLL_LITWICK = blockItem("pokedoll_litwick", SoulderBlocks.getInstance().POKEDOLL_LITWICK);
    public final Item POKEDOLL_MAROWAK = blockItem("pokedoll_marowak", SoulderBlocks.getInstance().POKEDOLL_MAROWAK);
    public final Item POKEDOLL_UMBREON = blockItem("pokedoll_umbreon", SoulderBlocks.getInstance().POKEDOLL_UMBREON);
    public final Item POKEDOLL_ZORUA = blockItem("pokedoll_zorua", SoulderBlocks.getInstance().POKEDOLL_ZORUA);

    public final Item POKEDOLL_BIG_GIRATINA_SHINY = blockItem("pokedoll_big_giratina_shiny", SoulderBlocks.getInstance().POKEDOLL_BIG_GIRATINA_SHINY);
    public final Item POKEDOLL_CUBONE_SHINY = blockItem("pokedoll_cubone_shiny", SoulderBlocks.getInstance().POKEDOLL_CUBONE_SHINY);
    public final Item POKEDOLL_ESPEON_SHINY = blockItem("pokedoll_espeon_shiny", SoulderBlocks.getInstance().POKEDOLL_ESPEON_SHINY);
    public final Item POKEDOLL_GENGAR_SHINY = blockItem("pokedoll_gengar_shiny", SoulderBlocks.getInstance().POKEDOLL_GENGAR_SHINY);
    public final Item POKEDOLL_GOLBAT_SHINY = blockItem("pokedoll_golbat_shiny", SoulderBlocks.getInstance().POKEDOLL_GOLBAT_SHINY);
    public final Item POKEDOLL_HOUNDOOM_SHINY = blockItem("pokedoll_houndoom_shiny", SoulderBlocks.getInstance().POKEDOLL_HOUNDOOM_SHINY);
    public final Item POKEDOLL_HOUNDOUR_SHINY = blockItem("pokedoll_houndour_shiny", SoulderBlocks.getInstance().POKEDOLL_HOUNDOUR_SHINY);
    public final Item POKEDOLL_LITWICK_SHINY = blockItem("pokedoll_litwick_shiny", SoulderBlocks.getInstance().POKEDOLL_LITWICK_SHINY);
    public final Item POKEDOLL_MAROWAK_SHINY = blockItem("pokedoll_marowak_shiny", SoulderBlocks.getInstance().POKEDOLL_MAROWAK_SHINY);
    public final Item POKEDOLL_UMBREON_SHINY = blockItem("pokedoll_umbreon_shiny", SoulderBlocks.getInstance().POKEDOLL_UMBREON_SHINY);
    public final Item POKEDOLL_ZORUA_SHINY = blockItem("pokedoll_zorua_shiny", SoulderBlocks.getInstance().POKEDOLL_ZORUA_SHINY);


    public final Item CARVED_EVIL_PUMPKIN = blockItem("carved_evil_pumpkin", SoulderBlocks.getInstance().CARVED_EVIL_PUMPKIN);
    public final Item CARVED_FRIENDLY_PUMPKIN = blockItem("carved_friendly_pumpkin", SoulderBlocks.getInstance().CARVED_FRIENDLY_PUMPKIN);
    public final Item CARVED_SCREAMING_PUMPKIN = blockItem("carved_screaming_pumpkin", SoulderBlocks.getInstance().CARVED_SCREAMING_PUMPKIN);
    public final Item CARVED_SHOCKED_PUMPKIN = blockItem("carved_shocked_pumpkin", SoulderBlocks.getInstance().CARVED_SHOCKED_PUMPKIN);
    public final Item CARVED_SMILE_PUMPKIN = blockItem("carved_smile_pumpkin", SoulderBlocks.getInstance().CARVED_SMILE_PUMPKIN);
    public final Item FLAT_DIRT_GRAVESTONE = blockItem("flat_dirt_gravestone", SoulderBlocks.getInstance().FLAT_DIRT_GRAVESTONE);
    public final Item FLAT_GRAVESTONE = blockItem("flat_gravestone", SoulderBlocks.getInstance().FLAT_GRAVESTONE);
    public final Item GRAVESTONE = blockItem("gravestone", SoulderBlocks.getInstance().GRAVESTONE);
    public final Item SLANTED_GRAVESTONE = blockItem("slanted_gravestone", SoulderBlocks.getInstance().SLANTED_GRAVESTONE);
    public final Item SQUARE_GRAVESTONE = blockItem("square_gravestone", SoulderBlocks.getInstance().SQUARE_GRAVESTONE);
    public final Item SMALL_GRAVESTONE = blockItem("small_gravestone", SoulderBlocks.getInstance().SMALL_GRAVESTONE);
    public final Item HAY_WHEELBARROW = blockItem("hay_wheelbarrow", SoulderBlocks.getInstance().HAY_WHEELBARROW);
    public final Item PUMPKIN_WHEELBARROW = blockItem("pumpkin_wheelbarrow", SoulderBlocks.getInstance().PUMPKIN_WHEELBARROW);
    public final Item LARGE_PUMPKIN = blockItem("large_pumpkin", SoulderBlocks.getInstance().LARGE_PUMPKIN);
    public final Item SMALL_PUMPKIN = blockItem("small_pumpkin", SoulderBlocks.getInstance().SMALL_PUMPKIN);
    public final Item MEDIUM_PUMPKIN = blockItem("medium_pumpkin", SoulderBlocks.getInstance().MEDIUM_PUMPKIN);
    public final Item LIT_EVIL_PUMPKIN = blockItem("lit_evil_pumpkin", SoulderBlocks.getInstance().LIT_EVIL_PUMPKIN);
    public final Item LIT_FRIENDLY_PUMPKIN = blockItem("lit_friendly_pumpkin", SoulderBlocks.getInstance().LIT_FRIENDLY_PUMPKIN);
    public final Item LIT_SCREAMING_PUMPKIN = blockItem("lit_screaming_pumpkin", SoulderBlocks.getInstance().LIT_SCREAMING_PUMPKIN);
    public final Item LIT_SHOCKED_PUMPKIN = blockItem("lit_shocked_pumpkin", SoulderBlocks.getInstance().LIT_SHOCKED_PUMPKIN);
    public final Item LIT_SMILE_PUMPKIN = blockItem("lit_smile_pumpkin", SoulderBlocks.getInstance().LIT_SMILE_PUMPKIN);
    public final Item PAIR_OF_PUMPKINS = blockItem("pair_of_pumpkins", SoulderBlocks.getInstance().PAIR_OF_PUMPKINS);
    public final Item PUMPKIN_BALLOON = blockItem("pumpkin_balloon", SoulderBlocks.getInstance().PUMPKIN_BALLOON);
    public final Item PUMPKIN_WALL_DECO_1 = blockItem("pumpkin_wall_deco_1", SoulderBlocks.getInstance().PUMPKIN_WALL_DECO_1);
    public final Item PUMPKIN_WALL_DECO_2 = blockItem("pumpkin_wall_deco_2", SoulderBlocks.getInstance().PUMPKIN_WALL_DECO_2);
    public final Item SCARECROW = blockItem("scarecrow", SoulderBlocks.getInstance().SCARECROW);
    public final Item SITTING_SKELETON = blockItem("sitting_skeleton", SoulderBlocks.getInstance().SITTING_SKELETON);
    public final Item SKELETON_BALLOON = blockItem("skeleton_balloon", SoulderBlocks.getInstance().SKELETON_BALLOON);
    public final Item THREE_POTIONS = blockItem("three_potions", SoulderBlocks.getInstance().THREE_POTIONS);
    public final Item THREE_PUMPKINS = blockItem("three_pumpkins", SoulderBlocks.getInstance().THREE_PUMPKINS);
    public final Item GHOST_BALLOON = blockItem("ghost_balloon", SoulderBlocks.getInstance().GHOST_BALLOON);
    public final Item GHOST = blockItem("ghost", SoulderBlocks.getInstance().GHOST);
    public final Item WITCH_CAULDRON = blockItem("witch_cauldron", SoulderBlocks.getInstance().WITCH_CAULDRON);


    public final Item AUTUMN_LEAVES_CARPET_0 = blockItem("autumn_leaves_carpet_0", SoulderBlocks.getInstance().AUTUMN_LEAVES_CARPET);


    public final Item SPIDERWEB_0 = blockItem("spiderweb_0", SoulderBlocks.getInstance().SPIDERWEB_0);
    public final Item SPIDERWEB_1 = blockItem("spiderweb_1", SoulderBlocks.getInstance().SPIDERWEB_1);
    public final Item SPIDERWEB_2 = blockItem("spiderweb_2", SoulderBlocks.getInstance().SPIDERWEB_2);
    public final Item SPIDERWEB_3 = blockItem("spiderweb_3", SoulderBlocks.getInstance().SPIDERWEB_3);
    public final Item SPIDERWEB_4 = blockItem("spiderweb_4", SoulderBlocks.getInstance().SPIDERWEB_4);

    public final Item SKELETON_0 = blockItem("skeleton_0", SoulderBlocks.getInstance().SKELETON_0);
    public final Item SKELETON_1 = blockItem("skeleton_1", SoulderBlocks.getInstance().SKELETON_1);
    public final Item SKELETON_2 = blockItem("skeleton_2", SoulderBlocks.getInstance().SKELETON_2);
    public final Item SKELETON_3 = blockItem("skeleton_3", SoulderBlocks.getInstance().SKELETON_3);
    public final Item SKELETON_4 = blockItem("skeleton_4", SoulderBlocks.getInstance().SKELETON_4);

    public final Item SCARECROW_0_BOTTOM = blockItem("scarecrow_0_bottom", SoulderBlocks.getInstance().SCARECROW_0_BOTTOM);
    public final Item SCARECROW_0_TOP = blockItem("scarecrow_0_top", SoulderBlocks.getInstance().SCARECROW_0_TOP);

    public final Item SCARECROW_1_BOTTOM = blockItem("scarecrow_1_bottom", SoulderBlocks.getInstance().SCARECROW_1_BOTTOM);
    public final Item SCARECROW_1_TOP = blockItem("scarecrow_1_top", SoulderBlocks.getInstance().SCARECROW_1_TOP);

    public final Item SCARECROW_2_BOTTOM = blockItem("scarecrow_2_bottom", SoulderBlocks.getInstance().SCARECROW_2_BOTTOM);
    public final Item SCARECROW_2_TOP = blockItem("scarecrow_2_top", SoulderBlocks.getInstance().SCARECROW_2_TOP);

    public final Item SCARECROW_3_BOTTOM = blockItem("scarecrow_3_bottom", SoulderBlocks.getInstance().SCARECROW_3_BOTTOM);
    public final Item SCARECROW_3_TOP = blockItem("scarecrow_3_top", SoulderBlocks.getInstance().SCARECROW_3_TOP);

    public final Item SCARECROW_4_BOTTOM = blockItem("scarecrow_4_bottom", SoulderBlocks.getInstance().SCARECROW_4_BOTTOM);
    public final Item SCARECROW_4_TOP = blockItem("scarecrow_4_top", SoulderBlocks.getInstance().SCARECROW_4_TOP);

    public static SoulderItems getInstance() {
        return INSTANCE;
    }

    private SoulderItems() {}

    private Item hat(String name) {
        return item( "pokehats/" + name, new PokeHatItem(new Item.Settings()
                .maxCount(1)
        ));
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
