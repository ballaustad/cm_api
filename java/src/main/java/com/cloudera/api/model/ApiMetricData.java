// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cloudera.api.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A single data point of metric data.
 */
@XmlRootElement(name = "metricData")
public class ApiMetricData {
  private Date timestamp;
  private double value;

  public ApiMetricData() {
    // For JAX-B
  }

  public ApiMetricData(Date timestamp, double value) {
    this.timestamp = timestamp;
    this.value = value;
  }

  /** When the metric reading was collected. */
  @XmlElement
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /** The value of the metric. */
  @XmlElement
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }
}
