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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Message received by the client for the `ListLogDataStats` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListLogDataStatsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. True if user has opted in for log data collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean logDataEnabled;

  /**
   * The stats for each bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LogBucketStats> logDataStats;

  /**
   * The overall count for log data (including all bucket data).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalCount;

  /**
   * Output only. True if user has opted in for log data collection.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLogDataEnabled() {
    return logDataEnabled;
  }

  /**
   * Output only. True if user has opted in for log data collection.
   * @param logDataEnabled logDataEnabled or {@code null} for none
   */
  public ListLogDataStatsResponse setLogDataEnabled(java.lang.Boolean logDataEnabled) {
    this.logDataEnabled = logDataEnabled;
    return this;
  }

  /**
   * The stats for each bucket.
   * @return value or {@code null} for none
   */
  public java.util.List<LogBucketStats> getLogDataStats() {
    return logDataStats;
  }

  /**
   * The stats for each bucket.
   * @param logDataStats logDataStats or {@code null} for none
   */
  public ListLogDataStatsResponse setLogDataStats(java.util.List<LogBucketStats> logDataStats) {
    this.logDataStats = logDataStats;
    return this;
  }

  /**
   * The overall count for log data (including all bucket data).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalCount() {
    return totalCount;
  }

  /**
   * The overall count for log data (including all bucket data).
   * @param totalCount totalCount or {@code null} for none
   */
  public ListLogDataStatsResponse setTotalCount(java.lang.Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  @Override
  public ListLogDataStatsResponse set(String fieldName, Object value) {
    return (ListLogDataStatsResponse) super.set(fieldName, value);
  }

  @Override
  public ListLogDataStatsResponse clone() {
    return (ListLogDataStatsResponse) super.clone();
  }

}
