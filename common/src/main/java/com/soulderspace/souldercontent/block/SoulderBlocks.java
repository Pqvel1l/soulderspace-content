package com.soulderspace.souldercontent.block;

import com.soulderspace.souldercontent.RegistryProvider;
import com.soulderspace.souldercontent.block.custom.*;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class SoulderBlocks extends RegistryProvider<Registry<Block>, RegistryKey<Registry<Block>>, Block> {
    private static final SoulderBlocks INSTANCE = new SoulderBlocks();

    public final Block NORMAL_CHEST = crateBlock("normal_chest", true);
    public final Block MEDIUM_CHEST = crateBlock("medium_chest", true);
    public final Block PREMIUM_CHEST = crateBlock("premium_chest", true);
    public final Block BLACK_SILVER_CRATE = crateBlock("black_silver_crate", false);
    public final Block BLUE_LIGHT_BLUE_CRATE = crateBlock("blue_light_blue_crate", false);
    public final Block BROWN_SILVER_CRATE = crateBlock("brown_silver_crate", false);
    public final Block HALLOWEEN_CRATE = crateBlock("halloween_crate", false);
    public final Block PINK_GREEN_CRATE = crateBlock("pink_green_crate", false);
    public final Block PURPLE_LIGHT_PURPLE_CRATE = crateBlock("purple_light_purple_crate", false);
    public final Block RED_GOLDEN_CRATE = crateBlock("red_golden_crate", false);
    public final Block ZOMBIEFIED_PIGLIN_PLUSHIE = pokedoll_BLOCK("zombified_piglin_plushie");
    public final Block POKEDOLL_ZUBAT = pokedoll_BLOCK("pokedoll_zubat");
    public final Block POKEDOLL_MEWTWO_GILDED = pokedoll_BLOCK("pokedoll_mewtwo_gilded");
    public final Block POKEDOLL_MELOETTA = pokedoll_BLOCK("pokedoll_meloetta");
    public final Block POKEDOLL_ZUBAT_SHINY = pokedoll_BLOCK("pokedoll_zubat_shiny");
    public final Block POKEDOLL_MEWTWO_GILDED_SHINY = pokedoll_BLOCK("pokedoll_mewtwo_gilded_shiny");
    public final Block POKEDOLL_MELOETTA_SHINY = pokedoll_BLOCK("pokedoll_meloetta_shiny");

    public final Block POKEDOLL_BIG_GIRATINA = pokedoll_BLOCK("pokedoll_big_giratina");
    public final Block POKEDOLL_CUBONE = pokedoll_BLOCK("pokedoll_cubone");
    public final Block POKEDOLL_ESPEON = pokedoll_BLOCK("pokedoll_espeon");
    public final Block POKEDOLL_GENGAR = pokedoll_BLOCK("pokedoll_gengar");
    public final Block POKEDOLL_GOLBAT = pokedoll_BLOCK("pokedoll_golbat");
    public final Block POKEDOLL_HOUNDOOM = pokedoll_BLOCK("pokedoll_houndoom");
    public final Block POKEDOLL_HOUNDOUR = pokedoll_BLOCK("pokedoll_houndour");
    public final Block POKEDOLL_LITWICK = pokedoll_BLOCK("pokedoll_litwick");
    public final Block POKEDOLL_MAROWAK = pokedoll_BLOCK("pokedoll_marowak");
    public final Block POKEDOLL_UMBREON = pokedoll_BLOCK("pokedoll_umbreon");
    public final Block POKEDOLL_ZORUA = pokedoll_BLOCK("pokedoll_zorua");

    public final Block POKEDOLL_BIG_GIRATINA_SHINY = pokedoll_BLOCK("pokedoll_big_giratina_shiny");
    public final Block POKEDOLL_CUBONE_SHINY = pokedoll_BLOCK("pokedoll_cubone_shiny");
    public final Block POKEDOLL_ESPEON_SHINY = pokedoll_BLOCK("pokedoll_espeon_shiny");
    public final Block POKEDOLL_GENGAR_SHINY = pokedoll_BLOCK("pokedoll_gengar_shiny");
    public final Block POKEDOLL_GOLBAT_SHINY = pokedoll_BLOCK("pokedoll_golbat_shiny");
    public final Block POKEDOLL_HOUNDOOM_SHINY = pokedoll_BLOCK("pokedoll_houndoom_shiny");
    public final Block POKEDOLL_HOUNDOUR_SHINY = pokedoll_BLOCK("pokedoll_houndour_shiny");
    public final Block POKEDOLL_LITWICK_SHINY = pokedoll_BLOCK("pokedoll_litwick_shiny");
    public final Block POKEDOLL_MAROWAK_SHINY = pokedoll_BLOCK("pokedoll_marowak_shiny");
    public final Block POKEDOLL_UMBREON_SHINY = pokedoll_BLOCK("pokedoll_umbreon_shiny");
    public final Block POKEDOLL_ZORUA_SHINY = pokedoll_BLOCK("pokedoll_zorua_shiny");


    public final Block AUTUMN_LEAVES_CARPET = allTypesLeaves("autumn_leaves_carpet");
    public final Block SPIDERWEB_0 = skeletonBlock("spiderweb_0");
    public final Block SPIDERWEB_1 = skeletonBlock("spiderweb_1");
    public final Block SPIDERWEB_2 = skeletonBlock("spiderweb_2");
    public final Block SPIDERWEB_3 = skeletonBlock("spiderweb_3");
    public final Block SPIDERWEB_4 = skeletonBlock("spiderweb_4");

    public final Block CARVED_EVIL_PUMPKIN = crateBlock("carved_evil_pumpkin",false);
    public final Block CARVED_FRIENDLY_PUMPKIN = crateBlock("carved_friendly_pumpkin",false);
    public final Block CARVED_SCREAMING_PUMPKIN = crateBlock("carved_screaming_pumpkin",false);
    public final Block CARVED_SHOCKED_PUMPKIN = crateBlock("carved_shocked_pumpkin",false);
    public final Block CARVED_SMILE_PUMPKIN = crateBlock("carved_smile_pumpkin",false);
    public final Block FLAT_DIRT_GRAVESTONE = gravehorizontal("flat_dirt_gravestone");
    public final Block FLAT_GRAVESTONE = gravehorizontal("flat_gravestone");
    public final Block GRAVESTONE = gravevertical("gravestone");
    public final Block SLANTED_GRAVESTONE = gravesmall("slanted_gravestone");
    public final Block SQUARE_GRAVESTONE = gravevertical("square_gravestone");
    public final Block SMALL_GRAVESTONE = gravesmall("small_gravestone");
    public final Block HAY_WHEELBARROW = crateBlock("hay_wheelbarrow",true);
    public final Block PUMPKIN_WHEELBARROW = crateBlock("pumpkin_wheelbarrow",true);
    public final Block LARGE_PUMPKIN = crateBlock("large_pumpkin",true);
    public final Block SMALL_PUMPKIN = crateBlock("small_pumpkin",true);
    public final Block MEDIUM_PUMPKIN = crateBlock("medium_pumpkin",true);
    public final Block LIT_EVIL_PUMPKIN = pumpkinLight("lit_evil_pumpkin");
    public final Block LIT_FRIENDLY_PUMPKIN = pumpkinLight("lit_friendly_pumpkin");
    public final Block LIT_SCREAMING_PUMPKIN = pumpkinLight("lit_screaming_pumpkin");
    public final Block LIT_SHOCKED_PUMPKIN = pumpkinLight("lit_shocked_pumpkin");
    public final Block LIT_SMILE_PUMPKIN = pumpkinLight("lit_smile_pumpkin");
    public final Block PAIR_OF_PUMPKINS = crateBlock("pair_of_pumpkins",true);
    public final Block PUMPKIN_BALLOON = ballooned("pumpkin_balloon");
    public final Block PUMPKIN_WALL_DECO_1 = walldecoBlock("pumpkin_wall_deco_1");
    public final Block PUMPKIN_WALL_DECO_2 = walldecoBlock("pumpkin_wall_deco_2");
    public final Block SCARECROW = scareCrow("scarecrow");
    public final Block SITTING_SKELETON = skeletonBlock("sitting_skeleton");
    public final Block SKELETON_BALLOON = ballooned("skeleton_balloon");
    public final Block GHOST_BALLOON = ballooned("ghost_balloon");
    public final Block GHOST = ballooned("ghost");
    public final Block THREE_POTIONS = crateBlock("three_potions",true);
    public final Block THREE_PUMPKINS = crateBlock("three_pumpkins",true);
    public final Block WITCH_CAULDRON = crateBlock("witch_cauldron",false);




    public final Block SKELETON_0 = skeletonBlock("skeleton_0");
    public final Block SKELETON_1 = skeletonBlock("skeleton_1");
    public final Block SKELETON_2 = skeletonBlock("skeleton_2");
    public final Block SKELETON_3 = skeletonBlock("skeleton_3");
    public final Block SKELETON_4 = skeletonBlock("skeleton_4");

    public final Block SCARECROW_0_TOP = scareCrow("scarecrow_0_top");
    public final Block SCARECROW_0_BOTTOM = scareCrow("scarecrow_0_bottom");
    public final Block SCARECROW_1_BOTTOM = scareCrow("scarecrow_1_bottom");
    public final Block SCARECROW_1_TOP = scareCrow("scarecrow_1_top");
    public final Block SCARECROW_2_TOP = scareCrow("scarecrow_2_top");
    public final Block SCARECROW_2_BOTTOM = scareCrow("scarecrow_2_bottom");
    public final Block SCARECROW_3_TOP = scareCrow("scarecrow_3_top");
    public final Block SCARECROW_3_BOTTOM = scareCrow("scarecrow_3_bottom");
    public final Block SCARECROW_4_TOP = scareCrow("scarecrow_4_top");
    public final Block SCARECROW_4_BOTTOM = scareCrow("scarecrow_4_bottom");
    public static SoulderBlocks getInstance() {
        return INSTANCE;
    }

    private SoulderBlocks() {}

    private Block crateBlock(String name, boolean small) {
        return block(name, new CrateBlock(small));
    }
    private Block allTypesLeaves(String name){return block(name, new AutumnLeavesCarpetBlock());}
    private Block skullBlock(String name){return block(name, new LeavesBlock());}
    private Block pumpkinLight(String name){return block(name, new pumpkins());}
    private Block pokedoll_BLOCK(String name){return block(name, new Pokedoll());}
    private Block walldecoBlock(String name){return block(name, new wall_deco());}
    private Block gravehorizontal(String name){return block(name, new gravestone_1());}
    private Block gravevertical(String name){return block(name, new gravestone_vertical());}
    private Block gravesmall(String name){return block(name, new gravestone_small());}
    private Block ballooned(String name){return block(name, new balloons());}
    private Block scareCrow(String name){return block(name, new ScarecroweBox());}
    private Block skeletonBlock(String name){return block(name, new SkeletonsBox());}
    private Block block(String name, Block block) {
        return this.add(name, block);
    }

    @Override
    public Registry<Block> getRegistry() {
        return Registries.BLOCK;
    }

    @Override
    public RegistryKey<Registry<Block>> getRegistryKey() {
        return RegistryKeys.BLOCK;
    }

    @Nullable
    public static Identifier getId(Block block) {
        Map.Entry<Identifier, Block> entry = getInstance().queue.entrySet().stream()
                .filter(e -> e.getValue().equals(block)).findFirst().orElse(null);
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }
}
