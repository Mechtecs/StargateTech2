package stargatetech2.transport.util;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import stargatetech2.transport.packet.PacketActivateRings;
import stargatetech2.transport.tileentity.TileTransportRing;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class RingKeyHandler extends KeyHandler {
	private static final KeyBinding RING_UP = new KeyBinding("[SGTech2] Activate rings (Up)", 200);
	private static final KeyBinding RING_DOWN = new KeyBinding("[SGTech2] Activate rings (Down)", 208);
	
	public RingKeyHandler(){
		super(new KeyBinding[]{RING_UP, RING_DOWN}, new boolean[]{true, true});
	}
	
	@Override
	public String getLabel(){
		return "StargateTech2:RingKeyHandler";
	}
	
	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat){}
	
	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd){
		if(!tickEnd) return;
		if(kb.keyCode == RING_UP.keyCode){
			makePlayerTriggerRings(true);
		}else if(kb.keyCode == RING_DOWN.keyCode){
			makePlayerTriggerRings(false);
		}
	}
	
	@Override
	public EnumSet<TickType> ticks(){
		return EnumSet.of(TickType.CLIENT);
	}
	
	private void makePlayerTriggerRings(boolean up){
		TileTransportRing rings = TileTransportRing.getRingsInRange(FMLClientHandler.instance().getClient().theWorld);
		if(rings != null && Minecraft.getMinecraft().currentScreen == null){
			PacketActivateRings packet = new PacketActivateRings();
			packet.x = rings.xCoord;
			packet.y = rings.yCoord;
			packet.z = rings.zCoord;
			packet.up = up;
			packet.sendToServer();
		}
	}
}