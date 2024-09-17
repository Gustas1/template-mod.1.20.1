package net.chips.tutorialmod.item;

import net.chips.tutorialmod.TutorialMod;
import net.chips.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
                    FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                            .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                                entries.add(new ItemStack(ModItems.RAW_RUBY));
                                entries.add(new ItemStack(ModBlocks.RUBY_ORE));
                                entries.add(new ItemStack(ModBlocks.DEEPSLATE_RUBY_ORE));
                                entries.add(new ItemStack(ModBlocks.NETHER_RUBY_ORE));
                                entries.add(new ItemStack(ModBlocks.ENDSTONE_RUBY_ORE));
                                entries.add(new ItemStack(ModBlocks.RAW_RUBY_BLOCK));
                                entries.add(new ItemStack(ModItems.RUBY));
                                entries.add(new ItemStack(ModBlocks.RUBY_BLOCK));
                            }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Mod Item Groups for " + TutorialMod.MOD_ID);
    }
}
