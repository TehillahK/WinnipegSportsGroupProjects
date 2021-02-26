# Iteration 1 Worksheet

## Adding a Feature
**Tell the story of how one of your features was added to the project. Provide links to the
feature, user stories, and merge requests (if used), associated tests, and merge commit that was used to complete the feature. Use one or two paragraphs which can have point-form within them.**

[Adding the Currently Playing feature](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/issues/1) was a learning process, because it was also the first feature we added. As described on our GitLab, the features purpose is to show what teams from a certain sport is currently playing. With this idea in mind, we had a few meetings where we brainstormed ideas and drew some rough sketches on a collaborative drawing website. These are the user stories associated with this feature, which helped guide our design:

- [As a sports fan, I want to be able to see who is Currently Playing.](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/issues/2)
- [As a sports fan, I want to see the upcoming games right after the current games have ended.](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/issues/3)

With this in mind, a team member with UI skills came up with a design mockup based on the notes from our brainstorming session. This mockup helped ground our design, as it  gave us a very realistic interpretation of what we brainstormed. This also helped us to understand how we can realize our user stories. We implemented this into the presentation layer, relying a lot on being able to access the data. We did this by having two classes in the business layer, both of which are responsible for fetching game and team data from the persistence layer. The tests we wrote for this feature, were all mostly data validation. This ensures that the business layer is able to successfully fetch valid data for the presentation layer, and account for possible errors for functions with parameters. The tests that helped complete this feature include:

- [AccessTeamsTest.java](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/blob/master/app/src/test/java/comp3350/winSport/tests/business/AccessTeamsTest.java)
- [AccessGamesTest.java](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/blob/master/app/src/test/java/comp3350/winSport/tests/business/AccessGamesTest.java)


## Exceptional code
**Provide a link to a test of exceptional code. In a few sentences,
provide an explanation of why the exception is handled or thrown
in the code you are testing.**

A test with a test for exceptional code can be found in [AccessTeamsTest.java](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/blob/master/app/src/test/java/comp3350/winSport/tests/business/AccessTeamsTest.java), in the test called testTeamByNameException(), the function throws an InvalidNameException if the String passed in the getTeamByName() function contains special characters, numbers, many whitespaces, and trailing/leading whitespaces. The exception is thrown for unexpected input as this can highly affect the internal logic of the program and in future iterations we want to display an error screen to let the user know when something internal has failed. The String passed has to be valid every time as this is part of the logic layer and anything going wrong in this area will affect our presentation layer.

## Branching
**Provide a link to where you describe your branching strategy.**

[Our branching strategy.](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/blob/master/README.md#branching-strategy)

**Provide screenshot of a feature being added using your branching strategy
successfully. The GitLab Graph tool can do this.
as well as using `git log --graph`.**

This is a screenshot of the Currently Playing feature, which resided in the Develop branch, merging into the master branch.

![image of a feature in Develop being merged into master](https://i.imgur.com/daudbHt.png)


## SOLID
**Find a SOLID violation in the project of group `(n%12)+1` (group 12 does group 1).
Open an issue in their project with the violation,
clearly explaining the SOLID violation - specifying the type, provide a link to that issue. Be sure your links in the issues are to **specific commits** (not to `main`, or `develop` as those will be changed). Provide a link to the issue you created here.**

[SOLID violation of Group 7 (Schedule Management App) issue.](https://code.cs.umanitoba.ca/3350-winter-2021-a03/Team-7/-/issues/57)

## Agile Planning
**Write a paragraph about any plans that were changed. Did you
'push' any features to iteration 2? Did you change the description
of any Features or User Stories? Have links to any changed or pushed Features or User Stories.**

We planned to implement three features at the beginning of our iteration. While we have successfully implemented two features, we ultimately decided to push the third feature into Iteration 2 as it involves more dynamic and complex tools to work. Something we found ourselves not having enough time for. In this iteration, we started with the simplest ideas from our brainstorming. We spent more time than anticipated on these features, especially as we had to take the time to set up the app, and found ourselves creating more dev tasks that we anticipated. 

We also found ourselves often rethinking our database implementation, and had to plan our approach in a way where we had to think about where the fake database can exist in our initial architecture. In terms of additional, unexpected dev tasks, this included spending time working on the UI. This included the splash screen and home mat or base, which helped give our app some visual segregation and structure. We thought this was important to implement, as it clearly highlights the features we have implemented. While this was not part of the original dev tasks, we believe it helps the presentation layer to be more understandable. It also serves as a guiding template for how we will approach the presentation layer in the upcoming iterations.

[The pushed feature.](https://code.cs.umanitoba.ca/3350-winter-2021-a03/winnipeg-sports-app-a03-group-6/-/issues/5)

