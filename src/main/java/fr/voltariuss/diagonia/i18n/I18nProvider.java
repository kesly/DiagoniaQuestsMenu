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
package fr.voltariuss.diagonia.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class provides i18n string values.
 *
 * @author Voltariuss
 */
public final class I18nProvider {

  public static final Locale DEFAULT_LOCALE = Locale.FRENCH;

  /**
   * Gets and returns the associated value with the specified label contained in the targeted {@link
   * ResourceBundle}.
   *
   * @param resource The name of the targeted {@link ResourceBundle}.
   * @param label The label of the targeted string value.
   * @return The associated value with the specified label contained in the targeted {@link
   *     ResourceBundle}.
   */
  public static String getFromLabel(String resource, String label) {
    ResourceBundle rb = ResourceBundle.getBundle(resource, DEFAULT_LOCALE);
    return rb.getString(label);
  }
}
