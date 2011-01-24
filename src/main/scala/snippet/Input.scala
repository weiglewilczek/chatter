/*
 * Copyright 2011 Weigle Wilczek GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.weiglewilczek.chatter
package snippet

import net.liftweb.common.Loggable
import net.liftweb.http.SHtml
import com.weiglewilczek.chatter.lib.ChatterServer

object Input extends Loggable {

  def render = {
    def handleSubmit(message: String) {
      logger.debug("Input was submitted: %s".format(message))
      ChatterServer ! message
    }
    SHtml onSubmit handleSubmit
  }
}
