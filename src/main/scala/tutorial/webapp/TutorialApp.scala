package tutorial.webapp

import japgolly.scalajs.react.{ReactDOM, React, ReactElement}
import org.scalajs.dom.document

import scala.scalajs.js.JSApp
//import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.vdom.all._

import com.payalabs.scalajs.react.mdl.MaterialAble



object TutorialApp extends JSApp {
  override def main(): Unit = {
    val button =
      div(className := "mdl-button mdl-js-button mdl-button--fab mdl-button--colored")(
        i(className := "material-icons")( "add")
      ).material

    val stuff: ReactElement = html(
      head,
      body(
        div(
          h1("this is title"),
          button
        )
      )
    )
    ReactDOM.render(stuff, document.body)
  }


}
