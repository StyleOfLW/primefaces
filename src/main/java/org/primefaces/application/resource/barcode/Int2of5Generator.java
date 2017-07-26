/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.application.resource.barcode;

import java.io.IOException;
import org.krysalis.barcode4j.impl.int2of5.Interleaved2Of5Bean;
import org.krysalis.barcode4j.output.CanvasProvider;

public class Int2of5Generator implements BarcodeGenerator {

    public void generate(CanvasProvider canvasProvider, String value) throws IOException {
        Interleaved2Of5Bean bean = new Interleaved2Of5Bean();
        bean.generateBarcode(canvasProvider, value);
    }

}
