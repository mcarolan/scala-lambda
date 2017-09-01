package net.mcarolan

import com.amazonaws.services.lambda.runtime.Context
import io.github.yeghishe.lambda.Handler
import io.circe.generic.auto._

case class Name(value: String)

case class Greeting(value: String)

class HelloHandler extends Handler[Name, Greeting] {

  override protected def handler(input: Name, context: Context): Greeting =
    Greeting(s"Hello, ${input.value}!")

}

