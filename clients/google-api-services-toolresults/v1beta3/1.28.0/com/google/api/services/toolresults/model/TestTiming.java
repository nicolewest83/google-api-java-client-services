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

package com.google.api.services.toolresults.model;

/**
 * Testing timing break down to know phases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestTiming extends com.google.api.client.json.GenericJson {

  /**
   * How long it took to run the test process.
   *
   * - In response: present if previously set. - In create/update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration testProcessDuration;

  /**
   * How long it took to run the test process.
   *
   * - In response: present if previously set. - In create/update request: optional
   * @return value or {@code null} for none
   */
  public Duration getTestProcessDuration() {
    return testProcessDuration;
  }

  /**
   * How long it took to run the test process.
   *
   * - In response: present if previously set. - In create/update request: optional
   * @param testProcessDuration testProcessDuration or {@code null} for none
   */
  public TestTiming setTestProcessDuration(Duration testProcessDuration) {
    this.testProcessDuration = testProcessDuration;
    return this;
  }

  @Override
  public TestTiming set(String fieldName, Object value) {
    return (TestTiming) super.set(fieldName, value);
  }

  @Override
  public TestTiming clone() {
    return (TestTiming) super.clone();
  }

}
