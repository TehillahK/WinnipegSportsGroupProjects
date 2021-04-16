# Iteration 3 Worksheet
## What technical debt has been cleaned up?

Show links to a commit where you paid off technical debt. Write 2-5 sentences that explain what debt was paid, and what its classification is.

https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/commit/0a2132ab7a0e0231c8727ed5a8410b87ba7fd1c7

https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/commit/549ef5c0f7e21c735a594f1c59ec15f08c87f8e4

In these two commits we are adjusting our menu, increasing its flexibility and greatly reducing the amount of code. We were fixing a violation of the open-closed principle from iteration 2. Our previous design was poor because in order to add new features to our menu activity we would have to copy and paste a few different times, not being open to adding functionality (something we knew in advance we would be doing). Having spent 1-2 hours reworking the layout was the payment of the debt. I would classify this debt as inadvertent/prudent as we now know how we should have designed the menu class, while using a less sophisticated version was necessary to get our app running when we had fewer features.

## What technical debt did you leave?
What one item would you like to fix and can’t? Anything you write will not be marked negatively. Classify this debt.

Given the features we chose to implement for our app, we are displaying a lot of sports data. Android studio provides a great way to implement lists with the recycler view, which you can extend to create your own custom recycler view. Most of our features in one way or another use a recycler view, and so we ended up with a lot of implementations. While some are necessarily distinct, as we got more comfortable with android studio we started reusing assets more. Now looking back at some of our features, we could have reused a few recycler view adapters had we designed them to be more flexible. While creating another adapter seemed the easier path at the start of the project, reuse of our recycler views is better design and less code duplication. I would classify this as somewhere between inadvertent reckless and prudent favoring prudent, as our app still behaves as we intended but probably uses more code than necessary.

## Discuss a feature or user story that was cut/re-prioritized
When did you change the priority of a feature or user story? Why was it re-prioritized? Provide a link to the feature or user story. This can be from any iteration.

We changed the priority of the Track live game feature at the end of iteration 1, from high priority to medium priority. It was re-prioritized because we had not done enough research to integrate the live data into our application by using an API in iteration 1, we re-prioritized and move the feature to the subsequent iteration.

https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/issues/5

## Acceptance test/end-to-end
Write a discussion about an end-to-end test that you wrote. What did you test, how did you set up the test so it was not flaky? Provide a link to that test.

## Acceptance test, untestable
What challenges did you face when creating acceptance tests? What was difficult or impossible to test?

###### _Draft notes for myself_
- Cannot really test search function thoroughly, cannot do full interaction, can only search and view
- Espresso is not very intuitive and a lot of doc reading

## Velocity/teamwork
Did your estimates get better or worse through the course? Show some evidence of the estimates/actuals from tasks.

Yes, our estimates got better through the course. At the beginning of iteration 1, we committed to more features than we can complete. We were able to complete more work in iteration 2 and we completed all planned work for iteration 3.

![Picture showing our project velocity graph](https://i.imgur.com/mgl3TNV.png)
