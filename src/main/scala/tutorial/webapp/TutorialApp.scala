package tutorial.webapp

import japgolly.scalajs.react.{ReactComponentB, ReactDOM, React, ReactElement}
import org.scalajs.dom.document

import scala.scalajs.js.JSApp
import japgolly.scalajs.react.vdom.all._

import com.payalabs.scalajs.react.mdl.MaterialAble



object TutorialApp extends JSApp {
  override def main(): Unit = {

    // Numeric Textfield with Floating Label
    val mdlNumberInput = form(
        div(className := "mdl-textfield mdl-js-textfield mdl-textfield--floating-label",
          input(className := "mdl-textfield__input", `type` := "number", id := "sample4"),
            label(className := "mdl-textfield__label", `for` := "sample4")("Number..."),
            span(className := "mdl-textfield__error")("Input is not a number!")
          )
      )

    val card = div(Seq(marginLeft := "40%", marginTop := "100px"), className := "demo-card-square mdl-card mdl-shadow--2dp",
      div(className := "mdl-card__title mdl-card--expand",
        h2(className := "mdl-card__title-text")("Update")
      ),
      div(className := "mdl-card__supporting-text")(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        mdlNumberInput
      ),
      div(className := "mdl-card__actions mdl-card--border",
        a(className := "mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect")(
          "View Updates"
        )
      )
    ).material

    ReactDOM.render(card, document.body)
  }


}

object Components {
  val Hello =
    ReactComponentB[String]("Hello")
      .render_P(name => div("Hello there ", name))
      .build
}