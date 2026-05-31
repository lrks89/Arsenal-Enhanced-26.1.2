package net.lrks89.arsenalmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.lrks89.arsenalmod.ArsenalEnhancedMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item EXAMPLE = registerItem("example", Item::new);
    public static final Item EXAMPLE2 = registerItem("example2", Item::new);



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ArsenalEnhancedMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArsenalEnhancedMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        ArsenalEnhancedMod.LOGGER.info("Registering Mod Items for " + ArsenalEnhancedMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(EXAMPLE);
            output.accept(EXAMPLE2);
        });
    }
}
