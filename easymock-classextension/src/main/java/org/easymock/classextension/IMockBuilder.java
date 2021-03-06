/**
 * Copyright 2003-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.easymock.classextension;

/**
 * This class is provided solely to allow an easier transition to EasyMock 3.0.
 * You should now use {@link org.easymock.IMockBuilder} instead.
 * 
 * @param <T>
 *            type of the object being created
 * 
 * @author Henri Tremblay
 * 
 * @deprecated Use {@link org.easymock.IMockBuilder} instead
 */
@Deprecated
public interface IMockBuilder<T> extends org.easymock.IMockBuilder<T> {
}
