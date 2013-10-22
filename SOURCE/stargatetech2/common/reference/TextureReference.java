package stargatetech2.common.reference;

import java.util.ArrayList;

import net.minecraft.util.ResourceLocation;

public class TextureReference {
	public static final ArrayList<String> TERRAIN_TEXTURES = new ArrayList<String>(11);
	public static final ArrayList<String> ITEM_TEXTURES = new ArrayList<String>(3);
	
	//### BLOCKS ###
	public static final String IONIZED_PARTICLES = "ionizedParticles";
	
	public static final String MACHINE_SIDE = "machineSide";
	public static final String MACHINE_TOP = "machineTop";
	public static final String MACHINE_BOTTOM = "machineBottom";
	
	public static final String FACE_PARTICLE_IONIZER = "faceParticleIonizer";
	public static final String GLOW_PARTICLE_IONIZER = "glowParticleIonizer";
	
	public static final String FACE_SHIELD_EMITTER = "faceShieldEmitter";
	public static final String GLOW_SHIELD_EMITTER = "glowShieldEmitter";
	
	public static final String FACE_NAQUADAH_ORE = "faceNaquadahOre";
	public static final String GLOW_NAQUADAH_ORE = "glowNaquadahOre";
	
	public static final String LANTEAN_BLOCK_CLEAN = "lanteanBlockClean";
	
	
	
	//### ITEMS ###
	public static final String NAQUADAH_POWER_CRYSTAL = "naquadahPowerCrystal";
	
	
	static{
		TERRAIN_TEXTURES.add(IONIZED_PARTICLES);
		TERRAIN_TEXTURES.add(MACHINE_SIDE);
		TERRAIN_TEXTURES.add(MACHINE_TOP);
		TERRAIN_TEXTURES.add(MACHINE_BOTTOM);
		TERRAIN_TEXTURES.add(FACE_PARTICLE_IONIZER);
		TERRAIN_TEXTURES.add(GLOW_PARTICLE_IONIZER);
		TERRAIN_TEXTURES.add(FACE_SHIELD_EMITTER);
		TERRAIN_TEXTURES.add(FACE_SHIELD_EMITTER + "_B");
		TERRAIN_TEXTURES.add(FACE_SHIELD_EMITTER + "_D");
		TERRAIN_TEXTURES.add(FACE_SHIELD_EMITTER + "_T");
		TERRAIN_TEXTURES.add(GLOW_SHIELD_EMITTER);
		TERRAIN_TEXTURES.add(GLOW_SHIELD_EMITTER + "_B");
		TERRAIN_TEXTURES.add(GLOW_SHIELD_EMITTER + "_D");
		TERRAIN_TEXTURES.add(GLOW_SHIELD_EMITTER + "_T");
		TERRAIN_TEXTURES.add(FACE_NAQUADAH_ORE);
		TERRAIN_TEXTURES.add(GLOW_NAQUADAH_ORE);
		TERRAIN_TEXTURES.add(LANTEAN_BLOCK_CLEAN);
		
		ITEM_TEXTURES.add(NAQUADAH_POWER_CRYSTAL + "_1");
		ITEM_TEXTURES.add(NAQUADAH_POWER_CRYSTAL + "_2");
	}
	
	public static final ResourceLocation GUI_BASE = getTexture("gui/base.png");
	public static final ResourceLocation GUI_SHIELD_EMITTER = getTexture("gui/shieldEmitter.png");
	public static final ResourceLocation GUI_PARTICLE_IONIZER = getTexture("gui/particleIonizer.png");
	public static final ResourceLocation GUI_NAQUADAH_CAPACITOR = getTexture("gui/naquadahCapacitor.png");
	public static final ResourceLocation TESR_TRANSPORT_RING = getTexture("special/transportRing.png");
	
	public static ResourceLocation getTexture(String texture){
		return new ResourceLocation(ModReference.MOD_ID + ":" + "textures/" + texture);
	}
}