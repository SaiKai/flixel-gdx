package org.flixel;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class FlxDesktopApplication extends LwjglApplication
{
   	public FlxDesktopApplication(FlxGame Game, int Width, int Height)
	{
        super((ApplicationListener)Game.stage, FlxG.getLibraryName(), Width, Height);
	}

    public FlxDesktopApplication(FlxGame Game, String title, int Width, int Height)
    {
        super((ApplicationListener)Game.stage, title, Width, Height);
    }

    public FlxDesktopApplication(FlxGame Game, LwjglApplicationConfiguration configuration){

        super((ApplicationListener)Game.stage,configuration);
    }
}
