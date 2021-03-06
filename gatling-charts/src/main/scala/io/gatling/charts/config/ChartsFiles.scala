/**
 * Copyright 2011-2014 eBusiness Information, Groupe Excilys (www.ebusinessinformation.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.charts.config

import java.nio.file.Path

import io.gatling.core.config.GatlingConfiguration
import io.gatling.core.config.GatlingFiles._
import io.gatling.charts.FileNamingConventions
import io.gatling.core.util.PathHelper._

private[charts] object ChartsFiles {
  val JQueryFile = "jquery.min.js"
  val BootstrapFile = "bootstrap.min.js"
  val GatlingJsFile = "gatling.js"
  val MomentJsFile = "moment.min.js"
  val MenuFile = "menu.js"
  val AllSessionsFile = "all_sessions.js"
  val StatsJsFile = "stats.js"
  val StatsJsonFile = "stats.json"
  val GlobalStatsJsonFile = "global_stats.json"
  val AssertionsJsonFile = "assertions.json"
  val AssertionsJUnitFile = "assertions.xml"
  val GlobalPageName = "Global Information"

  val CommonJsFiles = Seq(
    JQueryFile, BootstrapFile, GatlingJsFile,
    MomentJsFile, MenuFile, AllSessionsFile, StatsJsFile)

  def menuFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / GatlingJsFolder / MenuFile

  def allSessionsFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / GatlingJsFolder / AllSessionsFile

  def globalFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / "index.html"

  def requestFile(runOn: String, requestName: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / requestName.toRequestFileName(configuration.core.charset)

  def statsJsFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / GatlingJsFolder / StatsJsFile

  def statsJsonFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / GatlingJsFolder / StatsJsonFile

  def globalStatsJsonFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / GatlingJsFolder / GlobalStatsJsonFile

  def assertionsJsonFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / GatlingJsFolder / AssertionsJsonFile

  def assertionsJUnitFile(runOn: String)(implicit configuration: GatlingConfiguration): Path = resultDirectory(runOn) / GatlingJsFolder / AssertionsJUnitFile
}
