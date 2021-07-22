/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: JUnit Tests
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property booleanProperty
 * @property enumProperty
 * @property integerProperty
 * @property numberProperty
 * @property stringProperty
 */
@Serializable
data class XnullableTypeResponses(
    @SerialName("boolean_property") var booleanProperty: Boolean? = null,
    @SerialName("enum_property") var enumProperty: XnullableTypeResponses.EnumPropertyEnum? = null,
    @SerialName("integer_property") var integerProperty: Int? = null,
    @SerialName("number_property") var numberProperty: Double? = null,
    @SerialName("string_property") var stringProperty: String? = null
) {
    /**
     * Values: VALUE1, VALUE2
     */
    @Serializable
    enum class EnumPropertyEnum() {
        @SerialName("VALUE1") VALUE1,
        @SerialName("VALUE2") VALUE2
    }
}
