package freshcaa.minecraft.world;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import freshcaa.fresh.cookies.CookieMod;
import freshcaa.fresh.trees.MyModSaplings;

public class MyBoneMeal_Event
{
	@ForgeSubscribe
	public void usedBonemeal(BonemealEvent event)
	{
		if(event.ID == CookieMod.pecanSapling.blockID)
		{
			if(!event.world.isRemote)
			{
				((MyModSaplings)CookieMod.pecanSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
			}
		}
		if(event.ID == CookieMod.macadamiaSapling.blockID)
		{
			if(!event.world.isRemote)
			{
				((MyModSaplings)CookieMod.macadamiaSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
			}
		}
	}
}
