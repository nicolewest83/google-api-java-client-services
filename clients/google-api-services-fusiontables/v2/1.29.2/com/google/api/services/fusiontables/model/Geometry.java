/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.fusiontables.model;

/**
 * Represents a Geometry object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Geometry extends com.google.api.client.json.GenericJson {

  /**
   * The list of geometries in this geometry collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> geometries;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object geometry;

  /**
   * Type: A collection of geometries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The list of geometries in this geometry collection.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getGeometries() {
    return geometries;
  }

  /**
   * The list of geometries in this geometry collection.
   * @param geometries geometries or {@code null} for none
   */
  public Geometry setGeometries(java.util.List<java.lang.Object> geometries) {
    this.geometries = geometries;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getGeometry() {
    return geometry;
  }

  /**
   * @param geometry geometry or {@code null} for none
   */
  public Geometry setGeometry(java.lang.Object geometry) {
    this.geometry = geometry;
    return this;
  }

  /**
   * Type: A collection of geometries.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type: A collection of geometries.
   * @param type type or {@code null} for none
   */
  public Geometry setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Geometry set(String fieldName, Object value) {
    return (Geometry) super.set(fieldName, value);
  }

  @Override
  public Geometry clone() {
    return (Geometry) super.clone();
  }

}
