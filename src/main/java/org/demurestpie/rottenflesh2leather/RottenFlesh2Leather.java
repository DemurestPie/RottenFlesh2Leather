package org.demurestpie.rottenflesh2leather;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmokingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class RottenFlesh2Leather extends JavaPlugin {

    @Override
    public void onEnable() {
        leatherRecipe();
    }

    private void leatherRecipe() {
        // Result from cooking rotten flesh
        ItemStack result = new ItemStack(Material.LEATHER);

        // Add furnace recipe
        FurnaceRecipe furnace_leather_recipe = new FurnaceRecipe(new NamespacedKey(this, "furnace_RF2L"), result, Material.ROTTEN_FLESH, 1.0f, 200);
        getServer().addRecipe(furnace_leather_recipe);

        // Add campfire recipe
        CampfireRecipe campfire_leather_recipe = new CampfireRecipe(new NamespacedKey(this, "campfire_RF2L"), result, Material.ROTTEN_FLESH, 1.0f, 600);
        getServer().addRecipe(campfire_leather_recipe);

        // Add smoker recipe
        SmokingRecipe smoker_leather_recipe = new SmokingRecipe(new NamespacedKey(this,"smoker_RF2L"), result, Material.ROTTEN_FLESH, 1.0f, 100);
        getServer().addRecipe(smoker_leather_recipe);
    }
}
