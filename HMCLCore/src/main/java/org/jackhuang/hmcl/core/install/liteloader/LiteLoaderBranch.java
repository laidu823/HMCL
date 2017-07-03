/*
 * Hello Minecraft! Launcher.
 * Copyright (C) 2013  huangyuhui <huanghongxun2008@126.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hmcl.core.install.liteloader;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import org.jackhuang.hmcl.core.version.MinecraftLibrary;

/**
 *
 * @author huang
 */
public class LiteLoaderBranch {
    @SerializedName("libraries")
    public List<MinecraftLibrary> libraries;
    
    @SerializedName("com.mumfrey:liteloader")
    public Map<String, LiteLoaderVersion> liteLoader;
}
