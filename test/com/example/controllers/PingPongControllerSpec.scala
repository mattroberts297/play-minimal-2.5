package com.example.controllers

import org.scalatest._
import play.api.test.Helpers._
import play.api.test._

import scala.concurrent._

class PingPongControllerSpec extends WordSpec with MustMatchers {
  "The PingPongController" must {
    "return pong" in {
      val controller = new PingPongController
      val pong = contentAsString(controller.ping(FakeRequest()))
      pong mustBe "pong"
    }
  }
}
