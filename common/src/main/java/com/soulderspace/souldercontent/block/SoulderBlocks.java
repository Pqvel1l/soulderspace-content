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
    public final Block PINK_GREEN_CRATE = crateBlock("pink_green_crate", false);
    public final Block PURPLE_LIGHT_PURPLE_CRATE = crateBlock("purple_light_purple_crate", false);
    public final Block RED_GOLDEN_CRATE = crateBlock("red_golden_crate", false);
    public final Block ZOMBIEFIED_PIGLIN_PLUSHIE = crateBlock("zombified_piglin_plushie", true);
    public final Block POKEDOLL_ZUBAT = crateBlock("pokedoll_zubat", true);
    public final Block POKEDOLL_MEWTWO_GILDED = crateBlock("pokedoll_mewtwo_gilded", true);
    public final Block POKEDOLL_MELOETTA = crateBlock("pokedoll_meloetta", true);

    public final Block AUTUMN_LEAVES_CARPET = allTypesLeaves("autumn_leaves_carpet");
    public final Block SPIDERWEB_0 = skeletonBlock("spiderweb_0");
    public final Block SPIDERWEB_1 = skeletonBlock("spiderweb_1");
    public final Block SPIDERWEB_2 = skeletonBlock("spiderweb_2");
    public final Block SPIDERWEB_3 = skeletonBlock("spiderweb_3");
    public final Block SPIDERWEB_4 = skeletonBlock("spiderweb_4");

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
