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
package fr.voltariuss.diagonia.inventories;

import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import fr.voltariuss.diagonia.i18n.I18nProvider;
import org.bukkit.entity.Player;

/**
 * This class represents the {@link InventoryProvider} of the Jobs quests main menu.
 *
 * @author Voltariuss
 */
public class QuestsJobsMainMenuInventoryProvider implements GUIInventoryProvider {

  public static final String INVENTORY_ID = "questsJobsMainMenu";

  private static QuestsJobsMainMenuInventoryProvider instance;

  private SmartInventory inventory;

  /** Private constructor - Singleton class */
  private QuestsJobsMainMenuInventoryProvider() {
    this.build();
  }

  /**
   * Returns the only instance of the {@link QuestsJobsMainMenuInventoryProvider} class.
   *
   * <p>If no instance exists, one is created before returns it.
   *
   * @return The only instance of the {@link QuestsJobsMainMenuInventoryProvider} class.
   */
  public static QuestsJobsMainMenuInventoryProvider getInstance() {
    if (instance == null) {
      instance = new QuestsJobsMainMenuInventoryProvider();
    }
    return instance;
  }

  @Override
  public void init(Player player, InventoryContents contents) {}

  @Override
  public void update(Player player, InventoryContents contents) {}

  @Override
  public void open(Player player) {}

  @Override
  public SmartInventory getInventory() {
    return this.inventory;
  }

  private void setInventory(SmartInventory inventory) {
    this.inventory = inventory;
  }

  private void build() {
    String inventoryTitle = I18nProvider.getFromLabel(INVENTORY_ID, "inventory.title");
    this.setInventory(
        SmartInventory.builder()
            .id(INVENTORY_ID)
            .provider(new QuestsJobsMainMenuInventoryProvider())
            .size(6, 9)
            .title(inventoryTitle)
            .build());
  }
}
