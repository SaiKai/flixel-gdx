package org.flixel.system;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.glutils.PixmapTextureData;

/**
 * This class simply allows us to make dynamic textures managed.
 * 
 * @author Thomas Weston
 */
public class FlxTextureData extends PixmapTextureData 
{
	public FlxTextureData(Pixmap pixmap) 
	{
		super(pixmap, null, false, false);
	}

	@Override 
	public boolean isManaged()
	{
		return true;
	}
}