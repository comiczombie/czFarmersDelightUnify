package com.comiczombie.czfarmersdelightunify.registry;

import com.comiczombie.czfarmersdelightunify.CzFarmersDelightUnify;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, CzFarmersDelightUnify.MOD_ID);

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CzFarmersDelightUnify.MOD_ID);

    // ---- FluidType: colour, density, behaviour ----
    public static final DeferredHolder<FluidType, FluidType> MANGO_JUICE_TYPE =
            FLUID_TYPES.register("mango_juice",
                    () -> new FluidType(FluidType.Properties.create()
                            .descriptionId("fluid_type.czfarmersdelightunify.mango_juice")
                            .density(1100)
                            .viscosity(1100)
                            .canConvertToSource(false)
                    ));

    // ---- The fluid pair ----
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> MANGO_JUICE =
            FLUIDS.register("mango_juice", () -> new BaseFlowingFluid.Source(properties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> MANGO_JUICE_FLOWING =
            FLUIDS.register("flowing_mango_juice", () -> new BaseFlowingFluid.Flowing(properties()));

    private static BaseFlowingFluid.Properties properties() {
        return new BaseFlowingFluid.Properties(
                MANGO_JUICE_TYPE, MANGO_JUICE, MANGO_JUICE_FLOWING
        ).bucket(ModItems.MANGO_JUICE_BUCKET).block(ModBlocks.MANGO_JUICE_BLOCK);
    }
}
