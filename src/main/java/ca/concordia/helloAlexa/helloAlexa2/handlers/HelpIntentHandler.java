package ca.concordia.helloAlexa.helloAlexa2.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class HelpIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("AMAZON.HelpIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput input) {
    String speechText = "I am here to say Hello World to You";
    return input.getResponseBuilder()
          .withSpeech(speechText)
          .withSimpleCard("HelloWorld", speechText)
          .withReprompt(speechText)
          .build();
  }

}
