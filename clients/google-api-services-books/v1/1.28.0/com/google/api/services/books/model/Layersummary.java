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

package com.google.api.services.books.model;

/**
 * Model definition for Layersummary.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Layersummary extends com.google.api.client.json.GenericJson {

  /**
   * The number of annotations for this layer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer annotationCount;

  /**
   * The list of annotation types contained for this layer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> annotationTypes;

  /**
   * Link to get data for this annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationsDataLink;

  /**
   * The link to get the annotations for this layer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationsLink;

  /**
   * The content version this resource is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentVersion;

  /**
   * The number of data items for this layer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dataCount;

  /**
   * Unique id of this layer summary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Resource Type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The layer id for this summary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layerId;

  /**
   * URL to this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * The current version of this layer's volume annotations. Note that this version applies only to
   * the data in the books.layers.volumeAnnotations.* responses. The actual annotation data is
   * versioned separately.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String volumeAnnotationsVersion;

  /**
   * The volume id this resource is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String volumeId;

  /**
   * The number of annotations for this layer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAnnotationCount() {
    return annotationCount;
  }

  /**
   * The number of annotations for this layer.
   * @param annotationCount annotationCount or {@code null} for none
   */
  public Layersummary setAnnotationCount(java.lang.Integer annotationCount) {
    this.annotationCount = annotationCount;
    return this;
  }

  /**
   * The list of annotation types contained for this layer.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAnnotationTypes() {
    return annotationTypes;
  }

  /**
   * The list of annotation types contained for this layer.
   * @param annotationTypes annotationTypes or {@code null} for none
   */
  public Layersummary setAnnotationTypes(java.util.List<java.lang.String> annotationTypes) {
    this.annotationTypes = annotationTypes;
    return this;
  }

  /**
   * Link to get data for this annotation.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationsDataLink() {
    return annotationsDataLink;
  }

  /**
   * Link to get data for this annotation.
   * @param annotationsDataLink annotationsDataLink or {@code null} for none
   */
  public Layersummary setAnnotationsDataLink(java.lang.String annotationsDataLink) {
    this.annotationsDataLink = annotationsDataLink;
    return this;
  }

  /**
   * The link to get the annotations for this layer.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationsLink() {
    return annotationsLink;
  }

  /**
   * The link to get the annotations for this layer.
   * @param annotationsLink annotationsLink or {@code null} for none
   */
  public Layersummary setAnnotationsLink(java.lang.String annotationsLink) {
    this.annotationsLink = annotationsLink;
    return this;
  }

  /**
   * The content version this resource is for.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentVersion() {
    return contentVersion;
  }

  /**
   * The content version this resource is for.
   * @param contentVersion contentVersion or {@code null} for none
   */
  public Layersummary setContentVersion(java.lang.String contentVersion) {
    this.contentVersion = contentVersion;
    return this;
  }

  /**
   * The number of data items for this layer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDataCount() {
    return dataCount;
  }

  /**
   * The number of data items for this layer.
   * @param dataCount dataCount or {@code null} for none
   */
  public Layersummary setDataCount(java.lang.Integer dataCount) {
    this.dataCount = dataCount;
    return this;
  }

  /**
   * Unique id of this layer summary.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique id of this layer summary.
   * @param id id or {@code null} for none
   */
  public Layersummary setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Resource Type
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource Type
   * @param kind kind or {@code null} for none
   */
  public Layersummary setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The layer id for this summary.
   * @return value or {@code null} for none
   */
  public java.lang.String getLayerId() {
    return layerId;
  }

  /**
   * The layer id for this summary.
   * @param layerId layerId or {@code null} for none
   */
  public Layersummary setLayerId(java.lang.String layerId) {
    this.layerId = layerId;
    return this;
  }

  /**
   * URL to this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * URL to this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Layersummary setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format).
   * @param updated updated or {@code null} for none
   */
  public Layersummary setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The current version of this layer's volume annotations. Note that this version applies only to
   * the data in the books.layers.volumeAnnotations.* responses. The actual annotation data is
   * versioned separately.
   * @return value or {@code null} for none
   */
  public java.lang.String getVolumeAnnotationsVersion() {
    return volumeAnnotationsVersion;
  }

  /**
   * The current version of this layer's volume annotations. Note that this version applies only to
   * the data in the books.layers.volumeAnnotations.* responses. The actual annotation data is
   * versioned separately.
   * @param volumeAnnotationsVersion volumeAnnotationsVersion or {@code null} for none
   */
  public Layersummary setVolumeAnnotationsVersion(java.lang.String volumeAnnotationsVersion) {
    this.volumeAnnotationsVersion = volumeAnnotationsVersion;
    return this;
  }

  /**
   * The volume id this resource is for.
   * @return value or {@code null} for none
   */
  public java.lang.String getVolumeId() {
    return volumeId;
  }

  /**
   * The volume id this resource is for.
   * @param volumeId volumeId or {@code null} for none
   */
  public Layersummary setVolumeId(java.lang.String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  @Override
  public Layersummary set(String fieldName, Object value) {
    return (Layersummary) super.set(fieldName, value);
  }

  @Override
  public Layersummary clone() {
    return (Layersummary) super.clone();
  }

}
