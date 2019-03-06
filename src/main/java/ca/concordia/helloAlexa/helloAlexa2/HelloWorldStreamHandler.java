package ca.concordia.helloAlexa.helloAlexa2;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

import ca.concordia.helloAlexa.helloAlexa2.handlers.CancelandStopIntentHandler;
import ca.concordia.helloAlexa.helloAlexa2.handlers.HelloWorldIntentHandler;
import ca.concordia.helloAlexa.helloAlexa2.handlers.HelpIntentHandler;
import ca.concordia.helloAlexa.helloAlexa2.handlers.LaunchRequestHandler;
import ca.concordia.helloAlexa.helloAlexa2.handlers.SessionEndedRequestHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {
  
  private static Skill getSkill() {
    return Skills.standard()
          .addRequestHandlers(
                new CancelandStopIntentHandler(),
                new HelloWorldIntentHandler(),
                new HelpIntentHandler(),
                new LaunchRequestHandler(),
                new SessionEndedRequestHandler())
          .withSkillId("amzn1.ask.skill.db38fc55-e66c-4cfe-b11a-a31e52ff3318")
          .build();
  }

  public HelloWorldStreamHandler() {
    super(getSkill());
  }
}
