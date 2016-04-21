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
      div(className := "mdl-button mdl-js-button mdl-button--fab mdl-button--colored")(
        i(className := "material-icons")( "add")
      ).material


    ReactDOM.render(mdlButton, document.body)
  }


}
