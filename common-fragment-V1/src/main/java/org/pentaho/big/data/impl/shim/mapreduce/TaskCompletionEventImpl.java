/*******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.big.data.impl.shim.mapreduce;


import org.pentaho.hadoop.shim.api.mapreduce.TaskCompletionEvent;

/**
 * Created by bryan on 12/3/15.
 */
public class TaskCompletionEventImpl implements TaskCompletionEvent {
  private final org.pentaho.hadoop.shim.api.internal.mapred.TaskCompletionEvent delegate;

  public TaskCompletionEventImpl( org.pentaho.hadoop.shim.api.internal.mapred.TaskCompletionEvent delegate ) {
    this.delegate = delegate;
  }

  @Override public Status getTaskStatus() {
    return Status.valueOf( delegate.getTaskStatus().toString() );
  }

  @Override public Object getTaskAttemptId() {
    return delegate.getTaskAttemptId();
  }

  @Override public int getEventId() {
    return delegate.getEventId();
  }
}
