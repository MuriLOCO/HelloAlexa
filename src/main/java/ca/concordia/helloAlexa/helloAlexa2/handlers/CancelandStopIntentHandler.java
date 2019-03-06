package ca.concordia.helloAlexa.helloAlexa2.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class CancelandStopIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    String speechText = "Bye Bye";
    return input.getResponseBuilder()
          .withSpeech(speechText)
          .withSimpleCard("HelloWorld", speechText)
          .build();
  }

}
