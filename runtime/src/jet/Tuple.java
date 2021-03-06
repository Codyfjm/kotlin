/*
 * Copyright 2010-2012 JetBrains s.r.o.
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
package jet;

import org.jetbrains.jet.rt.annotation.AssertInvisibleInResolver;

/**
 * Represents the common interface of a tuple
 */
// @AssertInvisibleInResolver // TODO TupleN classes has no Tuple superclass
public abstract class Tuple extends DefaultJetObject {

    /**
     * Performs the given function on each item in the tuple
     */
    public abstract void forEach(Function1<Object, Tuple0> fn);

    /**
     * Returns the size of the tuple
     */
    public abstract int size();
}
