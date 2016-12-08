package com.example.controllers

import play.api.mvc.{Action, Controller}

class PingPongController extends Controller {
  def ping = Action {
    Ok("pong")
  }
}
