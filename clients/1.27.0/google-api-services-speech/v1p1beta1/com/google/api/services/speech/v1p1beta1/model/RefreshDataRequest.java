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
 * Message sent by the client to refresh data in a existing dataset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RefreshDataRequest extends com.google.api.client.json.GenericJson {

  /**
   * URI that points to a file in csv file where each row has following format. ,, label can be
   * HUMAN_TRANSCRIBED or MACHINE_TRANSCRIBED. Few rules for a row to be considered valid are :- 1.
   * Each row must have at least a label and  2. If a row is marked HUMAN_TRANSCRIBED, then both
   * and  needs to be specified. 3. There has to be minimum 500 number of rows labelled
   * HUMAN_TRANSCRIBED if evaluation stats are required. 4. If use_logged_data_for_training is set
   * to true, then we ignore the rows labelled as MACHINE_TRANSCRIBED. 5. There has to be minimum
   * 100,000 words in the transcripts in order to provide sufficient textual training data for the
   * language model. Currently, only Google Cloud Storage URIs are supported, which must be
   * specified in the following format: `gs://bucket_name/object_name` (other URI formats will be
   * ignored). For more information, see [Request URIs](https://cloud.google.com/storage/docs
   * /reference-uris).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * URI that points to a file in csv file where each row has following format. ,, label can be
   * HUMAN_TRANSCRIBED or MACHINE_TRANSCRIBED. Few rules for a row to be considered valid are :- 1.
   * Each row must have at least a label and  2. If a row is marked HUMAN_TRANSCRIBED, then both
   * and  needs to be specified. 3. There has to be minimum 500 number of rows labelled
   * HUMAN_TRANSCRIBED if evaluation stats are required. 4. If use_logged_data_for_training is set
   * to true, then we ignore the rows labelled as MACHINE_TRANSCRIBED. 5. There has to be minimum
   * 100,000 words in the transcripts in order to provide sufficient textual training data for the
   * language model. Currently, only Google Cloud Storage URIs are supported, which must be
   * specified in the following format: `gs://bucket_name/object_name` (other URI formats will be
   * ignored). For more information, see [Request URIs](https://cloud.google.com/storage/docs
   * /reference-uris).
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI that points to a file in csv file where each row has following format. ,, label can be
   * HUMAN_TRANSCRIBED or MACHINE_TRANSCRIBED. Few rules for a row to be considered valid are :- 1.
   * Each row must have at least a label and  2. If a row is marked HUMAN_TRANSCRIBED, then both
   * and  needs to be specified. 3. There has to be minimum 500 number of rows labelled
   * HUMAN_TRANSCRIBED if evaluation stats are required. 4. If use_logged_data_for_training is set
   * to true, then we ignore the rows labelled as MACHINE_TRANSCRIBED. 5. There has to be minimum
   * 100,000 words in the transcripts in order to provide sufficient textual training data for the
   * language model. Currently, only Google Cloud Storage URIs are supported, which must be
   * specified in the following format: `gs://bucket_name/object_name` (other URI formats will be
   * ignored). For more information, see [Request URIs](https://cloud.google.com/storage/docs
   * /reference-uris).
   * @param uri uri or {@code null} for none
   */
  public RefreshDataRequest setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public RefreshDataRequest set(String fieldName, Object value) {
    return (RefreshDataRequest) super.set(fieldName, value);
  }

  @Override
  public RefreshDataRequest clone() {
    return (RefreshDataRequest) super.clone();
  }

}
