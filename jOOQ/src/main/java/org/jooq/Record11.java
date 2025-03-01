/**
 * Copyright (c) 2009-2016, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

import javax.annotation.Generated;

/**
 * A model type for a records with degree <code>11</code>
 *
 * @see Row11
 * @author Lukas Eder
 */
@Generated("This class was generated using jOOQ-tools")
public interface Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> extends Record {

    // ------------------------------------------------------------------------
    // Row value expressions
    // ------------------------------------------------------------------------

    /**
     * Get this record's fields as a {@link Row11}.
     */
    @Override
    Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> fieldsRow();

    /**
     * Get this record's values as a {@link Row11}.
     */
    @Override
    Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> valuesRow();

    // ------------------------------------------------------------------------
    // Field accessors
    // ------------------------------------------------------------------------

    /**
     * Get the first field.
     */
    Field<T1> field1();

    /**
     * Get the second field.
     */
    Field<T2> field2();

    /**
     * Get the third field.
     */
    Field<T3> field3();

    /**
     * Get the fourth field.
     */
    Field<T4> field4();

    /**
     * Get the fifth field.
     */
    Field<T5> field5();

    /**
     * Get the sixth field.
     */
    Field<T6> field6();

    /**
     * Get the seventh field.
     */
    Field<T7> field7();

    /**
     * Get the eighth field.
     */
    Field<T8> field8();

    /**
     * Get the ninth field.
     */
    Field<T9> field9();

    /**
     * Get the tenth field.
     */
    Field<T10> field10();

    /**
     * Get the eleventh field.
     */
    Field<T11> field11();

    // ------------------------------------------------------------------------
    // Value accessors
    // ------------------------------------------------------------------------

    /**
     * Get the first value.
     */
    T1 value1();

    /**
     * Get the second value.
     */
    T2 value2();

    /**
     * Get the third value.
     */
    T3 value3();

    /**
     * Get the fourth value.
     */
    T4 value4();

    /**
     * Get the fifth value.
     */
    T5 value5();

    /**
     * Get the sixth value.
     */
    T6 value6();

    /**
     * Get the seventh value.
     */
    T7 value7();

    /**
     * Get the eighth value.
     */
    T8 value8();

    /**
     * Get the ninth value.
     */
    T9 value9();

    /**
     * Get the tenth value.
     */
    T10 value10();

    /**
     * Get the eleventh value.
     */
    T11 value11();

    /**
     * Set the first value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value1(T1 value);

    /**
     * Set the second value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value2(T2 value);

    /**
     * Set the third value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value3(T3 value);

    /**
     * Set the fourth value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value4(T4 value);

    /**
     * Set the fifth value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value5(T5 value);

    /**
     * Set the sixth value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value6(T6 value);

    /**
     * Set the seventh value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value7(T7 value);

    /**
     * Set the eighth value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value8(T8 value);

    /**
     * Set the ninth value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value9(T9 value);

    /**
     * Set the tenth value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value10(T10 value);

    /**
     * Set the eleventh value.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> value11(T11 value);

    /**
     * Set all values.
     */
    Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> values(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

//  [#4695] [#5501] The following covariant overrides cannot be published yet for implementation reasons (see #4695)
//
//  /**
//   * {@inheritDoc}
//   */
//  @Override
//  <T> Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> with(Field<T> field, T value);
//
//  /**
//   * {@inheritDoc}
//   */
//  @Override
//  <T, U> Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> with(Field<T> field, U value, Converter<? extends T, ? super U> converter);
}
