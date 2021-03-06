package stargatetech2.integration.plugins.ic2;

import ic2.api.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import stargatetech2.core.api.ParticleIonizerRecipes;
import stargatetech2.core.api.ParticleIonizerRecipes.IonizerRecipe;
import stargatetech2.core.reference.ConfigReference;
import stargatetech2.integration.plugins.BasePlugin;

public class PluginIC2 extends BasePlugin {
	public static ItemStack scrap;
	public static Fluid uuMatter;
	
	public PluginIC2(){
		super("IC2", ConfigReference.KEY_PLUGINS_IC2);
	}

	@Override protected void load(){}
	
	@Override
	protected void postLoad(){
		scrap = Items.getItem("scrap");
		uuMatter = FluidRegistry.getFluid("uumatter");
		
		IonizerRecipe scrapRecipe = new IonizerRecipe(scrap, 1800, 25, 250);
		IonizerRecipe uuRecipe = new IonizerRecipe(new FluidStack(uuMatter, 100), 6000, 1, 500);
		
		ParticleIonizerRecipes.recipes().addRecipe(scrapRecipe);
		ParticleIonizerRecipes.recipes().addRecipe(uuRecipe);
	}

	@Override protected void fallback(){}
}