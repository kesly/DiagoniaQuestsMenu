/**
 * Copyright (c) 2021 Loïc DUBOIS-TERMOZ alias Voltariuss
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package fr.voltariuss.diagonia;

import fr.voltariuss.diagonia.misc.PluginInitializator;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This class represents the entry point of the defined {@link JavaPlugin}.
 *
 * @author Voltariuss
 */
public class Main extends JavaPlugin {

  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  @Override
  public void onEnable() {
    PluginInitializator.initializePlugin(this);
    LOGGER.info(this.getName() + " plugin is enabled.");
  }

  @Override
  public void onDisable() {
    LOGGER.info(this.getName() + " plugin is disabled.");
  }
}
