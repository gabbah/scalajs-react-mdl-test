package tutorial.webapp

import japgolly.scalajs.react.{ReactDOM, React, ReactElement}
import org.scalajs.dom.document

import scala.scalajs.js.JSApp
//import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.vdom.all._

import com.payalabs.scalajs.react.mdl.MaterialAble



object TutorialApp extends JSApp {
  override def main(): Unit = {
    val mdlButton =
      button(className := "mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent")(
        "add"
      ).material


    ReactDOM.render(mdlButton, document.body)
  }


}
