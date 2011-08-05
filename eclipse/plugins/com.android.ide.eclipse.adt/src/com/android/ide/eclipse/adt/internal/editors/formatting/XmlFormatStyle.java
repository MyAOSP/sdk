/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.ide.eclipse.adt.internal.editors.formatting;

/**
 * Style to use when printing the XML. Different types of Android XML files use slightly
 * different preferred formats. For example, in layout files there is typically always a
 * newline between successive elements, whereas in a manifest file there is typically only
 * newlines between different types of elements. As another example, in resource files,
 * the format is typically much more compact: the text content of {@code <item>} tags is
 * included on the same line whereas for other layout styles the children are typically
 * placed on a line of their own.
 */
enum XmlFormatStyle {
    /** Layout formatting style: blank lines between elements, attributes on separate lines */
    LAYOUT,

    /** Resource style: one line per complete element including text child content */
    RESOURCE,

    /**
     * Similar to layout style, but no newlines between related elements such as
     * successive {@code <uses-permission>} declarations, and no newlines inside
     * the second level elements (so an {@code <activity>} declaration appears as a
     * single block with no whitespace within it)
     */
    MANIFEST;
}