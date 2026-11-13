package com.comiczombie.czfarmersdelightunify;

import com.comiczombie.czfarmersdelightunify.registry.ModBlocks;
import com.comiczombie.czfarmersdelightunify.registry.ModFluids;
import com.comiczombie.czfarmersdelightunify.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(CzFarmersDelightUnify.MOD_ID)
public class CzFarmersDelightUnify {

    public static final String MOD_ID = "czfarmersdelightunify";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CzFarmersDelightUnify(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModFluids.FLUID_TYPES.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);

        LOGGER.info("Comiczombie's Farmers Delight Unify loaded");
    }
}
