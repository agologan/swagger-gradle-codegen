/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: JUnit Tests
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.apis

import com.yelp.codegen.generatecodesamples.models.EmptyModel
import com.yelp.codegen.generatecodesamples.models.FormatResponses
import com.yelp.codegen.generatecodesamples.models.NestedAdditionalProperties
import com.yelp.codegen.generatecodesamples.models.NestedAdditionalPropertiesCustomDescription
import com.yelp.codegen.generatecodesamples.models.PropertyArray
import com.yelp.codegen.generatecodesamples.models.PropertyMap
import com.yelp.codegen.generatecodesamples.models.RequiredTypeResponses
import com.yelp.codegen.generatecodesamples.models.ReservedKeywords
import com.yelp.codegen.generatecodesamples.models.TopLevelEnum
import com.yelp.codegen.generatecodesamples.models.TopLevelMap
import com.yelp.codegen.generatecodesamples.models.TypeResponses
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

@JvmSuppressWildcards
interface ResourceApi {
    /**
     * The endpoint is owned by junittests service owner
     */
    @Headers(
        "X-Operation-ID: get_empty_endpoint"
    )
    @GET("/empty_endpoint")
    fun getEmptyEndpoint(): Single<EmptyModel>
    /**
     * The endpoint is owned by junittests service owner
     * @param propertyFormat (required)
     */
    @Headers(
        "X-Operation-ID: get_format_endpoint"
    )
    @GET("/format_endpoint/{property_format}")
    fun getFormatEndpoint(
        @retrofit2.http.Path("property_format") propertyFormat: String
    ): Single<FormatResponses>
    /**
     * The endpoint is owned by junittests service owner
     */
    @Headers(
        "X-Operation-ID: get_nested_additional_properties"
    )
    @GET("/nested_additional_properties")
    fun getNestedAdditionalProperties(): Single<NestedAdditionalProperties>
    /**
     * The endpoint is owned by junittests service owner
     */
    @Headers(
        "X-Operation-ID: get_nested_additional_properties_custom_description"
    )
    @GET("/nested_additional_properties/custom_description")
    fun getNestedAdditionalPropertiesCustomDescription(): Single<NestedAdditionalPropertiesCustomDescription>
    /**
     * The endpoint is owned by junittests service owner
     * @param valueType (required)
     * @param size (required)
     */
    @Headers(
        "X-Operation-ID: get_property_array"
    )
    @GET("/property_array/{value_type}/{size}")
    fun getPropertyArray(
        @retrofit2.http.Path("value_type") valueType: String,
        @retrofit2.http.Path("size") size: String
    ): Single<PropertyArray>
    /**
     * The endpoint is owned by junittests service owner
     * @param valueType (required)
     * @param size (required)
     */
    @Headers(
        "X-Operation-ID: get_property_map"
    )
    @GET("/property_map/{value_type}/{size}")
    fun getPropertyMap(
        @retrofit2.http.Path("value_type") valueType: String,
        @retrofit2.http.Path("size") size: String
    ): Single<PropertyMap>
    /**
     * The endpoint is owned by junittests service owner
     */
    @Headers(
        "X-Operation-ID: get_required_type_endpoint"
    )
    @GET("/required/type_endpoint")
    fun getRequiredTypeEndpoint(): Single<RequiredTypeResponses>
    /**
     * The endpoint is owned by junittests service owner
     */
    @Headers(
        "X-Operation-ID: get_reserved_keywords"
    )
    @GET("/reserved_keywords")
    fun getReservedKeywords(): Single<ReservedKeywords>
    /**
     * Test symbols in parameter name
     * Make sure that symbols in parameter name are treated properly
     * The endpoint is owned by junittests service owner
     * @param parameter (optional)
     * @param brackets (optional)
     * @param bracketsWithText (optional)
     * @param dot (optional)
     * @param dotWithText (optional)
     */
    @Headers(
        "X-Operation-ID: getSymbolsInParameterName"
    )
    @GET("/symbols/in/parameter/name")
    fun getSymbolsInParameterName(
        @retrofit2.http.Query("parameter") parameter: String?,
        @retrofit2.http.Query("brackets[]") brackets: String?,
        @retrofit2.http.Query("brackets[withText]") bracketsWithText: String?,
        @retrofit2.http.Query("dot.") dot: String?,
        @retrofit2.http.Query("dot.withText") dotWithText: String?
    ): Completable
    /**
     * The endpoint is owned by junittests service owner
     */
    @Headers(
        "X-Operation-ID: get_top_level_enum"
    )
    @GET("/top_level_enum")
    fun getTopLevelEnum(): Single<TopLevelEnum>
    /**
     * The endpoint is owned by junittests service owner
     */
    @Headers(
        "X-Operation-ID: get_top_level_enum_nested"
    )
    @GET("/top_level_enum/nested")
    fun getTopLevelEnumNested(): Single<Map<String, Map<String, TopLevelEnum>>>
    /**
     * The endpoint is owned by junittests service owner
     * @param size (required)
     */
    @Headers(
        "X-Operation-ID: get_top_level_map"
    )
    @GET("/top_level_map/{size}")
    fun getTopLevelMap(
        @retrofit2.http.Path("size") size: String
    ): Single<TopLevelMap>
    /**
     * The endpoint is owned by junittests service owner
     * @param propertyType (required)
     */
    @Headers(
        "X-Operation-ID: get_type_endpoint"
    )
    @GET("/type_endpoint/{property_type}")
    fun getTypeEndpoint(
        @retrofit2.http.Path("property_type") propertyType: String
    ): Single<TypeResponses>
}
