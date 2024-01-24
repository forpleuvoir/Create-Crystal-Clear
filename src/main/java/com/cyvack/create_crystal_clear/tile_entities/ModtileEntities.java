package com.cyvack.create_crystal_clear.tile_entities;

import com.cyvack.create_crystal_clear.Create_Crystal_Clear;
import com.cyvack.create_crystal_clear.blocks.CrystalClearTab;
import com.cyvack.create_crystal_clear.blocks.ModBlocks;
//import com.cyvack.create_crystal_clear.blocks.compat.AlloyedCompatBlocks;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
//import com.simibubi.create.content.contraptions.relays.elementary.SimpleKineticTileEntity;
//import com.simibubi.create.content.contraptions.relays.encased.EncasedCogInstance;
//import com.simibubi.create.content.contraptions.relays.encased.EncasedCogRenderer;
//import com.simibubi.create.content.contraptions.relays.encased.ShaftInstance;
//import com.simibubi.create.content.contraptions.relays.encased.ShaftRenderer;
import com.simibubi.create.content.kinetics.base.ShaftInstance;
import com.simibubi.create.content.kinetics.base.ShaftRenderer;
import com.simibubi.create.content.kinetics.simpleRelays.SimpleKineticBlockEntity;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedCogInstance;
import com.simibubi.create.content.kinetics.simpleRelays.encased.EncasedCogRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModtileEntities {
    private static final CreateRegistrate REGISTRATE = Create_Crystal_Clear.registrate().setCreativeTab(CrystalClearTab.GLASS_TAB);

    /////////

    //Glass Encased Shafts
    public static final BlockEntityEntry<KineticBlockEntity> GLASS_ENCASED_SHAFT = REGISTRATE
            .blockEntity("glass_encased_shaft", KineticBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(ModBlocks.ANDESITE_GLASS_ENCASED_SHAFT, ModBlocks.ANDESITE_CLEAR_GLASS_ENCASED_SHAFT,
                    ModBlocks.BRASS_GLASS_ENCASED_SHAFT, ModBlocks.BRASS_CLEAR_GLASS_ENCASED_SHAFT,
                    ModBlocks.TRAIN_GLASS_ENCASED_SHAFT, ModBlocks.TRAIN_CLEAR_GLASS_ENCASED_SHAFT,
                    ModBlocks.EMPTY_BLOCK
//					(Create_Crystal_Clear.isAlloyedLoaded ? AlloyedCompatBlocks.STEEL_GLASS_ENCASED_SHAFT : ModBlocks.EMPTY_BLOCK)
            )
            .renderer(() -> ShaftRenderer::new)
            .register();

    //Glass Encased Small Cogs
    public static final BlockEntityEntry<SimpleKineticBlockEntity> GLASS_ENCASED_COG = REGISTRATE
            .blockEntity("glass_encased_cog", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::small, false)
            .validBlocks(ModBlocks.ANDESITE_GLASS_ENCASED_COGWHEEL,
                    ModBlocks.ANDESITE_CLEAR_GLASS_ENCASED_COGWHEEL,
                    ModBlocks.BRASS_GLASS_ENCASED_COGWHEEL,
                    ModBlocks.BRASS_CLEAR_GLASS_ENCASED_COGWHEEL,
                    ModBlocks.TRAIN_GLASS_ENCASED_COGWHEEL,
                    ModBlocks.TRAIN_CLEAR_GLASS_ENCASED_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::small)
            .register();

    //Glass Encased Large Cogs
    public static final BlockEntityEntry<SimpleKineticBlockEntity> GLASS_ENCASED_LARGE_COG = REGISTRATE
            .blockEntity("glass_encased_large_cog", SimpleKineticBlockEntity::new)
            .instance(() -> EncasedCogInstance::large, false)
            .validBlocks(ModBlocks.ANDESITE_GLASS_ENCASED_LARGE_COGWHEEL,
                    ModBlocks.ANDESITE_CLEAR_GLASS_ENCASED_LARGE_COGWHEEL,
                    ModBlocks.BRASS_GLASS_ENCASED_LARGE_COGWHEEL,
                    ModBlocks.BRASS_CLEAR_GLASS_ENCASED_LARGE_COGWHEEL,
                    ModBlocks.TRAIN_GLASS_ENCASED_LARGE_COGWHEEL,
                    ModBlocks.TRAIN_CLEAR_GLASS_ENCASED_LARGE_COGWHEEL)
            .renderer(() -> EncasedCogRenderer::large)
            .register();

    public static void register(IEventBus eventBus) {
        REGISTRATE.registerEventListeners(eventBus);
    }
}
