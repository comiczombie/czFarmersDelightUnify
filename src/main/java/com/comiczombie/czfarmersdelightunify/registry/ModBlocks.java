package com.comiczombie.czfarmersdelightunify.registry;

import com.comiczombie.czfarmersdelightunify.CzFarmersDelightUnify;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CzFarmersDelightUnify.MOD_ID);

    public static final DeferredBlock<LiquidBlock> MANGO_JUICE_BLOCK =
            BLOCKS.register("mango_juice",
                    () -> new LiquidBlock(ModFluids.MANGO_JUICE.get(),
                            BlockBehaviour.Properties.of()
                                    .replaceable()
                                    .noCollission()
                                    .strength(100f)
                                    .noLootTable()
                                    .liquid()
                                    .pushReaction(PushReaction.DESTROY)));
}
