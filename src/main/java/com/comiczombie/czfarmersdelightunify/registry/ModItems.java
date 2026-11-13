package com.comiczombie.czfarmersdelightunify.registry;

import com.comiczombie.czfarmersdelightunify.CzFarmersDelightUnify;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CzFarmersDelightUnify.MOD_ID);

    public static final DeferredItem<Item> MANGO_JUICE_BUCKET =
            ITEMS.register("mango_juice_bucket",
                    () -> new BucketItem(ModFluids.MANGO_JUICE.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));
}
