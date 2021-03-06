package org.insightedge.examples.financialengineering.model

import org.insightedge.scala.annotation.{SpaceId, SpaceIndex, SpaceRouting}

import scala.beans.BeanProperty

/**
  * Created by IntelliJ IDEA.
  * User: jason
  * Date: 1/20/17
  * Time: 3:57 PM
  */
case class InvestmentReturn(@SpaceId(autoGenerate = true)
                            @BeanProperty
                            var id: String,
                            @SpaceIndex
                            @BeanProperty
                            var timestampMs: Long,
                            @BeanProperty
                            var dateAsStr: String,
                            @BeanProperty
                            @SpaceRouting
                            var tickerSymbol: String,
                            @BeanProperty
                            var percentageRateOfReturn: Double
                           ) {
  def this() = this(null, 0L, null, null, 0D)
}
