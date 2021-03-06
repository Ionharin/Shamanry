package shamanry.client

import cpw.mods.fml.client.registry.{ClientRegistry, RenderingRegistry}
import shamanry.client.render.RenderAltar
import shamanry.common.CommonProxy
import shamanry.common.block.BlockRitualAltar
import shamanry.common.tile.TileRitualAltar

class ClientProxy
extends CommonProxy{
  override def registerRenders(): Unit ={
    val id: Int = RenderingRegistry.getNextAvailableRenderId;
    val altarRenderer: RenderAltar = new RenderAltar(id);
    BlockRitualAltar.setRenderType(id);
    ClientRegistry.bindTileEntitySpecialRenderer(classOf[TileRitualAltar], altarRenderer);
    RenderingRegistry.registerBlockHandler(altarRenderer);
  }
}