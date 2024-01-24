package com.cyvack.create_crystal_clear.blocks;

import com.cyvack.create_crystal_clear.Create_Crystal_Clear;
import com.cyvack.create_crystal_clear.blocks.ModBlocks;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static com.cyvack.create_crystal_clear.blocks.ModBlocks.blocks;

public class CrystalClearTab {

    private static final DeferredRegister<CreativeModeTab> REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Create_Crystal_Clear.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GLASS_TAB = REGISTER.register("create_crystal_clear",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Create: Crystal Clear"))
                    .icon(ModBlocks.COPPER_GLASS_CASING::asStack)
                    .displayItems(((pParameters, pOutput) -> {
                        blocks.forEach((block) -> {
                            pOutput.accept(block.asStack());
                        });
                    }))
                    .build());


//	public static final CreativeModeTab GLASS_TAB = new CreativeModeTab("create_crystal_clear") {
//		@Override
//		public ItemStack makeIcon() {return ModBlocks.COPPER_GLASS_CASING.asStack();}
//	};
//	private static final CreateRegistrate REGISTRATE = Create_Crystal_Clear.registrate().creativeModeTab(() -> GLASS_TAB, "Create: Crystal Clear");

    public static void register(IEventBus eventBus) {
        REGISTER.register(eventBus);
    }
}
