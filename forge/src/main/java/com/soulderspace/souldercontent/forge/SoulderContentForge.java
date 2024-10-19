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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SoulderContent.ID)
public class SoulderContentForge {
    private static final Logger LOGGER = LogManager.getLogger(SoulderContentForge.class);
    public SoulderContentForge() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerBlocks);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerItems);
        SoulderContent.init();
    }

    @SubscribeEvent
    public void registerItems(RegisterEvent event) {
        SoulderItems items = SoulderItems.getInstance();

        // Регистрация первой группы предметов (основная группа)
        event.register(items.getRegistryKey(), helper -> items.register(helper::register));
        event.register(
                Registries.ITEM_GROUP.getKey(), helper -> helper.register(new Identifier(SoulderContent.ID, "soulder_content"),
                        ItemGroup.builder()
                                .displayName(Text.translatable("itemGroup.souldercontent"))
                                .icon(items.ENVELOPE::getDefaultStack)  // Иконка для первой вкладки
                                .entries((displayContext, entries) -> items.all().forEach(item -> entries.add(item.getDefaultStack())))
                                .build())
        );

        // Регистрация новой боковой вкладки-массива
        event.register(
                Registries.ITEM_GROUP.getKey(), helper -> helper.register(new Identifier(SoulderContent.ID, "soulder_content_items"),
                        ItemGroup.builder()
                                .displayName(Text.translatable("itemGroup.souldercontent.items"))  // Название новой вкладки
                                .icon(items.DITTO_COIN::getDefaultStack)  // Иконка
                                .entries((displayContext, entries) -> {
                                    // Добавляем предметы по их ID
                                    Identifier[] itemIDs = new Identifier[] {
                                            new Identifier(SoulderContent.ID, "normal_key"),
                                            new Identifier(SoulderContent.ID, "medium_key"),
                                            new Identifier(SoulderContent.ID, "premium_key"),
                                            new Identifier(SoulderContent.ID, "halloween_key"),
                                            new Identifier(SoulderContent.ID, "black_silver_key"),
                                            new Identifier(SoulderContent.ID, "blue_light_blue_key"),
                                            new Identifier(SoulderContent.ID, "brown_silver_key"),
                                            new Identifier(SoulderContent.ID, "pink_green_key"),
                                            new Identifier(SoulderContent.ID, "purple_light_purple_key"),
                                            new Identifier(SoulderContent.ID, "red_golden_key"),
                                            new Identifier(SoulderContent.ID, "aegis_badge"),
                                            new Identifier(SoulderContent.ID, "aphid_badge"),
                                            new Identifier(SoulderContent.ID, "blight_badge"),
                                            new Identifier(SoulderContent.ID, "crest_badge"),
                                            new Identifier(SoulderContent.ID, "dewdrop_badge"),
                                            new Identifier(SoulderContent.ID, "esper_badge"),
                                            new Identifier(SoulderContent.ID, "fable_badge"),
                                            new Identifier(SoulderContent.ID, "garden_badge"),
                                            new Identifier(SoulderContent.ID, "glacier_badge"),
                                            new Identifier(SoulderContent.ID, "harmony_badge"),
                                            new Identifier(SoulderContent.ID, "inferno_badge"),
                                            new Identifier(SoulderContent.ID, "master_badge"),
                                            new Identifier(SoulderContent.ID, "melee_badge"),
                                            new Identifier(SoulderContent.ID, "mythos_badge"),
                                            new Identifier(SoulderContent.ID, "phantom_badge"),
                                            new Identifier(SoulderContent.ID, "quarry_badge"),
                                            new Identifier(SoulderContent.ID, "sand_badge"),
                                            new Identifier(SoulderContent.ID, "tesla_badge"),
                                            new Identifier(SoulderContent.ID, "suspicious_rubber"),
                                            new Identifier(SoulderContent.ID, "suspicious_cloth"),
                                            new Identifier(SoulderContent.ID, "suspicious_string"),
                                            new Identifier(SoulderContent.ID, "envelope"),
                                            new Identifier(SoulderContent.ID, "bulba_coin"),
                                            new Identifier(SoulderContent.ID, "g.coin"),
                                            new Identifier(SoulderContent.ID, "c.coin_1"),
                                            new Identifier(SoulderContent.ID, "supercoin"),
                                            new Identifier(SoulderContent.ID, "shiny"),
                                            new Identifier(SoulderContent.ID, "copper_coincabu"),
                                            new Identifier(SoulderContent.ID, "fullmetal_coincabu"),
                                            new Identifier(SoulderContent.ID, "golden_coincabu"),
                                            new Identifier(SoulderContent.ID, "ditto_coin"),
                                            new Identifier(SoulderContent.ID, "ticket"),
                                            new Identifier(SoulderContent.ID, "fdefender_sword"),
                                            new Identifier(SoulderContent.ID, "wilt_sword"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnbrendanhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmncalemhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmncalemhatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmndawnhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmndawnhatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmneliohat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmneliohatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmngloriahat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmngloriahatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmngoldhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmngoldhatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmngoomyhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnhilberthat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnhilberthatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnhildahat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnhoppiphat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnkrishat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnleafhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnleafhatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnlucashat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnlucashatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnmayhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnmayhatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnnatehat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnnatehatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnpsycap"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnredhat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnredhatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnrosahat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnrosahatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnselenehat"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnselenehatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnserenahatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnsylveonears"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnumbreoncap"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnvictorhatnh"),
                                            new Identifier(SoulderContent.ID, "pokehats/pkmnvictorhat")

                                            // добавьте остальные ID по необходимости
                                    };

                                    for (Identifier itemID : itemIDs) {
                                        var item = Registries.ITEM.get(itemID);

                                        // Проверяем, что предмет существует, прежде чем добавлять его
                                        if (item != null) {
                                            entries.add(item.getDefaultStack());
//                                            LOGGER.warn("Предмет с ID " + itemID + " не найден в реестре.");
                                        }
                                    }
                                })
                                .build())
        );
        event.register(
                Registries.ITEM_GROUP.getKey(), helper -> helper.register(new Identifier(SoulderContent.ID, "soulder_content_blocks_crates"),
                        ItemGroup.builder()
                                .displayName(Text.translatable("itemGroup.souldercontent.blocks_crates"))  // Название новой вкладки
                                .icon(items.SCARECROW_3_TOP::getDefaultStack)  // Иконка
                                .entries((displayContext, entries) -> {
                                    // Добавляем предметы по их ID
                                    Identifier[] itemIDs = new Identifier[] {
                                            new Identifier(SoulderContent.ID, "normal_chest"),
                                            new Identifier(SoulderContent.ID, "medium_chest"),
                                            new Identifier(SoulderContent.ID, "premium_chest"),
                                            new Identifier(SoulderContent.ID, "halloween_crate"),
                                            new Identifier(SoulderContent.ID, "black_silver_crate"),
                                            new Identifier(SoulderContent.ID, "blue_light_blue_crate"),
                                            new Identifier(SoulderContent.ID, "brown_silver_crate"),
                                            new Identifier(SoulderContent.ID, "pink_green_crate"),
                                            new Identifier(SoulderContent.ID, "purple_light_purple_crate"),
                                            new Identifier(SoulderContent.ID, "red_golden_crate"),
                                            new Identifier(SoulderContent.ID, "autumn_leaves_carpet_0"),
                                            new Identifier(SoulderContent.ID, "spiderweb_0"),
                                            new Identifier(SoulderContent.ID, "spiderweb_1"),
                                            new Identifier(SoulderContent.ID, "spiderweb_2"),
                                            new Identifier(SoulderContent.ID, "spiderweb_3"),
                                            new Identifier(SoulderContent.ID, "spiderweb_4"),
                                            new Identifier(SoulderContent.ID, "skeleton_0"),
                                            new Identifier(SoulderContent.ID, "skeleton_1"),
                                            new Identifier(SoulderContent.ID, "skeleton_2"),
                                            new Identifier(SoulderContent.ID, "skeleton_3"),
                                            new Identifier(SoulderContent.ID, "skeleton_4"),
                                            new Identifier(SoulderContent.ID, "scarecrow_0_top"),
                                            new Identifier(SoulderContent.ID, "scarecrow_1_top"),
                                            new Identifier(SoulderContent.ID, "scarecrow_2_top"),
                                            new Identifier(SoulderContent.ID, "scarecrow_3_top"),
                                            new Identifier(SoulderContent.ID, "scarecrow_4_top"),
                                            new Identifier(SoulderContent.ID, "scarecrow_0_bottom"),
                                            new Identifier(SoulderContent.ID, "scarecrow_1_bottom"),
                                            new Identifier(SoulderContent.ID, "scarecrow_2_bottom"),
                                            new Identifier(SoulderContent.ID, "scarecrow_3_bottom"),
                                            new Identifier(SoulderContent.ID, "scarecrow_4_bottom")
                                            // добавьте остальные ID по необходимости
                                    };

                                    for (Identifier itemID : itemIDs) {
                                        var item = Registries.ITEM.get(itemID);

                                        // Проверяем, что предмет существует, прежде чем добавлять его
                                        if (item != null) {
                                            entries.add(item.getDefaultStack());

//                                            LOGGER.warn("Предмет с ID " + itemID + " не найден в реестре.");
                                        }
                                    }
                                })
                                .build())
        );
        event.register(
                Registries.ITEM_GROUP.getKey(), helper -> helper.register(new Identifier(SoulderContent.ID, "soulder_content_side_tab"),
                        ItemGroup.builder()
                                .displayName(Text.translatable("itemGroup.souldercontent.plushies"))  // Название новой вкладки
                                .icon(items.PSYCAP::getDefaultStack)  // Иконка
                                .entries((displayContext, entries) -> {
                                    // Добавляем предметы по их ID
                                    Identifier[] itemIDs = new Identifier[] {
                                            new Identifier(SoulderContent.ID, "pokedoll_meloetta_shiny"),
                                            new Identifier(SoulderContent.ID, "pokedoll_meloetta"),
                                            new Identifier(SoulderContent.ID, "pokedoll_mewtwo_gilded_shiny"),
                                            new Identifier(SoulderContent.ID, "pokedoll_mewtwo_gilded"),
                                            new Identifier(SoulderContent.ID, "pokedoll_zubat_shiny"),
                                            new Identifier(SoulderContent.ID, "pokedoll_zubat"),
                                            new Identifier(SoulderContent.ID, "zombified_piglin_plushie")
                                            // добавьте остальные ID по необходимости
                                    };

                                    for (Identifier itemID : itemIDs) {
                                        var item = Registries.ITEM.get(itemID);

                                        // Проверяем, что предмет существует, прежде чем добавлять его
                                        if (item != null) {
                                            entries.add(item.getDefaultStack());
                                            LOGGER.warn("Предмет с ID " + itemID + " не найден в реестре.");
                                        }
                                    }
                                })
                                .build())
        );
    }



    @SubscribeEvent
    public void registerBlocks(RegisterEvent event) {
        SoulderBlocks blocks = SoulderBlocks.getInstance();
        event.register(blocks.getRegistryKey(), helper -> blocks.register(helper::register));
    }
}
